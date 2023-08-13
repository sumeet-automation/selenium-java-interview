package complex;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question62 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] outputArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            outputArray[i] = createSubArrayAndMultiplyUsingLambda(array, i);
        System.out.println(Arrays.toString(outputArray));
        //Creating Output with Lambdas
        outputArray=null;
        outputArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            outputArray[i] = createSubArrayAndMultiplyUsingLambda(array, i);
        System.out.println(Arrays.toString(outputArray));
    }

    public static int createSubArrayAndMultiply(int[] array, int index) {
        int multiply=1;
        for (int i = 0; i < array.length ; i++) {
            if(i !=index)
            multiply*=array[i];
        }
        return multiply;
    }

    public static int createSubArrayAndMultiplyUsingLambda(int[] array, int index) {
        //int multiply=1;
        return IntStream.range(0,array.length).filter(x->x!=index)
                .map(x->array[x])
                .reduce(1,(a,b)->a*b);
    }
}

