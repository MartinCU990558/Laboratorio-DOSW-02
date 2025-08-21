import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BatallaConjuntosA {

    private static final Random RNG = new Random();

    public static Set<Integer> crearHashSetFiltrandoMultiplosDe3(int cantidad, int maxExclusive) {
        Set<Integer> base = new HashSet<>();
        while (base.size() < cantidad) {
            base.add(RNG.nextInt(maxExclusive));
        }
        return base.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static Set<Integer> unirColeccionesOrdenadas(Set<Integer> hashSetA, Set<Integer> treeSetB) {
        TreeSet<Integer> unidos = new TreeSet<>(hashSetA);
        unidos.addAll(treeSetB);
        return unidos;
    }
    public static void imprimirArena(Set<Integer> numeros) {
        numeros.forEach(n -> System.out.println("Número en arena: " + n));
    }
}
