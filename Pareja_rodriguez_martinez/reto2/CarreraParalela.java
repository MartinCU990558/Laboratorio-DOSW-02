package Pareja_rodriguez_martinez.reto2;

import java.util.List;

public class CarreraParalela {

    public int findMinimum(List<Integer> listOfIntegers ){
        return listOfIntegers.stream().min(Integer::compare).get();
    }

}
