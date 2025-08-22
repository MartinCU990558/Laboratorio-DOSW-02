package Pareja_rodriguez_martinez.reto3;

import java.util.List;
import java.util.function.Function;

public class Reto3 {

    public static String invertString(String str) {
        return new StringBuffer(str).reverse().toString();
    }
    public static String printWithBuilder(String str) {
        return " ";
    }

    public static String combineTransformations(String message) {
        return invertString(printWithBuilder(message));
    }
    public static void printMessage(String msg){
        Function<String,String> transformar = Reto3 :: combineTransformations;
        System.out.println(transformar.apply(msg));
    }
}