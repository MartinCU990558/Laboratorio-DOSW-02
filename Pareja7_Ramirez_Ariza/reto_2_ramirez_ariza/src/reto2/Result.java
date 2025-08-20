package reto2;

import java.util.ArrayList;

public class Result {
    private ArrayList<Object> list1Result = new ArrayList<>();
    private ArrayList<Object> list2Result = new ArrayList<>();

    public Result(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1Result.add(CarreraParalela.maximum(list1));
        list1Result.add(CarreraParalela.minunum(list1).get(0));
        list1Result.add(CarreraParalela.minunum(list1).get(1));
        list1Result.add(CarreraParalela.validateMultipleOfTwo(list1));
        list1Result.add(CarreraParalela.validateDivOfTwo(list1));
        list1Result.add(CarreraParalela.validateEvenSize(list1));

        list2Result.add(CarreraParalela.maximum(list2));
        list2Result.add(CarreraParalela.minunum(list2).get(0));
        list2Result.add(CarreraParalela.minunum(list2).get(1));
        list2Result.add(CarreraParalela.validateMultipleOfTwo(list2));
        list2Result.add(CarreraParalela.validateDivOfTwo(list2));
        list2Result.add(CarreraParalela.validateEvenSize(list2));
    }

    @Override
    public String toString() {
        String[] labels = {"max: ", "min: ", "Size: ", "MultipleOfTwo: ", "DivOfTwo: ", "EvenSize: "};

        String list1Str = String.join("", list1Result.stream().map((value)->"  "+labels[list1Result.indexOf(value)]+value+"\n").toArray(String[]::new));
        String list2Str = String.join("", list2Result.stream().map((value)->"  "+labels[list2Result.indexOf(value)]+value+"\n").toArray(String[]::new));

        return "List 1:\n"+list1Str+"\nList 2:\n"+list2Str;

    }
}
