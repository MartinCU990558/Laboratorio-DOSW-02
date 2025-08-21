import java.util.*;

public class TesoroMapasA {

    public static Map<String, Integer> buildHashMapFirstWins(List<Map.Entry<String, Integer>> pairs) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> e : pairs) {
            map.putIfAbsent(e.getKey(), e.getValue());
        }
        return map;
    }

    public static Map<String, Integer> combinarMapas(Map<String, Integer> hashMap,
                                                     Map<String, Integer> hashTable) {
        Map<String, Integer> combined = new HashMap<>(hashMap);
        hashTable.forEach(combined::put);
        return combined;
    }

    public static void printUppercased(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println("Clave: " + k.toUpperCase() + " | Valor: " + v));
    }
}
