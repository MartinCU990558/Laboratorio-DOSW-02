import java.util.HashMap;

public class Reto4 {
    public static HashMap<String,Integer> mapa;
    public static void main(String[] args) {
        mapa  = new HashMap<>();
        map("a",1);

    }

    public static void map(String clave, Integer valor){
        if(mapa.containsKey(clave)){
            mapa.put(clave, valor);
        }
    }
}