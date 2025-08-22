package Pareja_rodriguez_martinez.reto2;

import java.util.ArrayList;
import java.util.List;

public class CarreraParalela {

    public int findMax(List<Integer> listOfIntegers ){
        return listOfIntegers.stream().max(Integer::compare).get();
    }

    public List<Integer> unifyResults(Integer min, Integer max){
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(min);
        listOfIntegers.add(max);
        return listOfIntegers;
    }

}
