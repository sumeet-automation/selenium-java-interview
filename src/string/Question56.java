package string;

public class Question56 {

    public static void main(String[] args) {
        final String word = "AAAAAxyzBBCCDEF";
        final String wordToInspect = "xyz";
        System.out.println(isWordInMiddle(word, wordToInspect));
    }

    private static boolean isWordInMiddle(String word, String wordToInspect) {
        final int indexOfInspectingWord = word.indexOf(wordToInspect);
        if (-1 == indexOfInspectingWord) {
            return false;
        } else {
            final int traillingWordLength = word.substring(0, indexOfInspectingWord).length();
            final int leadingWordLength = word.substring(indexOfInspectingWord + wordToInspect.length()).length();
            return Math.abs(leadingWordLength - traillingWordLength) > 1 ? false : true;
        }
    }
}
