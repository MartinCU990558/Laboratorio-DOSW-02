import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class CarreraParalela{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<2; i++){
            System.out.println("cuantos numeros vas a escribir para la lista "+ i);

            List<Integer> numeros = new ArrayList<>();
            int cantidad_numeros = Integer.parseInt(scanner.nextLine());
            for(int j=0; j<cantidad_numeros;j++){
                int numero = Integer.parseInt(scanner.nextLine());
                numeros.add(numero);
            }
            numero(numeros);
        }
    }
    private static void numero(List<Integer> numeros){
        Optional<Integer> maximo = numeros.stream().max((a, b) -> a - b);
        Optional<Integer> minimo = numeros.stream().min((a, b) -> a - b);
        long cantidad = numeros.stream().count();
        if (maximo.isPresent()) {
            System.out.println("El número más grande es: " + maximo.get());
            System.out.println("El número más pequeño es: " + minimo.get());
            System.out.println("La cantidad de números ingresados es: " + cantidad);
            System.out.println(maximo.get() % 2 == 0 ? "el numero es multiplo de 2" : "el numero no es multiplo de 2" );
            System.out.println((2 % maximo.get() == 0) ? "El maximo es divisor de dos" : "El maximo no es divisor de dos");
            System.out.println((cantidad % 2 == 0) ? "La cantidad de datos de la lista de numeros es par" : "La cantidad de datos de la lista de numeros es par");
            System.out.println((cantidad % 2 != 0) ? "La cantidad de números ingresados es impar" : "La cantidad de números ingresados es par");
        }

        else {
            System.out.println("La lista está vacía");
        }
    }
}
