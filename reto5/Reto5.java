package reto5;

import java.util.*;
import java.util.stream.*;


public class Reto5 {
    public static void storeA(){
        HashSet<Integer> numeros = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++){
            numeros.add(rand.nextInt(100)+1);
        }
        Set<Integer> filtrados = numeros.stream().filter(n-> n % 3 != 0).collect(Collectors.toSet());
    }
}
