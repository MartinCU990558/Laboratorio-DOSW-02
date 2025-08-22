import java.util.List;

public class CarreraParalela {

    public static int calcularMaximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compareTo).orElseThrow();
    }

    public static String calcularMinimoYCantidad(List<Integer> numeros) {
        int minimo = numeros.stream().min(Integer::compareTo).orElseThrow();
        int cantidad = numeros.size();
        return "Mínimo: " + minimo + ", Cantidad: " + cantidad;
    }

    public static void calcularResultados(List<Integer> numeros) {
        int maximo = calcularMaximo(numeros);
        String minimoYCantidad = calcularMinimoYCantidad(numeros);

        System.out.println("Máximo: " + maximo);
        System.out.println(minimoYCantidad);
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 2, 9, 1, 7);

        calcularResultados(numeros);
    }
}
