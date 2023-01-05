public class Question57 {

    public static void main(String[] args) {
        final String word = "Hello, My name is Sumeet";
        String reverseWord = reverseWord(word.replaceAll(" ",""));
        StringBuilder output = new StringBuilder(reverseWord);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                output.insert(i," ");
            }
        }
        System.out.println(output);
    }

    private static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
