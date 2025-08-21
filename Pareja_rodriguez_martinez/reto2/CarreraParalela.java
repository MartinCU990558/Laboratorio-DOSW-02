package Pareja_rodriguez_martinez.reto2;

import java.util.List;

public class CarreraParalela {

    public static Integer calculateMinimum(List<Integer> listOfNumbers){
        return listOfNumbers.stream().min(Integer::compare).get();
    }
}

