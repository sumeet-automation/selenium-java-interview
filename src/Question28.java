import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.*;

//Write a program to the least occurring character from a given string.
public class Question28 {

    public static void main(String[] args) {
        String word = "aHHellooooee";
        Map<Object, Set<String>> map = retrieveSetMap(word);
        map.forEach((k,v)-> System.out.printf("Count: %s Values: %s\n",k,v));
        System.out.println(map.values().stream());
    }

    private static Map<Object, Set<String>> retrieveSetMap(String word) {
        return Stream.of(word.split(""))
                .collect(groupingBy(each -> countFrequencyOfLetter(word, valueOf(each)), toSet()));
    }

    public static long countFrequencyOfLetter(String word, String letter) {
        return Arrays.stream(word.split("")).filter(each -> each.equals(letter)).count();
    }

}
