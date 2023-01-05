import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Question45 {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.asList(inputArray));
        System.out.println(Arrays.stream(inputArray).boxed().collect(toList()));
    }
}
