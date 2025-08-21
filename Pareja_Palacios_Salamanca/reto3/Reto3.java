public class Reto3 {
    public static String transformarMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String mensaje = "Hola";
        String resultado = Reto3.transformarMensaje(mensaje);
        System.out.println("Resultado Estudiante A: " + resultado);
    }
}
