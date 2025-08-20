import java.util.AbstractMap.SimpleEntry;
import java.util.Hashtable;
import java.util.List;

public static Hashtable<String, Integer> storeUniqueKeys(List<SimpleEntry<String, Integer>> entries) {
    Hashtable<String, Integer> result = new Hashtable<>();
    for (SimpleEntry<String, Integer> entry : entries) {
        if (!result.containsKey(entry.getKey())) {
            result.put(entry.getKey(), entry.getValue());
        }
    }
    return result;
}

public static void main(String[] args) {
    List<SimpleEntry<String, Integer>> input = List.of(
            new SimpleEntry<>("A", 1),
            new SimpleEntry<>("B", 2),
            new SimpleEntry<>("A", 3),
            new SimpleEntry<>("C", 4)
    );
    Hashtable<String, Integer> output = storeUniqueKeys(input);
    System.out.println(output);
}