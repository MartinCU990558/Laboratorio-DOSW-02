public class Reto3{
    public static void main(String[] args) {
        eco("hola");
    }

    public static void eco(String mensaje){
        StringBuffer string = new StringBuffer(mensaje);
        string.reverse().toString();
        System.out.println(string);

    }
}