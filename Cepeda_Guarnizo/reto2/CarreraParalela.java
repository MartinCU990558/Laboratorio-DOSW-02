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
                    int max = lista.stream().max(Integer::compareTo).get();
                    String esMultiplo =(max%2 ==0)?"es multiplo de 2":"No es multiplo de 2";
                    String esPar = (lista.size() % 2 == 0) ? "La cantidad es par" : "La cantidad es impar";

                    return min + " " + max +" " +esMultiplo+" "+lista.size() +" " +esPar;
                };

            System.out.println(resultado.apply(numeros));
        }
    }
}