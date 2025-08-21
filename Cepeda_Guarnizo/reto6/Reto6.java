package Cepeda_Guarnizo.reto6;

import java.util.*;

public class Reto6{

    private static final Map<String, Runnable> acciones = new HashMap<>();
    static {
        acciones.put("BROMEAR", () ->
            System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        acciones.put("GRITAR", () ->
            System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        acciones.put("SUSURRAR", () ->
            System.out.println("La máquina susurra: \"Shhh... los bugs están dormidos.\""));
        acciones.put("ANALIZAR", () ->
            System.out.println("La máquina procesa: \"Analizando datos... resultado: ¡Eres increíble programando!\""));
    }

    public static void ejecutarComando(String comando) {
        if (comando == null) {
            System.out.println("Comando nulo.");
            return;
        }
        String cmd = comando.trim().toUpperCase(Locale.ROOT);

        switch (cmd) {
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                acciones.get(cmd).run();
                break;
            default:
                System.out.println("Comando desconocido: " + cmd);
        }
    }

    public static void main(String[] args) {
        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
    }
}
