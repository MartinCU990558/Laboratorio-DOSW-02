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

    public static void imprimirClavesMayusculas(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
            .map(e -> Map.entry(e.getKey().toUpperCase(), e.getValue()))
            .sorted(Map.Entry.comparingByKey())
            .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }

//
}