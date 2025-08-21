package reto2;

import java.util.Arrays;
import java.util.List;

public class CarreraParalela {
    public static void main(String[] args) {}
 
        public static List<Integer> getMinAndAmount(List<Integer> l) {
        int min = l.stream().min(Integer::compare).get();
        int count = amount(l);
        return Arrays.asList(min, count);
    }
 
	private static int amount(List<Integer> l){return (int) l.stream().count();}
 
}