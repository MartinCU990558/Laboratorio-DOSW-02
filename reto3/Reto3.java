
package reto3;

class Reto3 {
    public static String repetirTresVeces(String mensaje) {
        return IntStream.range(0, 3).mapToObj(i -> mensaje).reduce(new StringBuilder(), StringBuilder::append, StringBuilder::append).toString();
    }
    public static String repetirEInvertir(String mensaje) {
        return invertir(repetirTresVeces(mensaje));
    }

}
