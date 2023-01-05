import java.util.*;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class Question30 {

    public static void main(String[] args) {
        System.out.println(wordFrequency("AAABBCDA"));
        System.out.println(wordFrequency_Compute("AAABBCDA"));
        System.out.println("wordFrequency_Merge: "+wordFrequency_Merge("AAABBCDA"));
        System.out.println(wordFrequency_Lambdas("AAABBCDA"));
        List<Integer> list = List.of(1, 2, 1, 23, 34, 23, 1);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }

    private static Map<String, Integer> wordFrequency_Merge(String word) {
        Map<String, Integer> map = new LinkedHashMap<>();
        Arrays.stream(word.split("")).forEach(key -> map.merge(key, 1, (k1, v1) -> v1 + 1));
        return map;
    }

    private static Map<Character, Integer> wordFrequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char key = word.charAt(i);
            if (map.containsKey(key))
                map.put(key, (map.get(key) + 1));
            else
                map.put(key, 1);
        }
        return map;
    }

    private static Map<String, Integer> wordFrequency_Split(String word) {
        Map<String, Integer> map = new HashMap<>();
        for (String key:word.split("")) {
            if (map.containsKey(key))
                map.put(key, (map.get(key) + 1));
            else
                map.put(key, 1);
        }
        return map;
    }

    private static Map<Character, Integer> wordFrequency_Compute(String word) {
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < word.length(); i++) {
            char key = word.charAt(i);
            map.compute(key, (k1, v1) -> map.get(k1) == null ? 1 : v1 + 1);
        }
        return map;
    }

    private static Map<String, Integer> wordFrequency_Lambdas(String word) {
        return Stream.of(word.split(""))
                .collect(groupingBy(identity(), summingInt(val -> 1)));
    }

    private static Map<String, Long> wordFrequency_LambdasCounting(String word) {
        return Stream.of(word.split(""))
                .collect(groupingBy(identity(), counting()));
    }

}
