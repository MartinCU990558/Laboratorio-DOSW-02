import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BatallaConjuntosFinal {

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
        Set<Integer> unidos = Stream.concat(hashSetA.stream(), treeSetB.stream())
                .collect(Collectors.toCollection(TreeSet::new));

        unidos.forEach(n -> System.out.println("Número en arena: " + n));

        return unidos;
    }

    public static Set<Integer> desdeArrayHashSet(int... valores) {
        Set<Integer> s = new HashSet<>();
        for (int v : valores) s.add(v);
        return s.stream().filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static Set<Integer> desdeArrayTreeSet(int... valores) {
        TreeSet<Integer> s = new TreeSet<>();
        for (int v : valores) s.add(v);
        return s.stream().filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
