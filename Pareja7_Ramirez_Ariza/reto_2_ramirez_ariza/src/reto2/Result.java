package reto2;

import java.util.ArrayList;

public class Result {
    private int max1;
    private int min1;
    private int count1;
    private boolean isMax1MultipleOfTwo;
    private boolean isMax1DivisorOfTwo;
    private boolean isCount1Even;

    private final int max2;
    private final int min2;
    private final int count2;
    private final boolean isMax2MultipleOfTwo;
    private boolean isMax2DivisorOfTwo;
    private boolean isCount2Even;

    public Result(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        max1 = CarreraParalela.maximum(list1);
        min1 = CarreraParalela.minunum(list1).get(0);
        count1 = CarreraParalela.minunum(list1).get(1);
        isMax1MultipleOfTwo = CarreraParalela.validateMultipleOfTwo(list1);
        isMax1DivisorOfTwo = CarreraParalela.validateDivOfTwo(list1);
        isCount1Even = CarreraParalela.validateEvenSize(list1);

        max2 = CarreraParalela.maximum(list2);
        min2 = CarreraParalela.minunum(list2).get(0);
        count2 = CarreraParalela.minunum(list2).get(1);
        isMax2MultipleOfTwo = CarreraParalela.validateMultipleOfTwo(list2);
        isMax2DivisorOfTwo = CarreraParalela.validateDivOfTwo(list2);
        isCount2Even = CarreraParalela.validateEvenSize(list2);
    }
    @Override
    public String toString() {
        return "List 1: " +"max=" + max1 +", min=" + min1 +", count=" + count1 +", isMaxMultipleOfTwo=" + isMax1MultipleOfTwo + ", isMaxDivisorOfTwo=" + isMax1DivisorOfTwo +
                ", isCountEven=" + isCount1Even + "\n"+
                "List 2: " +"max=" + max2 +", min=" + min2 +", count=" + count2 +", isMaxMultipleOfTwo=" + isMax2MultipleOfTwo + ", isMaxDivisorOfTwo=" + isMax2DivisorOfTwo +
                ", isCountEven=" + isCount2Even;
    }
}
