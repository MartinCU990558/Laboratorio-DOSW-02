import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Reto4 {

    static class KV {
        private final String key;
        private final Integer value;

        public KV(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return this.key;
        }

        public Integer getValue() {
            return this.value;
        }
    }

    public static Hashtable<String, Integer> buildHashtableIgnoringDuplicatesFirst(List<KV> pairs) {
        Hashtable<String, Integer> table = new Hashtable<>();
        pairs.forEach(p -> table.putIfAbsent(p.getKey(), p.getValue()));
        return table;
    }

    public static HashMap<String, Integer> buildHashMapIgnoringDuplicatesFirst(List<KV> pairs) {
        HashMap<String, Integer> map = new HashMap<>();

        pairs.forEach(p -> map.putIfAbsent(p.getKey(), p.getValue()));
        return map;
    }
}