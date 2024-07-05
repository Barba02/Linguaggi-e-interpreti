import java.util.List;
import java.util.Stack;
import java.util.HashMap;
import java.util.ArrayList;
import org.antlr.v4.runtime.tree.ParseTree;

class Function {
    private Conf env = null;
    private final ParseTree com;
    private final boolean isVoid;
    private final List<String> args;
    public Function(ParseTree com, boolean isVoid, List<String> args) {
        this.com = com;
        this.args = args;
        this.isVoid = isVoid;
    }
    public Conf getEnv() {
        return env;
    }
    public void setEnv(List<Integer> values) {
        env = new Conf(args, values);
    }
    public ParseTree getCom() {
        return com;
    }
    public boolean isVoid() {
        return isVoid;
    }
}

public class ArnoldC extends ArnoldCBaseVisitor<Integer> {
    private Integer modVal = null;
    private final Stack<String> stack = new Stack<>();
    private final HashMap<String, Function> functions = new HashMap<>();

    private void setVar(String id, Integer value) {
        String funName = stack.peek();
        Conf env = functions.get(funName).getEnv();
        env.put(id, value);
    }

    private Integer getVar(String id) {
        String funName = stack.peek();
        Conf env = functions.get(funName).getEnv();
        return env.get(id);
    }

    @Override
    public Integer visitMain(ArnoldCParser.MainContext ctx) {
        for (ArnoldCParser.FunDeclareContext f : ctx.funDeclare())
            visitFunDeclare(f);
        Function f = new Function(null, true, new ArrayList<>());
        f.setEnv(new ArrayList<>());
        functions.put("main", f);
        stack.push("main");
        visit(ctx.com());
        return null;
    }

    @Override
    public Integer visitFunDeclare(ArnoldCParser.FunDeclareContext ctx) {
        String id = ctx.ID(0).getText();
        List<String> args = ctx.ID()
                .stream()
                .skip(1)
                .map(ParseTree::getText)
                .toList();
        boolean isVoid = ctx.NONVOID() == null;
        functions.put(id, new Function(ctx.com(), isVoid, args));
        return null;
    }

    @Override
    public Integer visitFunCall(ArnoldCParser.FunCallContext ctx) {
        String id = ctx.ID().getText();
        Function f = functions.get(id);
        f.setEnv(ctx.exp()
                .stream()
                .map(this::visit)
                .toList());
        stack.push(id);
        Integer retVal = null;
        if (!f.isVoid())
            retVal = visit(f.getCom());
        else
            visit(f.getCom());
        stack.pop();
        return retVal;
    }

    @Override
    public Integer visitCallFunction(ArnoldCParser.CallFunctionContext ctx) {
        visit(ctx.funCall());
        return null;
    }

    @Override
    public Integer visitReturn(ArnoldCParser.ReturnContext ctx) {
        return (ctx.exp() == null) ? null : visit(ctx.exp());
    }

    @Override
    public Integer visitAssignByCall(ArnoldCParser.AssignByCallContext ctx) {
        setVar(ctx.ID().getText(), visit(ctx.funCall()));
        return null;
    }

    @Override
    public Integer visitDeclare(ArnoldCParser.DeclareContext ctx) {
        setVar(ctx.ID().getText(), visit(ctx.exp()));
        return null;
    }

    @Override
    public Integer visitInteger(ArnoldCParser.IntegerContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Integer visitBoolean(ArnoldCParser.BooleanContext ctx) {
        return (ctx.val.getType() == ArnoldCParser.TRUE) ? 1 : 0;
    }

    @Override
    public Integer visitId(ArnoldCParser.IdContext ctx) {
        return getVar(ctx.ID().getText());
    }

    @Override
    public Integer visitPrintVal(ArnoldCParser.PrintValContext ctx) {
        System.out.println(visit(ctx.exp()));
        return null;
    }

    @Override
    public Integer visitPrintString(ArnoldCParser.PrintStringContext ctx) {
        String str = ctx.STRING().getText();
        str = str.substring(1, str.length()-1);
        System.out.println(str);
        return null;
    }

    @Override
    public Integer visitConcatCom(ArnoldCParser.ConcatComContext ctx) {
        visit(ctx.com(0));
        return visit(ctx.com(1));
    }

    @Override
    public Integer visitWhile(ArnoldCParser.WhileContext ctx) {
        while (visit(ctx.exp()) == 1)
            visit(ctx.com());
        return null;
    }

    @Override
    public Integer visitIf(ArnoldCParser.IfContext ctx) {
        if (visit(ctx.exp()) == 1)
            visit(ctx.com(0));
        else if (ctx.com().size() > 1)
            visit(ctx.com(1));
        return null;
    }

    @Override
    public Integer visitModify(ArnoldCParser.ModifyContext ctx) {
        String id = ctx.ID().getText();
        modVal = (ctx.exp() != null) ? visit(ctx.exp()) : getVar(id);
        for (ArnoldCParser.OpsContext oc : ctx.ops())
            modVal = visit(oc);
        setVar(id, modVal);
        return null;
    }

    @Override
    public Integer visitArithmetic(ArnoldCParser.ArithmeticContext ctx) {
        int n = visit(ctx.exp());
        if (ctx.op.getType() == ArnoldCParser.MUL)
            return modVal * n;
        else if (ctx.op.getType() == ArnoldCParser.DIV)
            return modVal / n;
        else if (ctx.op.getType() == ArnoldCParser.MOD)
            return modVal % n;
        else if (ctx.op.getType() == ArnoldCParser.ADD)
            return modVal + n;
        return modVal - n;
    }

    @Override
    public Integer visitLogical(ArnoldCParser.LogicalContext ctx) {
        int n = visit(ctx.exp());
        if (ctx.op.getType() == ArnoldCParser.EQ)
            return (modVal == n) ? 1 : 0;
        else if (ctx.op.getType() == ArnoldCParser.GT)
            return (modVal > n) ? 1 : 0;
        else if (ctx.op.getType() == ArnoldCParser.AND)
            return (modVal >= 1 && n >= 1) ? 1 : 0;
        return (modVal >= 1 || n >= 1) ? 1 : 0;
    }
}
