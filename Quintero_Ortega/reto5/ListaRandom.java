package Quintero_Ortega.reto5;

import java.util.*;

public class ListaRandom {
    public static List<Integer> generarListas(int cantidadNums){
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidadNums; i++){
            int num = random.nextInt(73);
            lista.add(num);
        }
        return lista;
    }
}

