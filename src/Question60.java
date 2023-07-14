import java.util.ArrayList;
import java.util.List;

public class Question60 {

    public static void main(String[] args) {
        List<Integer> squaresList = getAllSquareNumbersUpto(10);
        for (int i = 1; i <= 100; i++) {
            if (!squaresList.contains(i)) {
                System.out.println(i);
            }
        }
    }

    private static List<Integer> getAllSquareNumbersUpto(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= number; i++)
            list.add(i * i);
        return list;
    }
}
