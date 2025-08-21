package Cepeda_Guarnizo.reto4;
 
import java.util.*;
import java.util.stream.*;
import java.util.AbstractMap;
 
public class Reto4 {

    public static Map<String, Integer> hashMap(List<AbstractMap.SimpleEntry<String, Integer>> pares) {
        Map<String, Integer> mapa = new HashMap<>();
        for (AbstractMap.SimpleEntry<String, Integer> e : pares) {
            if (!mapa.containsKey(e.getKey())) {
                mapa.put(e.getKey(), e.getValue());
            }
        }
        return mapa;
    }

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
        return Stream.concat(mapaA.entrySet().stream(), mapaB.entrySet().stream())
                .collect(Collectors.toMap(
                        e -> e.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (v1, v2) -> v2,               
                        LinkedHashMap::new
                ));
    }

    public static void imprimirFinal(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) 
                .forEach(e -> System.out.printf("Clave: %s | Valor: %d%n", e.getKey(), e.getValue()));
    }
 
    public static void main(String[] args) {
        List<AbstractMap.SimpleEntry<String, Integer>> listaA = Arrays.asList(
                new AbstractMap.SimpleEntry<>("oro", 5),
                new AbstractMap.SimpleEntry<>("plata", 3),
                new AbstractMap.SimpleEntry<>("oro", 7),
                new AbstractMap.SimpleEntry<>("diamante", 10)
        );
 
        List<AbstractMap.SimpleEntry<String, Integer>> listaB = Arrays.asList(
                new AbstractMap.SimpleEntry<>("plata", 8),
                new AbstractMap.SimpleEntry<>("rubí", 4),
                new AbstractMap.SimpleEntry<>("oro", 12),
                new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );
 
        Map<String, Integer> mapaA = hashMap(listaA);
        Map<String, Integer> mapaB = hashtable(listaB);
 
        Map<String, Integer> combinado = combinarMap(mapaA, mapaB);
 
        imprimirFinal(combinado);
    }
}