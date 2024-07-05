package value;

public class ComValue extends Element {
    public static final ComValue INSTANCE = new ComValue();

    private ComValue() {
        super(null);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ComValue;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
