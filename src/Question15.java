import java.util.*;
import java.util.stream.Collectors;

public class Question15 {

    public static void main(String[] args) {
        Integer[] input = {1, 111, 45, 19, 54, 111, 32, 32};
        System.out.println(getUniqueElements(input));
        Set.of(1, 2);
    }



    private static Set<Integer> getUniqueElements(Integer[] input) {
        return Arrays.stream(input).collect(Collectors.toSet());
    }
}
