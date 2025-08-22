package Pareja_Charry_Arenas.reto3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.Function;

public class Reto3 {

    public static String repetirMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> {
            sb.append(mensaje);
            if (i < 2) sb.append(" ");
        });
        return sb.toString();
    }

    public static String invertirConBuffer(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }

    public static String repetirYInvertirLambda(String mensaje) {
        Function<String, String> transformar = m -> {
            String repeated = IntStream.range(0, 3)
                    .mapToObj(i -> m)
                    .collect(Collectors.joining(" "));
            return new StringBuffer(repeated).reverse().toString();
        };
        return transformar.apply(mensaje);
    }

    public static void main(String[] args) {
        String mensaje = "Hola";

        System.out.println("Método repetirMensaje (StringBuilder):");
        System.out.println(repetirMensaje(mensaje));

        System.out.println("\nMétodo invertirConBuffer (StringBuffer):");
        System.out.println(invertirConBuffer(mensaje));

        System.out.println("\nMétodo repetirYInvertirLambda (lambda + stream + StringBuffer):");
        System.out.println(repetirYInvertirLambda(mensaje));
    }
}
