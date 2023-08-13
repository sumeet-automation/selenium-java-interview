package loops;

import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class Question11 {

    public static void main(String[] args) {
        System.out.println(sumOfAllDigits(654231));
        System.out.println(sumOfAllDigitsWithLambdas(654321));
    }

    private static int sumOfAllDigits(int number) {
        int sum=0;
        int length = (int) Math.log10(number);
        int quotient = number/10;
        int remainder = number%10;
        for (int i=0;i<length;i++){
            quotient = number/10;
            remainder = number%10;
            number = quotient;
            sum+=remainder;
        }
        sum+=number;
        return sum;
    }

    private static int sumOfAllDigitsWithLambdas(final int number){
        return IntStream.range(0, valueOf(number).length())
                        .mapToObj(x-> valueOf(number).charAt(x))
                        .mapToInt(x-> parseInt(valueOf(x))).sum();
    }
}
