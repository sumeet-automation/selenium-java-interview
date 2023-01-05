import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Question35 {

    public static void main(String[] args) {
        String word = "abds323a47b5a";
        System.out.println(sumAllNumbersWithoutLambda(word));
        System.out.println(sumAllNumbersLambda(word));

        String word2 = "abds323a47b5apop";
        Matcher matcher = Pattern.compile("(\\d+)|(pop)").matcher(word2);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }

    private static int sumAllNumbersWithoutLambda(String word) {
        Matcher matcher = Pattern.compile("(\\d+)").matcher(word);
        int sum = 0;
        while(matcher.find()){
            sum += parseInt(matcher.group(0));
        }
        return sum;
    }

    private static int sumAllNumbersLambda(String word) {
        return Pattern.compile("(\\d+)").matcher(word).results()
                .mapToInt(matchResult -> parseInt(matchResult.group(0))).sum();
    }

}
