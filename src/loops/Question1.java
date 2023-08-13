package loops;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.util.function.Predicate.not;
import static java.util.stream.IntStream.rangeClosed;

public class Question1 {

    public static void main(String[] args) {
        printNumbers();
        printNumbersLambdas();
        List<Integer> ignoredNumber = List.of(4, 7, 8);
        printNumbersUsingList(ignoredNumber);
    }

    private static void printNumbersUsingList(List<Integer> ignoredNumber) {
        for (int i=1; i<=10; i++) {
            if ( !ignoredNumber.contains(i) ) {
                System.out.println(i);
            }
        }
    }

    public static void printNumbers() {
        for (int i=1; i<=10; i++) {
            if ( i!=4 || i !=7 || i!=8 ) {
                System.out.println(i);
            }
        }
    }

    public static void printNumbersLambdas() {
        rangeClosed(1,10).filter(number->(number!=4 || number!=7 || number!=8)).forEach(System.out::println);
    }
}
