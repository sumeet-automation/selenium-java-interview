import java.util.stream.IntStream;

public class Question63 {

    public static void main(String[] args) {
        IntStream.range(10, 100)
                .filter(x -> (x / 10) + (x % 10) == 10)
                .forEach(System.out::println);
    }
}