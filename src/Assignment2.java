public class Assignment2 {

    public static void main(String[] args) {
        System.out.println(reverseAString("Hello World"));
    }

    private static String reverseAString(String input) {
        StringBuilder output = new StringBuilder();
        String[] wordArray = input.split("");
        for (int i = wordArray.length - 1; i >= 0; i--) {
            if (wordArray[i].equals(" "))
                output.append("_");
            else
                output.append(wordArray[i]);
        }
        return output.toString();
    }
}
