package string;

import java.util.*;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.*;

//Write a program to the least occurring character from a given string.
public class Question27 {

    public static void main(String[] args) {
        String word = "aHHellooooee";
        Map<Object, Set<String>> map = retrieveSetMap(word);
        map.forEach((k,v)-> System.out.printf("Count: %s Values: %s\n",k,v));
        System.out.println(map.values().stream().findFirst());
        helloFunctional((x, y) -> System.out.println(x.substring(y)));
        Supplier<Set<Integer>> lazyNumbers = () -> getNumbers();
        System.out.println("***************************");
        System.out.println(lazyNumbers.get());
    }

    public static Set<Integer> getNumbers() {
        System.out.println("Hello from Numbers");
        return IntStream.range(0, 10).boxed().collect(toSet());
    }
    private static void helloFunctional(ObjIntConsumer<String> consumer) {
        consumer.accept("hello", 2);
    }

    private static Map<Object, Set<String>> retrieveSetMap(String word) {
        return Stream.of(word.split(""))
                    .collect(groupingBy(each -> countFrequencyOfLetter(word, valueOf(each)), toSet()));
    }

    public static long countFrequencyOfLetter(String word, String letter) {
        return Arrays.stream(word.split("")).filter(each -> each.equals(letter)).count();
    }


}
