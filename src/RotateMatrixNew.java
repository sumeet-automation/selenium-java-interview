public class RotateMatrixNew {

    public static void main(String[] args) {
        int[][] input = {{1, 2}, {3,4} };
        //System.out.println(input[0].length);
        var output = rotateMatrix(input, false);
        printMatrix(output);
    }

    private static int[][] rotateMatrix(int[][] input, boolean clockWise) {
        int[][] output = new int[input.length][input[0].length];
        if(clockWise) {
            for (int row = 0; row < input.length; row++) {
                for (int column = 0; column < input[0].length; column++) {
                    output[row][column] = input[input.length - column - 1][row];
                }
            }
        } else {
            for (int row = 0; row < input.length; row++) {
                for (int column = 0; column < input[0].length; column++) {
                    output[row][column] = input[column][input[0].length];
                }
            }
        }
        return output;
    }

    private static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
