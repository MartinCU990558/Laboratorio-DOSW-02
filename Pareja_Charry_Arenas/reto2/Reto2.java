import java.util.List;

class Resultados {
    private int maximoLista1;
    private int minimoLista1;
    private int cantidadLista1;
    private String multiploDivisorLista1;
    private String parImparLista1;

    private int maximoLista2;
    private int minimoLista2;
    private int cantidadLista2;
    private String multiploDivisorLista2;
    private String parImparLista2;

    public Resultados(
            int maximoLista1, int minimoLista1, int cantidadLista1, String multiploDivisorLista1, String parImparLista1,
            int maximoLista2, int minimoLista2, int cantidadLista2, String multiploDivisorLista2, String parImparLista2
    ) {
        this.maximoLista1 = maximoLista1;
        this.minimoLista1 = minimoLista1;
        this.cantidadLista1 = cantidadLista1;
        this.multiploDivisorLista1 = multiploDivisorLista1;
        this.parImparLista1 = parImparLista1;
        this.maximoLista2 = maximoLista2;
        this.minimoLista2 = minimoLista2;
        this.cantidadLista2 = cantidadLista2;
        this.multiploDivisorLista2 = multiploDivisorLista2;
        this.parImparLista2 = parImparLista2;
    }

    @Override
    public String toString() {
        return "Resultados Lista 1 -> Máximo: " + maximoLista1 + ", Mínimo: " + minimoLista1 + ", Cantidad: " + cantidadLista1 +
                ", " + multiploDivisorLista1 + ", " + parImparLista1 + "\n" +
                "Resultados Lista 2 -> Máximo: " + maximoLista2 + ", Mínimo: " + minimoLista2 + ", Cantidad: " + cantidadLista2 +
                ", " + multiploDivisorLista2 + ", " + parImparLista2;
    }
}

public class CarreraParalela {

    private static Resultados calcularResultadosFinales(List<Integer> lista1, List<Integer> lista2) {
        int max1 = lista1.stream().max(Integer::compareTo).orElseThrow();
        int min1 = lista1.stream().min(Integer::compareTo).orElseThrow();
        int cant1 = lista1.size();
        String multDiv1 = (max1 % 2 == 0) ? "Máximo es múltiplo de 2" : (2 % max1 == 0) ? "Máximo es divisor de 2" : "Máximo no es múltiplo ni divisor de 2";
        String parImpar1 = (cant1 % 2 == 0) ? "Cantidad par" : "Cantidad impar";

        int max2 = lista2.stream().max(Integer::compareTo).orElseThrow();
        int min2 = lista2.stream().min(Integer::compareTo).orElseThrow();
        int cant2 = lista2.size();
        String multDiv2 = (max2 % 2 == 0) ? "Máximo es múltiplo de 2" : (2 % max2 == 0) ? "Máximo es divisor de 2" : "Máximo no es múltiplo ni divisor de 2";
        String parImpar2 = (cant2 % 2 == 0) ? "Cantidad par" : "Cantidad impar";

        return new Resultados(max1, min1, cant1, multDiv1, parImpar1, max2, min2, cant2, multDiv2, parImpar2);
    }

    public static void main(String[] args) {
        List<Integer> lista1 = List.of(5, 2, 9, 1, 7);
        List<Integer> lista2 = List.of(8, 4, 6, 3, 10);

        Resultados resultados = calcularResultadosFinales(lista1, lista2);
        System.out.println(resultados);
    }
}
