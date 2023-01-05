import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Question39 {
    public static void main(String[] args) {
        String word = "ABCD";
        Stream.of(word.split("")).forEach(letter-> System.out.printf(getNextAlphabet(letter)));
    }

    private static String getNextAlphabet(String letter) {
        int index = getAlphabetsList().indexOf(letter);
        return getAlphabetsList().get(index + 1);
    }

    private static List<String> getAlphabetsList() {
        return List.of("A","B","C","D","E","F","G","H","I","J",
                "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
    }
}
