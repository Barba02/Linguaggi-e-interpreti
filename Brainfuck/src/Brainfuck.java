import java.util.Scanner;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;

class Tape {
    private final ArrayList<Byte>[] tape;
    private int externalIndex, listIndex, indexInList;

    @SuppressWarnings("unchecked")
    public Tape() {
        listIndex = 1;
        indexInList = 0;
        externalIndex = 0;
        tape = (ArrayList<Byte>[]) new ArrayList[2];
        for (int i = 0; i < tape.length; i++)
            tape[i] = new ArrayList<>();
        tape[listIndex].add(indexInList, (byte) 0);
    }
    private void adjustIndexes() {
        if (externalIndex >= 0) {
            listIndex = 1;
            indexInList = externalIndex;
        }
        else {
            listIndex = 0;
            indexInList = -externalIndex + 1;
        }
        while (indexInList >= tape[listIndex].size())
            tape[listIndex].add((byte) 0);
    }
    public void move(int leftOrRight) {
        externalIndex += leftOrRight;
        adjustIndexes();
    }
    public void modify(int decrementOrIncrement) {
        Byte value = (byte) (tape[listIndex].get(indexInList) + decrementOrIncrement);
        tape[listIndex].set(indexInList, value);
    }
    public Byte read() {
        return tape[listIndex].get(indexInList);
    }
    public void write(Byte value) {
        tape[listIndex].set(indexInList, value);
    }
}

public class Brainfuck extends BrainfuckBaseVisitor<Byte> {
    private final Tape t = new Tape();

    @Override
    public Byte visitMain(BrainfuckParser.MainContext ctx) {
        return visit(ctx.com());
    }

    @Override
    public Byte visitMoveLeft(BrainfuckParser.MoveLeftContext ctx) {
        t.move(-1);
        return visit(ctx.com());
    }

    @Override
    public Byte visitMoveRight(BrainfuckParser.MoveRightContext ctx) {
        t.move(1);
        return visit(ctx.com());
    }

    @Override
    public Byte visitDecrement(BrainfuckParser.DecrementContext ctx) {
        t.modify(-1);
        return visit(ctx.com());
    }

    @Override
    public Byte visitIncrement(BrainfuckParser.IncrementContext ctx) {
        t.modify(1);
        return visit(ctx.com());
    }

    @Override
    public Byte visitInput(BrainfuckParser.InputContext ctx) {
        t.write(new Scanner(System.in).nextLine().getBytes(StandardCharsets.US_ASCII)[0]);
        return visit(ctx.com());
    }

    @Override
    public Byte visitOutput(BrainfuckParser.OutputContext ctx) {
        System.out.print(new String(new byte[]{t.read()}, StandardCharsets.US_ASCII));
        return visit(ctx.com());
    }

    @Override
    public Byte visitLoop(BrainfuckParser.LoopContext ctx) {
        while (t.read() != 0) {
            visit(ctx.com(0));
        }
        return visit(ctx.com(1));
    }

    @Override
    public Byte visitNil(BrainfuckParser.NilContext ctx) {
        return super.visitNil(ctx);
    }
}
