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
    public static String reverseMessage(String message) {
        StringBuffer buffer = new StringBuffer(message);
        return buffer.reverse().toString();
    }
    public static String repeatAndReverse(String message) {
        return reverseMessage(repeatMessage(message));
    }

    public static void main(String[] args) {
        System.out.println(repeatMessage("Hello"));
        System.out.println(reverseMessage("Hello"));
        System.out.println(repeatAndReverse("Hello"));
    }

}