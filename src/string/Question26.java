package string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class Question26 {

    public static void main(String[] args) {
        String word = "HelloWorld";
        System.out.println(wordFrequencyLambda(word));
        System.out.println(wordFrequencyCollectGroupBy(word));
    }

    private static Map<String, Integer> wordFrequencyLambda(String word) {
        Map<String, Integer> wordMap = new HashMap<>();
        Stream.of(word.split("")).forEach(letter->
                wordMap.compute(letter, (key, value) -> wordMap.get(key) == null ? 1 : value + 1));
        return wordMap;
    }

    private static Map<String, Long> wordFrequencyCollectGroupBy(String word) {
     return Stream.of(word.split("")).collect(groupingBy(identity(), counting()));
    }

    /*private static Map<String, Integer> wordFrequencyCollectToMap(String word) {
        return Stream.of(word.split(""))
                .collect(toMap(identity(),1,(value1,value2)->(value1)));


        String mutiLine = "hellohow";

    }*/
}
