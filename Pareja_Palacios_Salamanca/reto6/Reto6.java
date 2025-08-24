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

        comandos.put("SALUDAR", () ->
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () ->
                System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () ->
                System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () ->
                System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
        comandos.put("BROMEAR", () ->
                System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () ->
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () ->
                System.out.println("La máquina susurra: Shhh... los bugs están dormidos."));
        comandos.put("ANALIZAR", () ->
                System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!"));
    }

    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                comandos.get(comando).run();
                break;
        }

    }
}