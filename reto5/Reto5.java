package reto5;

import java.util.*;
import java.util.stream.*;


public class Reto5 {
    public static void almacenarNumeros2() {
        HashSet<Integer> numeros = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            numeros.add(rand.nextInt(100) + 1);
        }

        System.out.println("Números generados:");
        numeros.forEach(n -> System.out.print(n + " "));

        Set<Integer> filtrados = numeros.stream().filter(n -> n % 3 != 0).collect(Collectors.toSet());

        System.out.println("\n\nNúmeros después de eliminar múltiplos de 3:");
        filtrados.forEach(n -> System.out.print(n + " "));
    }

    public static void crash(Set<Integer> setA, Set<Integer> setB){
        TreeSet<Integer> union = new TreeSet<>();
        union.addAll(setA);
        union.addAll(setB);
        System.out.println("Resultado: ");
        union.forEach(n -> System.out.print(n + " "));
    }
}
