package string;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class Question32 {

    public static void main(String[] args) {
        String word="abds323a4b45a";

        System.out.println(IntStream.range(0, word.length())
                .mapToObj(word::charAt).filter(Character::isDigit).count());

    }
}
