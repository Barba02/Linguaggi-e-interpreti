import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        InputStream is = cl.getResourceAsStream(args[0]);
        CharStream cs = CharStreams.fromStream(is);
        ArnoldCLexer lexer = new ArnoldCLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArnoldCParser parser = new ArnoldCParser(tokens);
        ParseTree tree = parser.main();
        ArnoldC interpreter = new ArnoldC();
        interpreter.visit(tree);
    }
}
