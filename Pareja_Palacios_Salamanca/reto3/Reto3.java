public class Reto3{
    public static void main(String[] args) {
        eco("hola");
    }

    public static void eco(String mensaje){
        StringBuilder string = new StringBuilder();
        string.append(mensaje).append(" ").append(mensaje).append(" ").append(mensaje);
        System.out.println(string);

    }
}