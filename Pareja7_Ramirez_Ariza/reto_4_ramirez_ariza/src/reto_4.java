import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reto_4 {
    public static Map<String, Integer> storeUniqueKeys(List<SimpleEntry<String, Integer>> entries) {
        Map<String, Integer> result = new HashMap<>();

        for (SimpleEntry<String, Integer> entry : entries) {
            result.putIfAbsent(entry.getKey(), entry.getValue());
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
        ;
        System.out.println(storeUniqueKeys(input));
    }
}