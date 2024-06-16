import java.util.Arrays;

public class Question66 {

    public static void main(String[] args) {
        int[] array = {10000, 2006, 2, 3, 1, 2, 4, 6, 9000, 1000};
        final int windowSize = 4;
        System.out.println(maxSubArrayOfLength(array, windowSize));
    }

    public static int maxSubArrayOfLength(int[] array, int windowSize) {
        int windowSum = Arrays.stream(array).limit(windowSize).sum();
        int maxSum = windowSum;
        for (int i = 1; i < array.length - windowSize + 1; i++) {
            int tempSum = windowSum - array[i - 1] + array[i + windowSize - 1];
            maxSum = Math.max(tempSum, maxSum);
            windowSum = tempSum;
        }
        return maxSum;
    }
}
