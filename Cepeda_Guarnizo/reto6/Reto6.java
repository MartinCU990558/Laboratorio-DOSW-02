package Cepeda_Guarnizo.reto6;
import java.util.*;

public class Reto6 {

    private static final Map<String, Runnable> acciones = new HashMap<>();

    static {

        acciones.put("SALUDAR", () ->
            System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        acciones.put("DESPEDIR", () ->
            System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        acciones.put("CANTAR", () ->
            System.out.println("La máquina canta: \"01010101\""));
        acciones.put("DANZAR", () ->
            System.out.println("La máquina gira y emite chispas: \"Girando en modo fiesta.\""));
    }

    public static void ejecutarComando(String comando) {
        if (comando == null) {
            System.out.println("Comando nulo.");
            return;
        }
        String cmd = comando.trim().toUpperCase(Locale.ROOT);

        switch (cmd) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                acciones.get(cmd).run(); 
                break;
            default:
                System.out.println("Comando desconocido: " + cmd);
        }
    }

    public static void main(String[] args) {
        ejecutarComando("SALUDAR");
        ejecutarComando("CANTAR");
    }
}

