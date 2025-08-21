package reto3;

class Reto3 {
    public static void main(String[] args) {}

    /**
     *
     *
     * @param mensaje
     * @return
     */
    public static String repetirMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder();
        java.util.stream.IntStream.range(0, 3).forEach(i -> {if (i > 0) sb.append(" ");sb.append(mensaje);});
        return sb.toString();
    }

}

