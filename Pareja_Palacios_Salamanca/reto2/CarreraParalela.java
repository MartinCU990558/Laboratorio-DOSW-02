import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.Comparator;
public class CarreraParalela{

    public static List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 7, 12, 4);
    public static void main(String[] args) {
        numero();
    }

    private static void numero(){
        Optional<Integer> maximo = numeros.stream().max((a, b) -> a - b);

        if (maximo.isPresent()) {
            System.out.println("El número más grande es: " + maximo.get());
        } else {
            System.out.println("La lista está vacía");
        }
    }
}