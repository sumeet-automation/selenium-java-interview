package string;

import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Question24 {

    public static void main(String[] args) {
        System.out.println(reverseStringLambda("Hello World"));
        System.out.println(reverseStringLambdaSplitDecrement("Hello World"));
        System.out.println(reverseStringLambdaSplitIncrement("Hello World"));
    }

    private static String reverseStringLambda(String word) {
        return Stream.iterate((word.length() - 1), Question24::decrement).limit(word.length())
                .map(index -> String.valueOf(word.charAt(index)))
                .collect(joining());
    }

    private static String reverseStringLambdaSplitDecrement(String word) {
        final String[] splitArray = word.split("");
        return Stream.iterate((word.length() - 1), Question24::decrement).limit(word.length())
                .map(index -> splitArray[index])
                .collect(joining());
    }

    public static String reverseStringLambdaSplitIncrement(String word) {
        AtomicReference<String> output = new AtomicReference<>("");
        IntStream.range(0,word.length()).forEach(index-> output.set(word.charAt(index)+ output.get()));
        return output.get();
    }

    private static String reverseStringWithoutLambdaDecrement(final String word) {
        String output = "";
        for(int i=word.length()-1;i>0;i--) {
            output += word.charAt(i);
        }
        return output;
    }

    private static String reverseStringWithoutLambdaSplitIncrement(String word) {
        String output = "";
        for (int i=0;i<word.length();i++){
            output = word.charAt(i)+output;
        }
        return output;
    }

    private static Integer decrement(Integer index) {
        return index - 1;
    }
}
