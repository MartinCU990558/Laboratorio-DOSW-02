import java.util.*;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reto_4 {
    public static Map<String, Integer> storeUniqueKeysMap(List<SimpleEntry<String, Integer>> entries) {
        Map<String, Integer> result = new HashMap<>();
        for (SimpleEntry<String, Integer> entry : entries) {
            result.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static Hashtable<String, Integer> storeUniqueKeysTable(List<SimpleEntry<String, Integer>> entries) {
        Hashtable<String, Integer> result = new Hashtable<>();
        for (SimpleEntry<String, Integer> entry : entries) {
            if (!result.containsKey(entry.getKey())) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>();
        mergedMap.putAll(map2);
        mergedMap.putAll(map1);
        return mergedMap;
    }

    public static Map<String, Integer> sortMapByKeyAscending(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public static Map<String, Integer> upperCaseKeys(Map<String, Integer> map) {
        Map<String, Integer> result = new HashMap<>();
        map.entrySet().stream()
                .map(entry -> Map.entry(entry.getKey().toUpperCase(), entry.getValue()))
                .forEach(entry -> result.putIfAbsent(entry.getKey(), entry.getValue()));

        return result;
    }

    public static Map<String, Integer> combineAndTransform(
            Map<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable
    ) {
        return Stream.concat(hashMap.entrySet().stream(), hashTable.entrySet().stream())
                .map(entry -> Map.entry(entry.getKey().toUpperCase(), entry.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (hashMapValue, hashTableValue) -> hashTableValue, // Prioriza Hashtable
                        LinkedHashMap::new
                ))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        LinkedHashMap::new
                ));
    }

    public static void main(String[] args) {
        List<SimpleEntry<String, Integer>> input1 = List.of(
                new SimpleEntry<>("oro", 5),
                new SimpleEntry<>("plata", 2),
                new SimpleEntry<>("oro", 7),
                new SimpleEntry<>("diamante", 10)
        );
        List<SimpleEntry<String, Integer>> input2 = List.of(
                new SimpleEntry<>("plata", 8),
                new SimpleEntry<>("rubí", 4),
                new SimpleEntry<>("oro", 12),
                new SimpleEntry<>("esmeralda", 6)
        );
        System.out.println(storeUniqueKeysMap(input1));
        System.out.println(storeUniqueKeysTable(input1));
        System.out.println(mergeMaps(storeUniqueKeysMap(input1), storeUniqueKeysTable(input2)));
        System.out.println(upperCaseKeys(storeUniqueKeysMap(input1)));
        System.out.println(sortMapByKeyAscending(storeUniqueKeysTable(input1)));

        Map<String, Integer> hashMap = storeUniqueKeysMap(input1);
        Hashtable<String, Integer> hashTable = storeUniqueKeysTable(input2);

        Map<String, Integer> finalResult = combineAndTransform(hashMap, hashTable);
        System.out.println(finalResult);
    }
}