import java.util.List;

public class CarreraParalela {
    public static String calcularMinimoYCantidad(List<Integer> numeros) {
        int minimo = numeros.stream().min(Integer::compareTo).orElseThrow();
        int cantidad = numeros.size();
        return "Mínimo: " + minimo + ", Cantidad: " + cantidad;
    }
}
