import java.util.stream.IntStream;

public class Question63 {

    public static void main(String[] args) {
        //Withoug Streams
        for(int i=10;i<100;i++)
        printNumber(i);

        for (int i = 10; i < 100; i++)
            if (printNumber2(i))
                System.out.println(i);
        
        //Using Streams
        IntStream.range(10, 100)
                .filter(x -> (x / 10) + (x % 10) == 10)
                .forEach(System.out::println);
    }

    public static void printNumber(int number) {
        String check = String.valueOf(number);
        String numbers[] = check.split("");
        if (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) == 10) {
            System.out.println(number);
        }
    }

    public static boolean printNumber2(int number) {
        return (number / 10) + (number % 10) == 10;
    }
}
