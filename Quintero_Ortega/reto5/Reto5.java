package Quintero_Ortega.reto5;
import java.util.*;

public class Reto5 {

    public static void main(String[] args) {
        Set<Integer> hashSet = EstudianteA.generarHashSet();
        Set<Integer> treeSet = EstudianteB.generarTreeSet();

        Set<Integer> union = new TreeSet<>();
        union.addAll(hashSet);
        union.addAll(treeSet);

        union.forEach(
            num -> System.out.println("Número en arena: " + num)
        );
    }
}