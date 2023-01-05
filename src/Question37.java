import java.util.List;

public class Question37 {

    private static final List<String> upperLetters = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
    private static final List<String> lowerLetters = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

    public static void main(String[] args) {
        String word = "GooD MorNinG!";
        String output = convertToUpperCase(word);
        System.out.println(output);
    }

    private static String convertToUpperCase(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            final String letter = String.valueOf(input.charAt(i));
            final int indexOfLetter = lowerLetters.indexOf(letter);
            output = indexOfLetter != -1 ? output + upperLetters.get(indexOfLetter) : output + letter;
        }
        return output;
    }
}
