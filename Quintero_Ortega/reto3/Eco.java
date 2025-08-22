package Quintero_Ortega.reto3;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Eco {
    public static String repetirBuilder(String msg) {
        return IntStream.range(0, 3)
                .mapToObj(i -> msg)
                .collect(Collector.of(
                        StringBuilder::new,
                        (sb, s) -> { if (sb.length() > 0) sb.append(" "); sb.append(s); },
                        (sb1, sb2) -> { if (sb1.length() > 0 && sb2.length() > 0) sb1.append(" "); sb1.append(sb2); return sb1; },
                        StringBuilder::toString
                ));
    }

    public static String invertirBuffer(String msg) {
        return new StringBuffer(msg).reverse().toString();
    }

    public static String ecoMisterioso(String msg) {
        String repetido = repetirBuilder(msg);
        return new StringBuffer(repetido).reverse().toString();
    }

    public static void invocarConLambda() {
        Function<String, String> fn = m -> ecoMisterioso(m);
        System.out.println(fn.apply("Hola"));
    }
}

