package Pareja_rodriguez_martinez.reto3;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto3 {

    public static void printMessage(String msg){
        Function<String,String> transformar = Reto3 :: combineTransformations;
        System.out.println(transformar.apply(msg));
    }

    public static String printWithBuilder(String msg){
        return Stream.generate(()->msg).limit(3).collect(Collectors.joining(" "));
    }

    public static void combineTransformations(String msg){
        return invertString(printWithBuilder(msg));
    }
    public static String invertString(){
        return "x"
    }

}