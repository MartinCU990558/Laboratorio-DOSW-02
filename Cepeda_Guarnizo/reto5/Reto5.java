package Cepeda_Guarnizo.reto5;

import java.util.*;

public class Reto5 {

    public static Set<Integer> hashSet(int cantidad, int min, int max) {
        return new HashSet<>();
    }

    public static Set<Integer> treeSet(int cantidad, int min, int max) {
        return new TreeSet<>();
    }

    public static SortedSet<Integer> unionOrdenada(Set<Integer> a, Set<Integer> b) {

        return new TreeSet<>();
    }

    public static void imprimir(SortedSet<Integer> arena) {
        arena.forEach(n -> System.out.println("EN ARENA: " + n));
    }

    public static void main(String[] args) {
        System.out.println("Proyecto listo. Implementa métodos en las ramas.");
    }
}