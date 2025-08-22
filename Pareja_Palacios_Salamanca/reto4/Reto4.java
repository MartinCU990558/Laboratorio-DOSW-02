import java.util.Hashtable;

public class Reto4 {
    public static Hashtable<String,Integer> mapa;
    public static void main(String[] args) {

        mapa  = new Hashtable<>();
        map("a",1);

    }

    public static void map(String clave, Integer valor){

        if(mapa.containsKey(clave)){
            mapa.put(clave, valor);
        }
    }
}