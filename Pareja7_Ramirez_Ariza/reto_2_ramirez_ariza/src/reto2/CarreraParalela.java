package reto2;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarreraParalela {
    public static int maximum(ArrayList<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo).get();
    }

    public static ArrayList<Integer> minunum(ArrayList<Integer> numbers) {
        int  minX = numbers.stream().min(Integer::compareTo).get();
        int sizeX = numbers.size();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(minX);
        result.add(sizeX);
        return result;
    }

    public static boolean validateOddSize(ArrayList<Integer> numbers) {
        return minunum(numbers).get(1) % 2 != 0 ? true: false;
    }

    public static Boolean validateDivOfTwo(ArrayList<Integer> numbers) {
        return 2 % maximum(numbers) == 0 ? true: false;

    }

    public static ArrayList<Integer> mergeList(ArrayList<Integer> max, ArrayList<Integer> minAndSize) {
        return Stream.concat(minAndSize.stream(), max.stream()).collect(Collectors.toCollection(ArrayList::new));
    }

    public static boolean validateMultipleOfTwo(ArrayList<Integer> numbers) {
        return maximum(numbers) % 2 == 0 ? true: false;
    }

    public static boolean validateEvenSize(ArrayList<Integer> numbers) {
        return minunum(numbers).get(1) % 2 == 0 ? true: false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(212);
        numbers1.add(3);
        numbers1.add(20);
        numbers1.add(42);
        numbers1.add(5);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(212);
        numbers2.add(3);
        numbers2.add(20);
        numbers2.add(42);
        numbers2.add(5);

        Result result = new Result(numbers1, numbers2);

        System.out.println(result);
    }
}