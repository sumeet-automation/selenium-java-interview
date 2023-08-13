package string;

public class Question38 {

    public static void main(String[] args) {
        String word = "How are you.Mr";
        int index = word.indexOf(".")+1;
        System.out.println(word.substring(index));
    }
}
