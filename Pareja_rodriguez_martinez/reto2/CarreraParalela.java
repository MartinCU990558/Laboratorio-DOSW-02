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

<<<<<<< Updated upstream
=======
    public static List<Integer> unifyResults(Integer min, Integer max){
        return new ArrayList<>(Arrays.asList(min, max));
    }

    public static boolean isEven(Integer number){
        return (number % 2 == 0) ? true:false;
    }
    public static boolean isTheListLongEven(List<Integer> lista) {
        return lista.size() % 2 == 0;
    }
>>>>>>> Stashed changes
}
