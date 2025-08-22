package Pareja_rodriguez_martinez.reto4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {
    public static Hashtable<String, Integer> createHashTable(List<AbstractMap.SimpleEntry<String, Integer>> lista) {
        Hashtable<String, Integer> tabla = new Hashtable<>();

        lista.stream().forEach(par -> tabla.putIfAbsent(par.getKey(), par.getValue()));

        return tabla;
    }

    public static Map<String,Integer> unifyMaps(HashMap<String,Integer> hashMapToUnify, Hashtable<String,Integer> hashTableToUnify){
        return Stream.concat(hashMapToUnify.entrySet().stream(), hashTableToUnify.entrySet().stream()).
                collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2,
                        HashMap::new
                ));
    }
    public static HashMap<String,Integer> saveInHashMap(List<Object[]> listToSave){
        return listToSave.stream()
                .collect(Collectors.toMap(
                        arr -> (String) arr[0],
                        arr -> (Integer) arr[1],
                        (v1, v2) -> v1,
                        HashMap::new
                ));
    }

    public static Map<String, Integer> sortHashTable(Hashtable<String, Integer> tabla) {
        return tabla.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        LinkedHashMap::new
                ));
    }
}