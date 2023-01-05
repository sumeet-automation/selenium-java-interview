import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class Assignment4 {

    public static void main(String[] args) {
        System.out.println(countWordsFromArray(new String[]{"A", "B", "C", "B", "C", "D"}));
        System.out.println(countWordsFromArrayJava7(new String[]{"A", "B", "C", "B", "C", "D"}));
        System.out.println(getListofEachCount(new String[]{"A", "B", "C", "B", "C", "D"}));
    }

    private static Map<String, Integer> countWordsFromArray(String[] input) {
        var map = new HashMap<String, Integer>();
        Arrays.stream(input).forEach(word -> map.compute(word, (k, v) -> v == null ? 1 : v + 1));
        return map;
    }

    private static Map<String, Long> countWordsFromArrayJava7(String[] input) {
        var output = Arrays.stream(input).collect(groupingBy(Function.identity(), counting()));
        return output;
    }

    private static Map<Integer, List<String>> getListofEachCount(String[] input) {
        var output = countWordsFromArray(input);
        return output.entrySet().stream().collect(groupingBy(Map.Entry::getValue, mapping(Map.Entry::getKey, toList())));
    }

}
