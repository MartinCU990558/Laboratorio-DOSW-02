package Quintero_Ortega.reto5;

import java.util.*;
import java.util.stream.Collectors;

public class EstudianteA {
    public static Set<Integer> generarHashSet() {
        Random random = new Random();
        int lengthLista = random.nextInt(13) + 1;
        List<Integer> nums = ListaRandom.generarListas(lengthLista);
        Set<Integer> hashSet = new HashSet<>(nums);

        return hashSet.stream()
                .filter(num -> num % 3 != 0)
                .collect(Collectors.toSet());
    }
}
