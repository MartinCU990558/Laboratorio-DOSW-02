import java.util.*;
import java.util.stream.*;
import java.util.regex.*;

public class Reto5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputHashSet = scanner.nextLine();

        String inputTreeSet = scanner.nextLine();

        scanner.close();

        Set<Integer> conjuntoA = extraerNumeros(inputHashSet);
        Set<Integer> conjuntoB = extraerNumeros(inputTreeSet);

        Set<Integer> resultadoA = procesarHashSet(conjuntoA);
        Set<Integer> resultadoB = procesarTreeSet(conjuntoB);

        Set<Integer> union = unirConjuntos(resultadoA, resultadoB);

        mostrarResultado(union);
    }

    public static Set<Integer> extraerNumeros(String input) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        Set<Integer> numeros = new HashSet<>();
        while (matcher.find()) {
            numeros.add(Integer.parseInt(matcher.group()));
        }
        return numeros;
    }

    public static Set<Integer> procesarHashSet(Set<Integer> conjunto) {
        return conjunto.stream()
                .filter(num -> num % 3 != 0)
                .collect(Collectors.toSet());
    }

    public static Set<Integer> procesarTreeSet(Set<Integer> conjunto) {
        return conjunto.stream()
                .filter(num -> num % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static Set<Integer> unirConjuntos(Set<Integer> conjuntoA, Set<Integer> conjuntoB) {
        Set<Integer> union = new TreeSet<>();
        union.addAll(conjuntoA);
        union.addAll(conjuntoB);
        return union;
    }

    public static void mostrarResultado(Set<Integer> conjunto) {
        conjunto.forEach(num -> System.out.println("Número en arena: " + num));
    }
}
