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
        String esDivisorDeDos = (2 % maximo == 0) ? "Es divisor de 2" : "No es divisor de 2";
        System.out.println("Máximo: " + maximo + " → " + esDivisorDeDos);
        System.out.println(minimoYCantidad);
    }
}
