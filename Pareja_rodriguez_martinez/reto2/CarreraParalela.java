package Pareja_rodriguez_martinez.reto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarreraParalela {

    public int findMax(List<Integer> listOfIntegers ){
        return listOfIntegers.stream().max(Integer::compare).get();
    }

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

