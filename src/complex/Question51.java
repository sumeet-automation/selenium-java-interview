package complex;

import java.util.stream.IntStream;

import static java.lang.Math.log10;

public class Question51 {

    public static void main(String[] args) {
      ///  reverseAnInteger_whileLoop(654321);
       // reverseAnInteger_string(654321);
        reverseAnInteger_forLoop(654321);
        //reverseAnInteger_recursion(654321);
        reverseAnInteger_lambdas(654321);
    }

    private static void reverseAnInteger_lambdas(int number) {
        String numString = String.valueOf(number);
        IntStream.rangeClosed((numString.length()-1),0).mapToObj(numString::charAt).forEach(System.out::print);
    }

    private static void reverseAnInteger_recursion(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        int quotient = number / 10;
        int remaider = number % 10;
        number = quotient;
        System.out.print(remaider);
        reverseAnInteger_recursion(number);
    }

    private static void reverseAnInteger_whileLoop(int number) {
        int quotient = number / 10;
        int remainder = number % 10;
        while (quotient > 10) {
            quotient = number / 10;
            remainder = number % 10;
            number = quotient;
            System.out.print(remainder);
        }
        System.out.println(quotient);
    }

    private static void reverseAnInteger_forLoop(int number) {
        int length = (int) log10(number) + 1;
        for (int i = 0; i < length; i++) {
            int quotient = number / 10;
            int remainder = number % 10;
            number = quotient;
            System.out.print(remainder);
        }
        System.out.println();
    }

    private static void reverseAnInteger_string(int number) {

        String numString = String.valueOf(number);
        for (int i = (numString.length() - 1); i >= 0; i--) {
            System.out.print(numString.charAt(i));
        }
        System.out.println();
    }
}
