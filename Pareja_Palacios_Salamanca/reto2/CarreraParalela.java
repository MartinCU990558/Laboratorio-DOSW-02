import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class CarreraParalela{

    public static List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 7, 12, 4);

    public static void main(String[] args) {
        calcularMinimoYCantidad();
    }

    private static void calcularMinimoYCantidad(){
        Optional<Integer> minimo = numeros.stream()
                .min((a, b) -> a - b);
        long cantidad = numeros.stream().count();
        if (minimo.isPresent()) {
            System.out.println("El número más pequeño es: " + minimo.get());
            System.out.println("La cantidad de números ingresados es: " + cantidad);
        } else {
            System.out.println("La lista está vacía");
        }
    }
}
