package Quintero_Ortega.reto5;

import java.util.*;

public class Reto5 {
    public static void main(String[] args) {
        Set<Integer> hashSet = EstudianteA.generarHashSet();
        hashSet.forEach(num -> System.out.println("Número en arena: " + num));
    }
}
