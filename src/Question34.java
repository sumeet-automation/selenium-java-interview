import java.util.List;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toSet;

public class Question34 {

    public static void main(String[] args) {
        var word = "HELLO, HOW ARE YOu";
        var vowels = List.of("A", "E", "I", "O", "U");
        //Print the count of vowels
        //Stream.of(word.split(""))
        System.out.println(Pattern.compile("").splitAsStream(word)
                .map(String::toUpperCase).filter(vowels::contains).collect(toSet()));

        for (String letter : word.split("")) {
            if (vowels.contains(letter.toUpperCase())) {
                System.out.print(letter);
            }
        }
    }
}
