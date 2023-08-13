package string;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class Question33 {


    public static void main(String[] args) {
        String word = "rt043vf543po90lp765pop1000";
        int sum = getSumUsingPattern(word);
        int sum2 = getSumUsingPattern_Lambdas(word);
        int sum3 = getSumUsingPattern_TryCatch(word);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
    }


    private static int getSumUsingPattern_TryCatch(String word) {
        int sum = 0;
        for(int i=0;i<word.length();i++) {
            try {
                sum += parseInt(valueOf(word.charAt(i)));
            } catch (NumberFormatException ignored) { }
        }
        return sum;
    }

    private static int getSumUsingPattern(String word) {
        Matcher matcher = Pattern.compile("(\\d)").matcher(word);
        int sum = 0;
        while (matcher.find()) {
            sum += parseInt(matcher.group());
        }
        return sum;
    }

    private static int getSumUsingPattern_Lambdas(String word) {
        return Pattern.compile("(\\d)").matcher(word).results().map(MatchResult::group)
                                        .mapToInt(Integer::parseInt).sum();
    }

}
