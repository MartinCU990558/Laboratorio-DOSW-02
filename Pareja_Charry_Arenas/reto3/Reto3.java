package reto3;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {

    public static String invertirConBuffer(String mensaje) {
        String invertido = IntStream.range(0, mensaje.length())
                .mapToObj(i -> String.valueOf(mensaje.charAt(mensaje.length() - 1 - i)))
                .collect(Collectors.joining());

        StringBuffer sb = new StringBuffer(invertido);
        return sb.toString();
    }

    public static String repetirYInvertir(String mensaje) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) {
                sb.append(" ");
            }
        }

        return sb.reverse().toString();
    }
}
