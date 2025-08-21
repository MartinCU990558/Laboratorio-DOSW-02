package Cepeda_Guarnizo.reto3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {

    public static String invertirConBuffer(String mensaje) {
        return new StringBuffer(mensaje).reverse().toString();
    }
    public static String tripleYRevierte(String mensaje) {
        String repetido = IntStream.range(0, 3)
                                   .mapToObj(i ->mensaje)
                                   .collect(Collectors.joining(" "));
        return new StringBuffer(repetido).reverse().toString();
    }

    public static void main(String[] args) {

        Function<String, String> transform = Reto3::tripleYRevierte;
        String input = (args.length > 0) ? args[0] : "Hola";
        System.out.println(transform.apply(input));
    }

}