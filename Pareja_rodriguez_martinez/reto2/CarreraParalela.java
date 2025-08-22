package Pareja_rodriguez_martinez.reto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarreraParalela {

    public void integralSolution(List<List<Integer>> listsToProcess) {
        for (List<Integer> list : listsToProcess) {
            System.out.println("Procesando lista: " + list);
            System.out.println("Máximo: " + findMax(list));
            System.out.println("Cantidad: " + list.stream().count());
            System.out.println("Mínimo: " + calculateMinimum(list));
            System.out.println("¿Es divisor de 2?: " + itsDivisor(findMax(list)));
            System.out.println("¿La lista es de tamaño par?: " + isTheListLongEven(list));
        }
    }

    public int findMax(List<Integer> listOfIntegers ){
        return listOfIntegers.stream().max(Integer::compare).get();
    }

    public static Integer calculateMinimum(List<Integer> listOfNumbers){
        return listOfNumbers.stream().min(Integer::compare).get();
    }

    public static List<Integer> unifyResults(Integer min, Integer max){
        return new ArrayList<>(Arrays.asList(min, max));
    }

    public static boolean isEven(Integer number){
        return (number % 2 == 0) ? true:false;
    }
    public static boolean isTheListLongEven(List<Integer> lista) {
        return lista.size() % 2 == 0;
    }
    public static boolean itsDivisor(Integer maxNum){
        return 2 % maxNum  == 0  ? true:false;
    }

    public static boolean itsOdd(List<Integer> listOfNumbers){
        return listOfNumbers.stream().count() % 2 != 0 ? true:false;
    }


}

