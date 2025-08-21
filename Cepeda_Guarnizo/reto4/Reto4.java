package Cepeda_Guarnizo.reto4;

import java.util.*;

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

    public static Map<String, Integer> combinarMap(Map<String, Integer> mapaA, Map<String, Integer> mapaB) {
        Map<String, Integer> result = new HashMap<>(mapaA);
        result.putAll(mapaB);
        return result;
    }

    public static void imprimirMayus(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
                .map(e -> new AbstractMap.SimpleEntry<>(e.getKey().toUpperCase(), e.getValue()))
                .forEach(e -> System.out.printf("Clave: %s | Valor: %d%n", e.getKey(), e.getValue()));
    }
}