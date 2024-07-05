import java.util.List;
import java.util.HashMap;

public class IntExp extends IntExpBaseVisitor<Double> {
    private final HashMap<String, Double> env = new HashMap<>();

    @Override
    public Double visitMain(IntExpParser.MainContext ctx) {
        visit(ctx.init());
        return visit(ctx.exp());
    }

    @Override
    public Double visitInitialize(IntExpParser.InitializeContext ctx) {
        int index = 0;
        List<IntExpParser.ExpContext> expList = ctx.exp();
        for (IntExpParser.ExpContext e : expList) {
            String key = ctx.ID(index).getText();
            Double value = visit(e);
            env.put(key, value);
            index++;
        }
        return null;
    }

    @Override
    public Double visitId(IntExpParser.IdContext ctx) {
        return env.getOrDefault(ctx.ID().getText(), 0.0);
    }

    @Override
    public Double visitNumber(IntExpParser.NumberContext ctx) {
        return Double.parseDouble(ctx.NUM().getText());
    }

    @Override
    public Double visitSubExp(IntExpParser.SubExpContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Double visitPower(IntExpParser.PowerContext ctx) {
        return Math.pow(visit(ctx.exp(0)), visit(ctx.exp(1)));
    }

    @Override
    public Double visitMulDivMod(IntExpParser.MulDivModContext ctx) {
        Double n1 = visit(ctx.exp(0));
        Double n2 = visit(ctx.exp(1));
        if (ctx.op.getType() == IntExpParser.MUL)
            return n1 * n2;
        else if (ctx.op.getType() == IntExpParser.DIV)
            return n1 / n2;
        return n1 % n2;
    }

    @Override
    public Double visitAddSub(IntExpParser.AddSubContext ctx) {
        Double n1 = visit(ctx.exp(0));
        Double n2 = visit(ctx.exp(1));
        if (ctx.op.getType() == IntExpParser.ADD)
            return n1 + n2;
        return n1 - n2;
    }
}
