

public static void reto_6(String comando) {
    switch (comando.toUpperCase()) {
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
    public static void main (String[]args){
        reto_6("BROMEAR");
        reto_6("GRITAR");
        reto_6("SUSURRAR");
        reto_6("ANALIZAR");
        reto_6("DORMIR");
    }



