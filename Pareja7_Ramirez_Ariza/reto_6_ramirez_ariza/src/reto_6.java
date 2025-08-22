import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class reto_6 {

    public static void ejecutarComando(String comando) {
        switch (comando.toUpperCase()) {
            case "SALUDAR":
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.");
                break;
            case "CANTAR":
                System.out.println("La máquina canta: 01010101");
                break;
            case "DANZAR":
                System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.");
                break;
            case "BROMEAR":
                System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
                break;
            case "GRITAR":
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("La máquina susurra: Shhh... los bugs están dormidos.");
                break;
            case "ANALIZAR":
                System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!");
                break;
        }
    }

    public static void main(String[] args) {
        Map<String, Runnable> map = new Hashtable<>();
        ArrayList<String> actions = new ArrayList<>(Arrays.asList("SALUDAR", "DANZAR", "CANTAR", "DESPEDIR", "HACER CAFÉ", "BROMEAR", "GRITAR", "SUSURRAR", "ANALIZAR"));
        for (String action : actions) {
            map.put(action, () -> ejecutarComando(action));
            map.get(action).run();
        }

        map.get("ANALIZAR").run();
    }
}
