package reto2;

import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD
import javax.naming.spi.DirStateFactory.Result;

public class CarreraParalela {
    public static void main(String[] args) {}
 
        public static List<Integer> getMinAndAmount(List<Integer> l) {
        int min = l.stream().min(Integer::compare).get();
        int count = amount(l);
        return Arrays.asList(min, count);
    }
 
	private static int amount(List<Integer> l){return (int) l.stream().count();}
=======
public class CarreraParalela {
    public static void main(String[] args) {}

    public static int getMax(List<Integer> l) {
        return (l.stream().max(Integer::compare).get());
    }
>>>>>>> 45970366583653013414c4f4b88051a2371fc3b9

    public void crash(List<Integer> l) {
        new Result(getMax(l), getMinAndAmount(l).get(0),getMinAndAmount(l).get(1));
    }
<<<<<<< HEAD
    
=======

>>>>>>> 45970366583653013414c4f4b88051a2371fc3b9
}

class Result {
    private int max;
    private int min;
    private int count;
<<<<<<< HEAD
 
=======

>>>>>>> 45970366583653013414c4f4b88051a2371fc3b9
    public Result(int max, int min, int count) {
        this.max = max;
        this.min = min;
        this.count = count;
    }
<<<<<<< HEAD
}

=======
}
>>>>>>> 45970366583653013414c4f4b88051a2371fc3b9
