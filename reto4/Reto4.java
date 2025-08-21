import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Reto4 {

    public static Hashtable<String, Integer> buildHashtableIgnoringDuplicatesFirst(List<KV> pairs) {
        Hashtable<String, Integer> table = new Hashtable<>();
        pairs.forEach(p -> table.putIfAbsent(p.getKey(), p.getValue()));
        return table;
    }
}