import java.util.regex.Pattern;

public class Question59 {

    public static void main(String[] args) {
        String input = "sgaga haha jsj haha \"hshs jsjs jsjs\" hshs \"gshsh jsjs\"";
        Pattern.compile(" (?=([^\"]|\"[^\"]*\")*$)")
                .splitAsStream(input)
                .forEach(System.out::println);
    }

    public static void main() {
        String input = "sgaga haha jsj haha \"hshs jsjs jsjs\" hshs \"gshsh jsjs\"";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\"') {

            }
        }
    }
}
