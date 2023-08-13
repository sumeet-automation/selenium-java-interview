package string;

import java.util.regex.Pattern;

public class Question42 {

    public static void main(String[] args) {
        String input = "sgaga haha jsj haha \"hshs jsjs jsjs\" hshs \"gshsh jsjs\"";
        Pattern.compile(" (?=([^\"]|\"[^\"]*\")*$)").splitAsStream(input).forEach(System.out::println);
    }

    private static void StringPermutation(String word) {
        StringPermutation("",word);
    }

    private static void StringPermutation(String limiter, String word) {
        if (limiter.length() == 0) {
            System.out.println(limiter);
            return;
        }
        System.out.println("Hello");
    }
}
