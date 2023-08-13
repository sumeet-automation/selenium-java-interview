package complex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question52 {

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set3 = new HashSet(Arrays.asList(new Integer[]{1,2,3,4,5}));
        Set<Integer> set4 = IntStream.rangeClosed(1,5).boxed().collect(Collectors.toSet());
    }
}
