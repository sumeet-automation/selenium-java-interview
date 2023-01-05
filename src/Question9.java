import java.util.stream.Stream;

//Write a program to swap the first and last digit of a given number
public class Question9 {

    public static void main(String[] args) {
        int num = 123456;
        System.out.println(swapFirstAndLast(num));
    }

    private static String swapFirstAndLast(int num) {
        var numString = String.valueOf(num);
        var firstDigit = String.valueOf(numString.charAt(0));
        var lastDigit = String.valueOf(numString.charAt(numString.length()-1));
        String output = lastDigit;
        for(int i=1;i<numString.length()-2;i++){
            output+=numString.charAt(i);
        }
        output+=firstDigit;
        return output;
    }

    private static String swapFirstAndLast_Lambdas(int num) {
        var numString = String.valueOf(num);
        var firstDigit = String.valueOf(numString.charAt(0));
        var lastDigit = String.valueOf(numString.charAt(numString.length()-1));
        String output = lastDigit;
        Stream.of(numString.split(""));

        for(int i=1;i<numString.length()-2;i++){
            output+=numString.charAt(i);
        }

        output+=firstDigit;
        return output;
    }
}
