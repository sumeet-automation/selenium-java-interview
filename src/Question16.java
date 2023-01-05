import java.util.*;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class Question16 {

    public static void main(String[] args) {
        int input = 90981120;
        var map1 = Arrays.stream(String.valueOf(input).split("")).map(Integer::valueOf)
                .collect(groupingBy(identity(),counting()));
        System.out.println("map1 = " + map1);
        System.out.println("***************");
        var map2 = Arrays.stream(String.valueOf(input).split("")).map(Integer::valueOf)
                .collect(groupingBy(identity(),counting()));
        System.out.println("map2 = " + map2);
        System.out.println("***************");
        var map3 = Arrays.stream(String.valueOf(input).split("")).map(Integer::valueOf)
                .collect(groupingBy(identity(), LinkedHashMap::new,counting()));
        System.out.println("map3 = " + map3);
        System.out.println("***************");
        var map4 = Arrays.stream(String.valueOf(input).split("")).map(Integer::valueOf)
                .collect(toMap(identity(), value -> 1, (value1, value2) -> value1 + 1, LinkedHashMap::new));
        System.out.println("map4 = " + map4);
    }
}
