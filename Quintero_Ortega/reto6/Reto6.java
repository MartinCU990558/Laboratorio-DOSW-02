package Quintero_Ortega.reto6;

public class Reto6 {
    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR" -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
            case "DESPEDIR" -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.");
            case "CANTAR" -> System.out.println("La máquina canta: 01010101");
            case "DANZAR" -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.");
        }
    }
}
