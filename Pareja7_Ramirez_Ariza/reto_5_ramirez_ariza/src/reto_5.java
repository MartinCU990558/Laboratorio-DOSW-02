import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class reto_5 {
    public static Set<Integer> filterMultiplesOfThree(List<Integer> numeros) {
        Set<Integer> set = new HashSet<>(numeros);
        set.removeIf(n -> n % 3 == 0);
        return set;
    }

    public static Set<Integer> filterMultiplesOfFive(List<Integer> numeros) {
        Set<Integer> set = new TreeSet<>(numeros);
        set.removeIf(n -> n % 5 == 0);
        return set;
    }

    public static Set<Integer> combineAll(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        return set1;

    }

    public static void main(String[] args) {
        List<Integer> listHashSet = List.of(4, 9, 15, 7, 18, 21, 10, 5);
        List<Integer> listTreeSet = List.of(12, 3, 25, 10, 7, 30, 18, 4);

        System.out.println(filterMultiplesOfThree(listHashSet));
        System.out.println(filterMultiplesOfFive(listHashSet));
        Set<Integer> set = new TreeSet<>(combineAll(filterMultiplesOfThree(listHashSet), filterMultiplesOfFive(listTreeSet)));

        set.stream().forEach(n -> System.out.println("Número en arena: " + n));

    }

}