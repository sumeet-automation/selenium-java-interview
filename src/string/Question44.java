package string;

public class Question44 {

    public static void main(String[] args) {
        System.out.println(getSubStringCount("hdun hund hundred", "haun"));
        System.out.println(getSubStringCount("ABCBCBAABCB", "BCB"));
    }

    public static int getSubStringCount(String input, String toBeSearched) {
        int count = 0;
        int index = 0;
        while (-1 != index) {
            index = input.indexOf(toBeSearched, index + 1);
            if (index != -1)
                count++;
        }
        return count;
    }
}
