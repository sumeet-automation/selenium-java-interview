package string;

public class Question41 {

    public static void main(String[] args) {
        System.out.println(rotateString("ABCD"));
    }

    private static String rotateString(String word) {
        if(word.length()<=1)
            return word;
        StringBuilder output = new StringBuilder(String.valueOf(word.charAt(word.length()-1)));
        for (int i = 0; i < word.length()-1; i++) {
            output.append(word.charAt(i));
        }
        return output.toString();
    }
}
