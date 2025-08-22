package Quintero_Ortega.reto2;

import java.util.List;
import java.util.NoSuchElementException;
 
public class CarreraParalela {
    public static int obtenerMaximo(List<Integer> numeros) {
        return numeros.stream()
                      .max((a, b) -> a - b)
                      .orElseThrow(() -> new NoSuchElementException("La lista está vacía"));
    }
}