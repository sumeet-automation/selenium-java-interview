public class StringMimimum {

    public static void main(String[] args) {
        String word = "diaebfebadf";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length() && count <2; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count==1) {
                System.out.println("output: " + word.charAt(i));
                break;
            }
        }
    }
}
