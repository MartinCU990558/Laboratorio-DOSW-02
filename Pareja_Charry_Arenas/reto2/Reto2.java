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
        String esMultiploDeDos = (maximo % 2 == 0) ? "Sí es múltiplo de 2" : "No es múltiplo de 2";
        System.out.println("Máximo: " + maximo + " → " + esMultiploDeDos);
        System.out.println(minimoYCantidad);
    }
}