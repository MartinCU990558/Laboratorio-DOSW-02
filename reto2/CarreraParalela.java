
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
    public void lastGoal(List<Integer> l1, List<Integer> l2) {
        Result resultadoFinal1 = new Result(getMax(l1), getMinAndAmount(l1).get(0),getMinAndAmount(l1).get(1));
        Result resultadoFinal2= new Result(getMax(l2), getMinAndAmount(l2).get(0),getMinAndAmount(l2).get(1));
        resultadoFinal1.setIsMaxEven(crash(l1));
        resultadoFinal1.setIsAmountEven(isAmountEven(l1));
        resultadoFinal2.setIsMax2or1(crash(l2));
        resultadoFinal2.setIsAmountEven(!isAmountOdd(l2));
    }

    public boolean isAmountOdd(List<Integer> l){
        return (amount(l) % 2 == 1);
    }
    public boolean isAmountEven(List<Integer> l){
        return (amount(l) % 2 == 0);
    }
    
}

class Result {
    private int max;
    private int min;
    private int count;
    private boolean isMaxMultipleOfTwo;
    private boolean isMaxDivisorOfTwo;
    private boolean isAmountEven;

    public Result(int max, int min, int count) {
        this.max = max;
        this.min = min;
        this.count = count;
    }
    public void setIsMaxEven(boolean isMaxEven) {this.isMaxMultipleOfTwo = isMaxEven;}
    public void setIsMax2or1(boolean isMax2or1) {this.isMaxDivisorOfTwo = isMax2or1;}
    public void setIsAmountEven(boolean isAmountEven) {this.isAmountEven = isAmountEven;}
}
