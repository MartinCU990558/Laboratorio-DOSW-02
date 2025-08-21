package Cepeda_Guarnizo.reto4;
 
import java.util.*;
 
public class Reto4 {
 
    public static Hashtable<String, Integer> hashtable(List<AbstractMap.SimpleEntry<String, Integer>> pares) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        for (AbstractMap.SimpleEntry<String, Integer> e : pares) {
            synchronized (tabla) {
                if (!tabla.containsKey(e.getKey())) {
                    tabla.put(e.getKey(), e.getValue());
                }
            }
        }
        return tabla;
    }
 
    public static Map<String, Integer> combinarMap(Map<String, Integer> mapaA, Map<String, Integer> mapaB) {
        Map<String, Integer> result = new HashMap<>(mapaA);
        result.putAll(mapaB);
        return result;
    }
 
    public static void imprimirOrdenado(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.printf("Clave: %s | Valor: %d%n", e.getKey(), e.getValue()));
    }
}