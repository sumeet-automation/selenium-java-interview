import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Question2 {

    public static void main(String[] args) {
        int input[] = {6, 10, 7, 2, 5, 3, 4, 9, 8};
        System.out.println(findMissingNumbers(input));
        System.out.println(findMissingNumbers_Lambdas(input));
    }

    private static int findMissingNumbers_Lambdas(final int[] input) {
        IntPredicate arrayContainsPredicate = number -> arrayContainsNumber(input, number);
        return IntStream.rangeClosed(1, 10).filter(arrayContainsPredicate.negate()).findAny().getAsInt();
    }

    private static int findMissingNumbers(int[] input) {
        int output = 0;
        for (int num = 1; num <= 10; num++) {
            if(!arrayContainsNumber(input, num)){
                output = num;
            }
        }
        return output;
    }

    private static boolean arrayContainsNumber(int[] input, int num) {
        for (int in:input) {
            if (in==num)
                return true;
        }
        return false;
    }
}
