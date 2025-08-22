import java.util.*;

public class Reto4 {

    public static HashMap<String, Integer> mapa;
    public static Hashtable<String, Integer> table;

    public static void main(String[] args) {
        HashMap<String, Integer> mapa = createHashMap();

        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("plata", 8);
        table.put("rubí", 4);
        table.put("oro", 12);
        table.put("esmeralda", 6);

        unificar(table, mapa);
    }

    public static HashMap<String,Integer> createHashMap(){
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("oro", 5);
        mapa.put("plata", 3);
        mapa.put("diamante", 10);
        return mapa;
    }

    public static void unificar(Hashtable<String, Integer> table, HashMap<String, Integer> mapa){
        HashMap<String,Integer> resultado = new HashMap<>();
        for (String key : table.keySet()) {
            resultado.put(key, table.get(key));
            if (mapa.keySet().contains(key)){
                mapa.remove(key);
            }
        }
        for (String key : mapa.keySet()) {
            if (!resultado.containsKey(key)){
                resultado.put(key, mapa.get(key));
            }
        }
        resultado.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey(String.CASE_INSENSITIVE_ORDER))
                .map(entry -> String.format("Clave: %s | Valor: %d", entry.getKey().toUpperCase(), entry.getValue()))
                .forEach(System.out::println);
    }
}