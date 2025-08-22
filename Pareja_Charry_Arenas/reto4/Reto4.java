package Pareja_Charry_Arenas.reto4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {

    public static Map<String, Integer> buildHashMapFirstWins(List<Map.Entry<String, Integer>> pairs) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> e : pairs) {
            map.putIfAbsent(e.getKey(), e.getValue());
        }
        return map;
    }

    public static Hashtable<String, Integer> buildHashtableFirstWins(List<Map.Entry<String, Integer>> pairs) {
        Hashtable<String, Integer> table = new Hashtable<>();
        for (Map.Entry<String, Integer> e : pairs) {
            if (!table.containsKey(e.getKey())) {
                table.put(e.getKey(), e.getValue());
            }
        }
        return table;
    }

    public static Map<String, Integer> combinarImprimirFinal(Map<String, Integer> hashMap,
                                                             Map<String, Integer> hashTable) {

        Map<String, Integer> combined =
                Stream.concat(hashMap.entrySet().stream(), hashTable.entrySet().stream())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (left, right) -> right
                        ));

        Map<String, Integer> finalOrdered =
                combined.entrySet().stream()
                        .map(e -> Map.entry(e.getKey().toUpperCase(Locale.ROOT), e.getValue()))
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (a, b) -> a,
                                LinkedHashMap::new
                        ));

        finalOrdered.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));

        return finalOrdered;
    }

    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> ejemplo = new ArrayList<>();
        ejemplo.add(new AbstractMap.SimpleEntry<>("a", 1));
        ejemplo.add(new AbstractMap.SimpleEntry<>("b", 2));
        ejemplo.add(new AbstractMap.SimpleEntry<>("a", 3));

        Map<String, Integer> hashMap = buildHashMapFirstWins(ejemplo);
        hashMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        Hashtable<String, Integer> hashTable = buildHashtableFirstWins(ejemplo);
        hashTable.forEach((k, v) -> System.out.println(k + " -> " + v));

        combinarImprimirFinal(hashMap, hashTable);
    }
}
