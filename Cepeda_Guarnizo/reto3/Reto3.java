package Cepeda_Guarnizo.reto3;

import java.util.function.Function;
import java.util.stream.*;

public class Reto3 {

    public static String repetir3Veces(String msj) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> {
            if (sb.length() > 0)
                sb.append(' ');
            sb.append(msj);
        });
        return sb.toString();
    }

    public static String tripleInvertido(String msj) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> {
            if (sb.length() > 0)
                sb.append(' ');
            sb.append(msj);
        });
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        Function<String, String> transform = Reto3::tripleInvertido;
        String input = (args.length > 0) ? args[0] : "Hola";
        System.out.println(transform.apply(input));
    }
}
