package value;

import java.util.Objects;
import java.util.ArrayList;

public class Element {
    private final Object simpleElement;
    private final ArrayList<Object> arrayElement;
    private final ArrayList<Integer> validIndexes;

    public Element() {
        this(null);
    }

    public Element(Object simpleElement) {
        this(simpleElement, new ArrayList<>(), new ArrayList<>());
    }

    public Element(Object simpleElement, ArrayList<Object> arrayElement, ArrayList<Integer> validIndexes) {
        this.simpleElement = simpleElement;
        this.arrayElement = arrayElement;
        this.validIndexes = validIndexes;
    }

    public Object getValue() {
        if (simpleElement == null)
            throw new MyClassCastException();
        return simpleElement;
    }

    public Object getValue(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= arrayElement.size() || !validIndexes.contains(index))
            throw new IndexOutOfBoundsException();
        return arrayElement.get(index);
    }

    public void setValue(int index, Object value) {
        if (index < arrayElement.size())
            arrayElement.set(index, value);
        else {
            while (index > arrayElement.size())
                arrayElement.add(null);
            arrayElement.add(value);
        }
        validIndexes.add(index);
    }

    public String toString() {
        if (simpleElement != null)
            return simpleElement.toString();
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < arrayElement.size(); i++) {
            if (validIndexes.contains(i)) {
                if (arrayElement.get(i) instanceof StringValue)
                    s.append("\"").append(arrayElement.get(i).toString()).append("\"");
                else
                    s.append(arrayElement.get(i).toString());
            }
            if (i < arrayElement.size() - 1)
                s.append(", ");
        }
        return s.append("]").toString();
    }

    public Element getCopy() {
        if (simpleElement != null)
            return new Element(simpleElement);
        return new Element(null, (ArrayList<Object>) arrayElement.clone(), (ArrayList<Integer>) validIndexes.clone());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element element)) return false;
        return Objects.equals(simpleElement, element.simpleElement) && Objects.equals(arrayElement, element.arrayElement) && Objects.equals(validIndexes, element.validIndexes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simpleElement, arrayElement, validIndexes);
    }
}
