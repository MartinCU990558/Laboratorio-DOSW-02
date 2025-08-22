public class reto_6 {

    public static void act(String comando) {
        switch (comando.toUpperCase()) {
            case "SALUDAR":
                System.out.println("¡Saludos, viajero del tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("Que los bits te acompañen, hasta la próxima misión.");
                break;
            case "CANTAR":
                System.out.println("01010101");
                break;
            case "DANZAR":
                System.out.println("Girando en modo fiesta.");
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
        act("SALUDAR");
        act("DANZAR");
        act("CANTAR");
        act("DESPEDIR");
        act("HACER CAFÉ");
        act("BROMEAR");
        act("GRITAR");
        act("SUSURRAR");
        act("ANALIZAR");
    }
}
