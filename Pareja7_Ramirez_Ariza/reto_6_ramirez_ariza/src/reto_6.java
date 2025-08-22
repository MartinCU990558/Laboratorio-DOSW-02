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
        }
    }

    public static void main(String[] args) {
        act("SALUDAR");
        act("DANZAR");
        act("CANTAR");
        act("DESPEDIR");
        act("HACER CAFÉ");
    }
}
