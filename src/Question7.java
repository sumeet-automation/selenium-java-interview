public class Question7 {

    public static void main(String[] args) {
        System.out.println(maxProductsFromArray(new int[]{1, 2, 67, 91, 4,91}));
    }

    private static Numbers maxProductsFromArray(int[] input) {
        if(input.length <=1) {
            throw new IllegalArgumentException("Array must be of size 2 or greater");
        }

        Numbers numbers = new Numbers(null,null,Integer.MIN_VALUE);
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if((input[i]*input[j])>numbers.maxProduct())
                    numbers =new Numbers(input[i], input[j], (input[i]* input[j]));
            }
        }
        return numbers;
    }

    record Numbers(Integer num1, Integer num2, Integer maxProduct){}

}

