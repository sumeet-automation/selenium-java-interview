import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public class Question4 {

    public static void main(String[] args) {
        evenNumbersLambdas(100);
    }

    private static void evenNumbersLambdas(int number) {
        range(1,number).filter(num->num%2==0).forEach(System.out::println);
    }
}
