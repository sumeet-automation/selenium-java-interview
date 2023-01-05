import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class Question22 {

    public static void main(String[] args) {
        //Given a number, calculate the sum of all even digits and all odd digits separately in a given number.
        int sum1 = sumOfEvenDigits(1234567);
        int sum2 = sumOfOddDigits(1234567);
        System.out.println(sum1);
        System.out.println(sum2);
    }

    private static int sumOfEvenDigits(final int number) {
        return IntStream.range(0, valueOf(number).length())
                .filter(Question22::isEven)
                .mapToObj(x-> valueOf(number).charAt(x))
                .mapToInt(x-> parseInt(valueOf(x))).sum();
    }

    private static int sumOfOddDigits(final int number) {
        return IntStream.range(0, valueOf(number).length())
                .filter(Question22::isOdd)
                .mapToObj(x-> valueOf(number).charAt(x))
                .mapToInt(x-> parseInt(valueOf(x))).sum();
    }

    private static boolean isEven(int number) {
        return number%2==0;
    }

    private static boolean isOdd(int number) {
        return number%2!=0;
    }
}
