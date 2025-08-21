package Pareja_rodriguez_martinez.reto2;

import java.util.List;

public class CarreraParalela {

    public int findMax(List<Integer> listOfIntegers ){
        return listOfIntegers.stream().max(Integer::compare).get();
    }

}
