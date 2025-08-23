import java.util.*;
import java.util.regex.*;

public class Reto6 {

    private static Map<String, Runnable> comandos = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        configurarComandos();

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            String comando = extraerComando(input);

            if (comando != null) {
                ejecutarComando(comando);
            }
        }
        scanner.close();
    }

    public static String extraerComando(String input) {
        Pattern pattern = Pattern.compile("ejecutarComando\\(\"(.+?)\"\\);");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group(1).toUpperCase();
        }
        return null;
    }

    public static void configurarComandos() {
    }

    public static void ejecutarComando(String comando) {
        switch (comando) {
                comandos.get(comando).run();
                break;
        }
    }
}