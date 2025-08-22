package Quintero_Ortega.reto5;

import java.util.*;
import java.util.stream.Collectors;

public class EstudianteB {
    public static Set<Integer> generarTreeSet() {
        Random random = new Random();
        int lengthLista = random.nextInt(13) + 1;
        List<Integer> nums = ListaRandom.generarListas(lengthLista).stream()
                .sorted()
                .collect(Collectors.toList());

        Set<Integer> treeSet = new TreeSet<>(nums);

        return treeSet.stream()
                .filter(num -> num % 5 != 0)
                .collect(Collectors.toCollection(() -> new TreeSet<>()));

    }
}