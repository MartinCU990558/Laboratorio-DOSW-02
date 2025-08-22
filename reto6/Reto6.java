import java.util.*;

public class Reto6 {
    private static final Map<String, Runnable> ACCIONES = new HashMap<>();

    public static void registrarAcciones(Map<String, Runnable> acciones) {
        acciones.put("SALUDAR", () ->
            System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        acciones.put("DESPEDIR", () ->
            System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        acciones.put("CANTAR", () ->
            System.out.println("La máquina canta: 01010101"));
        acciones.put("DANZAR", () ->
            System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
    }

    public static void ejecutarComando(String comando) {
        if (comando == null) { System.out.println("Comando inválido (null)."); return; }
        String cmd = comando.trim().toUpperCase();
        switch (cmd) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                Runnable r = ACCIONES.get(cmd);
                if (r != null) r.run();
                else System.out.println("Acción no registrada para: " + cmd);
                break;
            default:
                System.out.println("Comando no reconocido: " + cmd);
        }
    }
}
