import java.util.*;
import java.util.stream.Collectors;

public class Assignment1 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("chris_amit_jeny_karan_amit_tim"));
        System.out.println(removeDuplicatesUsingSet("chris_amit_jeny_karan_amit_tim"));
        System.out.println(removeDuplicatesUsingSetAndLambdas("chris_amit_jeny_karan_amit_tim"));
    }

    private static String removeDuplicates(String input) {
        StringBuilder output = new StringBuilder();
        List<String> names = Arrays.asList(input.split("_"));
        List<String> withoutDuplicates = new ArrayList<>();
        for (String name : names) {
            if (!withoutDuplicates.contains(name))
                withoutDuplicates.add(name);
        }
        for (int i = 0; i < withoutDuplicates.size()-1; i++) {
            output.append(withoutDuplicates.get(i) + "_");
        }
        return output.append(withoutDuplicates.get(withoutDuplicates.size()-1)).toString();
    }

    private static String removeDuplicatesUsingSet(String input) {
            Set<String> names = new LinkedHashSet<>(Arrays.asList(input.split("_")));
        StringBuilder output = new StringBuilder();
        for (String name : names ) {
            output.append(name + "_");
        }
        return output.toString();
    }

    private static String removeDuplicatesUsingSetAndLambdas(String input) {
        Set<String> names = new LinkedHashSet<>(Arrays.asList(input.split("_")));
        return names.stream().collect(Collectors.joining("_"));
    }
}
