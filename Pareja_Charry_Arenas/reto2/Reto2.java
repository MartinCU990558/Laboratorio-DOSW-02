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
        String esDivisorDeDos = (2 % maximo == 0) ? "Es divisor de 2" : "No es divisor de 2";

        int cantidad = numeros.size();
        String esPar = (cantidad % 2 == 0) ? "La cantidad es par" : "La cantidad no es par";

        System.out.println("Máximo: " + maximo + " → " + esMultiploDeDos + " y " + esDivisorDeDos);
        System.out.println(minimoYCantidad);
        System.out.println(esPar);
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 2, 9, 1, 7);

        calcularResultados(numeros);
    }
}