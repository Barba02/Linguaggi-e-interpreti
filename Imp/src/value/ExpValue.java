package value;

public abstract class ExpValue<T> extends Element {
    private final T value;

    public ExpValue(T value) {
        super(value);
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public T getValue() {
        return value;
    }
}
