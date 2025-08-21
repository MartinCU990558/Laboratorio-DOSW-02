package reto3;

class Reto3 {
public static Function<String, String> invertir() {
    return mensaje -> new StringBuffer(mensaje).reverse().toString();
    }
}