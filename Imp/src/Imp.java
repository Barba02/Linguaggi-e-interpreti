import value.*;

class IdentifierNotFoundException extends Exception {
    public void errExit(String id) {
        System.err.println("Identifier " + id + " used but never instantiated");
        System.exit(1);
    }
}

public class Imp extends ImpBaseVisitor<Element> {
    private final Conf conf;

    public Imp(Conf conf) {
        this.conf = conf;
    }

    private ComValue visitCom(ImpParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private boolean visitBoolExp(ImpParser.ExpContext ctx) {
        try {
            return (Boolean) visit(ctx).getValue();
        }
        catch (MyClassCastException e) {
            e.errExit("Boolean", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());
        }
        return false;
    }

    private int visitNatExp(ImpParser.ExpContext ctx) {
        try {
            return (Integer) visit(ctx).getValue();
        }
        catch (MyClassCastException e) {
            e.errExit("Natural", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());
        }
        return 0;
    }

    private String visitStringExp(ImpParser.ExpContext ctx) {
        try {
            return (String) visit(ctx).getValue();
        }
        catch (MyClassCastException e) {
            e.errExit("String", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());
        }
        return null;
    }

    @Override
    public ComValue visitMain(ImpParser.MainContext ctx) {
        return visitCom(ctx.com());
    }

    @Override
    public ComValue visitIf(ImpParser.IfContext ctx) {
        return visitBoolExp(ctx.exp()) ? visitCom(ctx.com(0)) : visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitInitVar(ImpParser.InitVarContext ctx) {
        String id = ctx.ID().getText();
        Element val = visit(ctx.exp()).getCopy();
        conf.put(id, val);
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitInitArray(ImpParser.InitArrayContext ctx) {
        String id = ctx.ID().getText();
        int index = visitNatExp(ctx.exp(0));
        Element val = visit(ctx.exp(1));
        Element arr = (conf.contains(id)) ?
                conf.get(id) :
                new Element();
        arr.setValue(index, val);
        conf.put(id, arr);
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(ImpParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSeq(ImpParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        return visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitWhile(ImpParser.WhileContext ctx) {
        while (visitBoolExp(ctx.exp()))
            visitCom(ctx.com());
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitOut(ImpParser.OutContext ctx) {
        System.out.println(visitStringExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public NatValue visitNatural(ImpParser.NaturalContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BoolValue visitBoolean(ImpParser.BooleanContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public StringValue visitString(ImpParser.StringContext ctx) {
        String s = ctx.STRING().getText();
        s = s.substring(1, s.length() - 1);
        int index = s.indexOf('\\');
        if (index != -1) {
            String replacement = switch (s.charAt(index+1)) {
                case '\\' -> "\\";
                case 't' -> "\t";
                case 'b' -> "\b";
                case 'n' -> "\n";
                case 'r' -> "\r";
                case 'f' -> "\f";
                default -> "\"";
            };
            s = s.substring(0, index) + replacement + s.substring(index+2);
        }
        return new StringValue(s);
    }

    @Override
    public BoolValue visitEqual(ImpParser.EqualContext ctx) {
        Element left = visit(ctx.exp(0));
        Element right = visit(ctx.exp(1));
        if (ctx.op.getType() == ImpParser.EQ)
            return new BoolValue(left.equals(right));
        return new BoolValue(!left.equals(right));  // NEQ
    }

    @Override
    public BoolValue visitLogic(ImpParser.LogicContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));
        if (ctx.op.getType() == ImpParser.AND)
            return new BoolValue(left && right);
        return new BoolValue(left || right);
    }

    @Override
    public BoolValue visitCompare(ImpParser.CompareContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));
        if (ctx.op.getType() == ImpParser.LT)
            return new BoolValue(left < right);
        else if (ctx.op.getType() == ImpParser.LEQ)
            return new BoolValue(left <= right);
        else if (ctx.op.getType() == ImpParser.GEQ)
            return new BoolValue(left >= right);
        return new BoolValue(left > right);
    }

    @Override
    public BoolValue visitNot(ImpParser.NotContext ctx) {
        return new BoolValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public ExpValue<?> visitSubExp(ImpParser.SubExpContext ctx) {
        return (ExpValue<?>) visit(ctx.exp());
    }

    @Override
    public NatValue visitPower(ImpParser.PowerContext ctx) {
        int n1 = visitNatExp(ctx.exp(0));
        int n2 = visitNatExp(ctx.exp(1));
        return new NatValue((int) Math.pow(n1, n2));
    }

    @Override
    public NatValue visitMulDivMod(ImpParser.MulDivModContext ctx) {
        int n1 = visitNatExp(ctx.exp(0));
        int n2 = visitNatExp(ctx.exp(1));
        if (ctx.op.getType() == ImpParser.MUL)
            return new NatValue(n1 * n2);
        else if (ctx.op.getType() == ImpParser.DIV)
            return new NatValue(n1 / n2);
        return new NatValue(n1 % n2);
    }

    @Override
    public NatValue visitAddSub(ImpParser.AddSubContext ctx) {
        int n1 = visitNatExp(ctx.exp(0));
        int n2 = visitNatExp(ctx.exp(1));
        if (ctx.op.getType() == ImpParser.ADD)
            return new NatValue(n1 + n2);
        return new NatValue(n1 - n2);
    }

    @Override
    public Element visitId(ImpParser.IdContext ctx) {
        return conf.get(ctx.ID().getText());
    }

    @Override
    public ExpValue<?> visitArray(ImpParser.ArrayContext ctx) {
        String id = ctx.ID().getText();
        if (!conf.contains(id))
            new IdentifierNotFoundException().errExit(id);
        Element arr = conf.get(id);
        int index = visitNatExp(ctx.exp());
        try {
            return (ExpValue<?>) arr.getValue(index);
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Array position " + index + " doesn't exists");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        return null;
    }

    @Override
    public StringValue visitToString(ImpParser.ToStringContext ctx) {
        return new StringValue(visit(ctx.exp()).toString());
    }

    @Override
    public StringValue visitConcatString(ImpParser.ConcatStringContext ctx) {
        String left = visitStringExp(ctx.exp(0));
        String right = visitStringExp(ctx.exp(1));
        return new StringValue(left + right);
    }
}
