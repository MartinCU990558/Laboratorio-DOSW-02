package reto2;

public class Result {
    private int max1;
    private int min1;
    private int count1;
    private boolean isMax1MultipleOfTwo;
    private boolean isMax1DivisorOfTwo;
    private boolean isCount1Even;

    private int max2;
    private int min2;
    private int count2;
    private boolean isMax2MultipleOfTwo;
    private boolean isMax2DivisorOfTwo;
    private boolean isCount2Even;
    
    @Override
    public String toString() {
        return "List 1: " +"max=" + max1 +"min=" + min1 +"count=" + count1 +"isMaxMultipleOfTwo=" + isMax1MultipleOfTwo + "isMaxDivisorOfTwo=" + isMax1DivisorOfTwo +
                "isCountEven=" + isCount1Even + "\n"+
                "List 2: " +"max=" + max2 +"min=" + min2 +"count=" + count2 +"isMaxMultipleOfTwo=" + isMax2MultipleOfTwo + "isMaxDivisorOfTwo=" + isMax2DivisorOfTwo +
                "isCountEven=" + isCount2Even;
    }
}
