package reto4;

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

    public static Map<String, Integer> combinarMapas(HashMap<String, Integer> mapaRapido, Hashtable<String, Integer> mapaBlindado) {
        Map<String, Integer> merged = new HashMap<>(mapaRapido);
        mapaBlindado.forEach((clave, valor) -> merged.put(clave, valor));

        return merged;
    }

    public static Map<String, Integer> combinarMayusculasYOrdenarImprimiendo(HashMap<String, Integer> mapaRapido, Hashtable<String, Integer> mapaBlindado) {

        Map<String, Integer> combinado = combinarMapas(mapaRapido, mapaBlindado);

        Set<Map.Entry<String, Integer>> entradas = combinado.entrySet();

        Stream<Map.Entry<String, Integer>> streamEntradas = entradas.stream();

        Stream<Map.Entry<String, Integer>> streamMayusculas = streamEntradas.map(e -> Map.entry(e.getKey().toUpperCase(), e.getValue()));

        Map<String, Integer> mayusOrdenado = streamMayusculas.collect(
                Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue(),
                        (v1, v2) -> v1,
                        TreeMap::new
                )
        );

        mayusOrdenado.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
        return mayusOrdenado;
    }

    public static void main(String[] args) {
        List<KV> datosHashMap = List.of(
                new KV("oro", 5),
                new KV("plata", 3),
                new KV("oro", 7),
                new KV("diamante", 10)
        );
        List<KV> datosHashtable = List.of(
                new KV("plata", 8),
                new KV("rubí", 4),
                new KV("oro", 12),
                new KV("esmeralda", 6)
        );

        HashMap<String, Integer> mapaA = buildHashMapIgnoringDuplicatesFirst(datosHashMap);
        Hashtable<String, Integer> tablaB = buildHashtableIgnoringDuplicatesFirst(datosHashtable);

        System.out.println("RESULTADO");
        combinarMayusculasYOrdenarImprimiendo(mapaA, tablaB);
    }

}