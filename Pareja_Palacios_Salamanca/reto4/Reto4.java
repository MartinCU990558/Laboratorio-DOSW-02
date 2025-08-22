import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;

public class Reto4 {
    public static Hashtable<String,Integer> mapa;
    public static void main(String[] args) {
        mapa = new Hashtable<>();
        hashtable("plata", 8);
        hashtable("rubí", 4);
        hashtable("oro", 12);
        hashtable("esmeralda", 6);
        HashMap<String,Integer> otroMapa = new HashMap<>();
        otroMapa.put("oro", 5);
        otroMapa.put("plata", 3);
        otroMapa.put("oro", 7);
        otroMapa.put("diamante", 10);
        Map<String,Integer> combinado = map(mapa, otroMapa);
        combinado.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER))
                .map(e -> "Clave: " + e.getKey().toUpperCase() + " | Valor: " + e.getValue())
                .forEach(System.out::println);
    }

    public static void hashtable(String clave, Integer valor){
        mapa.put(clave, valor);
    }

    public static Map<String,Integer> map(Hashtable<String,Integer> tabla, HashMap<String,Integer> hash){
        Map<String,Integer> resultado = new HashMap<>(hash);
        tabla.forEach(resultado::put);
        return resultado;
    }
}
