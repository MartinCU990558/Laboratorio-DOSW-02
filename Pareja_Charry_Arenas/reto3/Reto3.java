import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {

    public static String repetirMensaje(String mensaje) {
        return IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));
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
