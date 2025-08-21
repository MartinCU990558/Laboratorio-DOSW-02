import java.util.HashMap;
import java.util.Map;

public class MaquinaDecisionesA {

    private final Map<String, Runnable> comandos = new HashMap<>();

    public MaquinaDecisionesA() {
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
    }

    public void ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                comandos.get(comando).run();
                break;
            default:
                System.out.println("Comando no reconocido por el fragmento A.");
        }
    }
}
