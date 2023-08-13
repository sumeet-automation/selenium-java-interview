package loops;

import java.util.List;

public class Question20 {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 60;

        int temp = num1;
        num1 = num2;
        num2 = num1;
        System.out.printf("num1 %d, num2 %d",num1,num2);
    }

    private static void swapNumbers_List(int num1, int num2) {
        List<Integer> list = List.of(num1, num2);
        num1 = list.get(1);
        num2 = list.get(0);
        System.out.println(num1);
        System.out.println(num2);
    }



}
