package Pareja_rodriguez_martinez.reto3;

import java.util.List;

public class Reto3 {

    public int findMinimum(List<Integer> listOfIntegers ){
        return listOfIntegers.stream().min(Integer::compare).get();
    }

}