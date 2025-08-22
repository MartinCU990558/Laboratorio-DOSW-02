import java.util.List;

public class CarreraParalela {
    public static int calcularMaximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compareTo).orElseThrow();
    }
}