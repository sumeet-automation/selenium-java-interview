package loops;

import java.util.stream.IntStream;

public class Question3 {

    public static void main(String[] args) {
        System.out.println(sumOfEvenNumbers(10));
        System.out.println(sumOfEvenNumbersWithLambdas(10));
    }

    private static int sumOfEvenNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }

    private static int sumOfEvenNumbersWithLambdas(int number) {
        return IntStream.rangeClosed(1,number).filter(x->x%2==0).sum();
    }
}
