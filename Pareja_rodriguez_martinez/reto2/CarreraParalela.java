package Pareja_rodriguez_martinez.reto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarreraParalela {

<<<<<<< Updated upstream
=======
    public void integralSolution(List<Integer> listToProccess){
        System.out.println(findMax(listToProccess));
        System.out.println(calculateMinimum(listToProccess));
        System.out.println(listToProccess.stream().count());
        System.out.println(itsDivisor(findMax(listToProccess)));
        System.out.println(isTheListLongEven(listToProccess));
    }

    public int findMax(List<Integer> listOfIntegers ){
        return listOfIntegers.stream().max(Integer::compare).get();
    }

>>>>>>> Stashed changes
    public static Integer calculateMinimum(List<Integer> listOfNumbers){
        return listOfNumbers.stream().min(Integer::compare).get();
    }

    public static List<Integer> unifyResults(Integer min, Integer max){
        return new ArrayList<>(Arrays.asList(min, max));
    }

    public static boolean itsDivisor(Integer maxNum){
        return 2 % maxNum  == 0  ? true:false;
    }

    public static boolean itsOdd(List<Integer> listOfNumbers){
        return listOfNumbers.stream.count() % 2 != 0 ? true:false;
    }




}

