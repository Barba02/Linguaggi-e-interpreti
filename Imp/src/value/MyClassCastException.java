package value;

public class MyClassCastException extends ClassCastException {
    public void errExit(String type, int line, int column, String msg) {
        System.err.println("Type mismatch exception");
        System.err.println("@" + line + ":" + column);
        System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.err.println(msg);
        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.err.println("> " + type + " expression expected");
        System.exit(1);
    }
}
