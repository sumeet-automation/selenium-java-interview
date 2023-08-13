package complex;/*
Given m x n matrix, rotate it by 90 degree in clockwise/anticlockwise direction depending on an input boolean value.

Output:

Input: (3x2 Matrix)
1 2    ---->  6 1
3 4    ---->  3 2
5 6    ---->  4 5
Clockwise:
3 1
4 2

Anti-clockwise
2 4
1 3
*/

import java.util.Arrays;

public class RotateMatrix {
//1 2 3 4
//1 1 3 4
    public static void main(String[] args) {
        int[][] matrix = {{1, 2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printMatrix(matrix);
        rotate(matrix, false);
        System.out.println("*".repeat(50));
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int column : rows) {
                System.out.println(column);
            }
        }
    }

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static int[][] rotate(int[][] matrix, boolean isClockwise) {
        transpose(matrix);
        final int length = matrix.length;
        if(isClockwise) {
            for (int i = 0; i < (length / 2); i++) {
                for (int j = 0; j < length; j++) {
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[j][length - i - 1];
                    matrix[j][length - i - 1] = temp;
                }
            }
        } else {
            for (int i = 0; i < (length ); i++) {
                for (int j = 0; j < length/2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][length - j - 1];
                    matrix[i][length - j - 1] = temp;
                }
            }
        }
        return matrix;
    }
}
