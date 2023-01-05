public class Question14 {

    public static void main(String[] args) {
        System.out.println(maxNumberFromArray(new int[]{11, 15, 13, 42, 93, 14}));
        System.out.println(secondMaxNumberFromArray(new int[]{11, 15, 13, 42, 42, 93, 14}));
    }

    private static int secondMaxNumberFromArray(int[] numbers) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2)
                max2 = number;
        }
        return max2;
    }

    private static int maxNumberFromArray(int[] numbers) {
        int maxNumber = Integer.MIN_VALUE;
        for (int number : numbers)
            if (number > maxNumber)
                maxNumber = number;
        return maxNumber;
    }
}
