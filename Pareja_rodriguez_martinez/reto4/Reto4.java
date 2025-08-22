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
}