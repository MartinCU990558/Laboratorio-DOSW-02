package reto3;

class Reto3 {
    public static String invertir(String mensaje) {
        return new StringBuffer(mensaje).reverse().chars().mapToObj(c -> (char)c).map(String::valueOf).collect(Collectors.joining());
    }

    public static String repetirEInvertir(String mensaje) {
        return invertir(repetirTresVeces(mensaje));
    }

}