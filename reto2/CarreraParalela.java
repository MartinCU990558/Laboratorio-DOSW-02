
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }

    public static int getMax(List<Integer> l) {
        return (l.stream().max(Integer::compare).get());
    }

    private static int amount(List<Integer> l){return (int) l.stream().count();}

    public static List<Integer> getMinAndAmount(List<Integer> l) {
        int min = l.stream().min(Integer::compare).get();
        int count = amount(l);
        return Arrays.asList(min, count);
    }

    public static void crash(List<Integer> l) {
        new Result(getMax(l), getMinAndAmount(l).get(0),getMinAndAmount(l).get(1));
    }

}

class Result {
    private int max;
    private int min;
    private int count;

    public Result(int max, int min, int count) {
        this.max = max;
        this.min = min;
        this.count = count;
    }
}
