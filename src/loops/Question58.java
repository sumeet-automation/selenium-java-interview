package loops;

import java.util.Arrays;

public class Question58 {

    public static void main(String[] args) {
        int[] array = {1,2,0,3,0,1,2,53};
        int outputArray[] = new int[array.length];
        int outputArrayIndex = 0;
        for(int i=0;i<array.length;i++) {
            if (array[i] != 0) {
                outputArray[outputArrayIndex++] = array[i];
            }
        }
        System.out.println(Arrays.toString(outputArray));
    }

}
