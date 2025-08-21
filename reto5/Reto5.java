import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BatallaConjuntosB {
    private static final Random RNG = new Random();
    public static Set<Integer> crearTreeSetFiltrandoMultiplosDe5(int cantidad, int maxExclusive) {
        TreeSet<Integer> base = new TreeSet<>();
        while (base.size() < cantidad) {
            base.add(RNG.nextInt(maxExclusive));
        }
        return base.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static Set<Integer> unirColeccionesOrdenadas(Set<Integer> hashSetA, Set<Integer> treeSetB) {
        return Stream.concat(hashSetA.stream(), treeSetB.stream())
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void imprimirArena(Set<Integer> numeros) {
        numeros.forEach(n -> System.out.println("numero de la arena de batalla " + n));
    }
}