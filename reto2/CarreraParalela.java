package reto2;

import java.util.Arrays;
import java.util.List;

public class CarreraParalela {
    public static void main(String[] args) {}

    public static int getMax(List<Integer> l) {
        return (l.stream().max(Integer::compare).get());
    }
}