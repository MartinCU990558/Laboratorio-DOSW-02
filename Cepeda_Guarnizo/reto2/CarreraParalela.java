import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CarreraParalela {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine().trim();

        if (entrada.startsWith("{") && entrada.endsWith("}")) {
                List<Integer> numeros = Arrays.stream(
                        entrada.substring(1, entrada.length() - 1).split(","))
                        .map(String::trim)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

            Function<List<Integer>, String> resultado = lista -> {
                int min = lista.stream().min(Integer::compareTo).get();
                int maximo = lista.stream().max(Integer::compareTo).get();
                String esDivisor = (2 % maximo == 0) ? "Es divisor de 2" : "No es divisor de 2";
                String esImpar = (lista.size() % 2 != 0) ? "La cantidad es impar" : "La cantidad es par";
                return "minimo" + min + " maximo" + maximo + esDivisor + " " + "cantidad" + lista.size() + esImpar;
            };

            System.out.println(resultado.apply(numeros));
        }
    }
}