import value.Element;
import java.util.HashMap;

public class Conf {
    private final HashMap<String, Element> map;

    public Conf() {
        map = new HashMap<>();
    }

    public boolean contains(String key) {
        return map.containsKey(key);
    }

    public Element get(String id) {
        return map.get(id);
    }

    public void put(String id, Element value) {
        map.put(id, value);
    }
}
