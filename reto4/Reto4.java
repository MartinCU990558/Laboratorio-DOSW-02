import java.util.*;

public class TesoroMapasB {
    public static Hashtable<String, Integer> buildHashtableFirstWins(List<Map.Entry<String, Integer>> pairs) {
        Hashtable<String, Integer> table = new Hashtable<>();
        for (Map.Entry<String, Integer> e : pairs) {
            if (!table.containsKey(e.getKey())) {
                table.put(e.getKey(), e.getValue());
            }
        }
        return table;
    }

    public static Map<String, Integer> combinarMapas(Map<String, Integer> hashMap, Map<String, Integer> hashTable) {
        Map<String, Integer> combined = new HashMap<>(hashMap);
        hashTable.forEach(combined::put);
        return combined;
    }
    public static void printSorted(Map<String, Integer> map) {
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }
}

