import java.util.stream.IntStream;

public class reto_3 {
    public static String repeatMessage(String message) {
        return IntStream.range(0, 3).mapToObj(i -> message)
                .collect(StringBuilder::new,
                        (sb, s) -> {
                            if (!sb.isEmpty()) sb.append(" ");
                            sb.append(s);
                        },StringBuilder::append).toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatMessage("Hello"));
    }
}