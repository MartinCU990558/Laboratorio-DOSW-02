package reto6;

import java.util.*;

public class Reto6 {
    private static final Map<String, Runnable> ACCIONES = new HashMap<>();
    public static void registrarAcciones(Map<String, Runnable> acciones) {
        acciones.put("BROMEAR", () ->
            System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        acciones.put("GRITAR", () ->
            System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        acciones.put("SUSURRAR", () ->
            System.out.println("La máquina susurra: Shhh... los bugs están dormidos."));
        acciones.put("ANALIZAR", () ->
            System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!"));
    }

    public static void ejecutarComando(String comando) {
        if (comando == null) { System.out.println("Comando inválido (null)."); return; }
        String cmd = comando.trim().toUpperCase(Locale.ROOT);
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
