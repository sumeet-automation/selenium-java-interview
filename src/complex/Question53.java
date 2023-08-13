package complex;

import java.util.Optional;

public class Question53 {

    public static void main(String[] args) {
        System.out.println(isNumberGreaterThan5(4));
        isNumberGreaterThan5_Exit(10);
        isNumberGreaterThan5_lambda(1);
    }

    private static void isNumberGreaterThan5_Exit(int number) {
        if(number>5){
            System.out.println("Number is greater than 5");
            System.exit(0);
        }
        System.out.println("Number is less than 5");
        System.exit(0);
    }

    private static boolean isNumberGreaterThan5(int number) {
        if(number>5)
            return true;
        return false;
    }

    private static boolean isNumberGreaterThan5_lambda(int number) {
        return Optional.of(number).map(num -> num > 5).orElse(false);
    }
}
