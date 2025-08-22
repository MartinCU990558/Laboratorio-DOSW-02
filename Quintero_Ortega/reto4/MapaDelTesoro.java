package Quintero_Ortega.reto4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MapaDelTesoro {

    public static HashMap<String,Integer> construirHashMap(List<Map.Entry<String,Integer>> pares) {
        return pares.stream().collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (primero, ignorado) -> primero,
                        HashMap::new
                )
        );
    }

    public static Hashtable<String,Integer> construirHashtable(List<Map.Entry<String,Integer>> pares) {
        return pares.stream().collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (primero, ignorado) -> primero,
                        Hashtable::new
                )
        );
    }

    public static Map<String,Integer> combinarMapas(Map<String,Integer> hashMap, Map<String,Integer> hashTable) {
        return Stream.concat(hashMap.entrySet().stream(), hashTable.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2,
                        HashMap::new
                ));
    }

    public static void imprimirMayus(Map<String,Integer> mapa) {
        mapa.entrySet().stream()
                .map(e -> new AbstractMap.SimpleEntry<>(e.getKey().toUpperCase(java.util.Locale.ROOT), e.getValue()))
                .forEach(e -> System.out.printf("Clave: %s | Valor: %d%n", e.getKey(), e.getValue()));
    }

    public static void imprimirOrdenado(Map<String,Integer> mapa) {
        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.printf("Clave: %s | Valor: %d%n", e.getKey(), e.getValue()));
    }

    public static Map<String,Integer> mapaFinalAsc(Map<String,Integer> hashMap, Map<String,Integer> hashTable) {
        return new HashMap<>(hashMap);
    }

    public static void demo() {
        Function<List<Map.Entry<String,Integer>>, Map<String,Integer>> buildHash =
                MapaDelTesoro::construirHashMap;
        Function<List<Map.Entry<String,Integer>>, Map<String,Integer>> buildTable =
                MapaDelTesoro::construirHashtable;

        var listaHash = List.of(
                new AbstractMap.SimpleEntry<>("oro", 5),
                new AbstractMap.SimpleEntry<>("plata", 3),
                new AbstractMap.SimpleEntry<>("oro", 7),
                new AbstractMap.SimpleEntry<>("diamante", 10)
        );
        var listaTable = List.of(
                new AbstractMap.SimpleEntry<>("plata", 8),
                new AbstractMap.SimpleEntry<>("rubí", 4),
                new AbstractMap.SimpleEntry<>("oro", 12),
                new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

        Map<String,Integer> m1 = buildHash.apply((List<Map.Entry<String, Integer>>) (List<?>) listaHash);
        Map<String,Integer> m2 = buildTable.apply((List<Map.Entry<String, Integer>>) (List<?>) listaTable);
        Map<String,Integer> combinado = combinarMapas(m1, m2);
        imprimirMayus(combinado);
        imprimirOrdenado(combinado);
    }
}
