package Quintero_Ortega.reto5;

import java.util.Set;

public class Reto5 {
    public static void main(String[] args) {
        Set<Integer> treeSet = EstudianteB.generarTreeSet();
        treeSet.forEach(num -> System.out.println("Número en arena: " + num));
    }
}