import java.util.ArrayList;
import java.util.List;

public class Question50 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);//Index 1
        list.add(3);//Index 2
        list.add(5);//Index 4
        list.add(4);//Index 3
        list.add(1);//Index 0
        System.out.println(list.indexOf(2));
    }
}
