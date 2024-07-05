import java.util.List;
import java.util.HashMap;

public class Conf {
    private final HashMap<String, Integer> map;

        public Conf(List<String> ids, List<Integer> values) {
        map = new HashMap<>();
        for (int i = 0; i < ids.size(); i++)
            map.put(ids.get(i), (i < values.size()) ? values.get(i) : null);
    }

    public boolean contains(String key) {
        return map.containsKey(key);
    }

    public Integer get(String id) {
        return map.get(id);
    }

    public void put(String id, Integer value) {
        map.put(id, value);
    }
}
