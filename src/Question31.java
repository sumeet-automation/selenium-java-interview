import java.util.Arrays;

import static java.util.stream.Collectors.toList;

//Given a string ‘ABC CORPORATION CENTER’, find the index of second last ‘C’.
public class Question31 {

    public static void main(String[] args) {
        final String input = "ABC CORPORATION CENTER";
        System.out.println(getSecondLastIndex(input,"C"));
    }

    private static int getSecondLastIndex(String input, String wordToFind) {
        var list = Arrays.stream(input.split("")).collect(toList());
        return list.subList(0, input.lastIndexOf(wordToFind)).lastIndexOf(wordToFind);
    }
}
