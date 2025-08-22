package reto5;

import java.util.*;
import java.util.stream.*;


public class Reto5 {
    public static Set<Integer> almacenarA() {
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
        return filtrados;
    }

    public static Set<Integer> almacenarB() {
        TreeSet<Integer> numeros = new TreeSet<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            numeros.add(rand.nextInt(100) + 1);
        }

        System.out.println("Números generados en orden ascendente:");
        numeros.forEach(n -> System.out.print(n + " "));

        Set<Integer> filtrados = numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("\n\nNúmeros después de eliminar múltiplos de 5:");
        filtrados.forEach(n -> System.out.print(n + " "));
        return filtrados;
    }

    public static void crash(){
        TreeSet<Integer> union = new TreeSet<>();
        Set<Integer> setA = almacenarA();
        Set<Integer> setB = almacenarB();
        union.addAll(setA);
        union.addAll(setB);
        System.out.println("Resultado: ");
        union.forEach(n -> System.out.print(n + " "));
    }
}
