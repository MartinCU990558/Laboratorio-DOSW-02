
import java.util.ArrayList;

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

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(212);
        numbers.add(3);
        numbers.add(20);
        numbers.add(42);
        numbers.add(5);
        System.out.println(maximum(numbers));
        System.out.println(minunum(numbers));
    }
}