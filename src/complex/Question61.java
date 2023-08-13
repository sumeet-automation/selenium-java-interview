package complex;

public class Question61 {

    public static void main(String[] args) {

        String input = "I  live   in   Bengaluru   ";
        input = input.replaceAll("\\s+", " ").strip();
        System.out.println(input);
    }
}
