package util;

public class Calculator {
    public static byte[][] transposeMatrix(byte[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1 && cols == 1) {
            return matrix;

        } else if ( rows == cols) {
            for (int i = 0; i < rows - 1; i++) {
                for (int j = i + 1; j < cols; j++) {
                    byte buff = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = buff;
                }
            }

            return matrix;

        } else {
            byte[][] tMatrix = new byte[cols][rows]; //inverted rows, cols

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    tMatrix[j][i] = matrix[i][j]; 
                }
            }

            return tMatrix;
        }
    }

    public static int calculateSum(byte[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1 && cols == 1) {
            return matrix[0][0];
        } else {
            int sum = 0;

            for (int j = 0; j < cols; j++) {
                byte lowest = matrix[0][j];
                for (int i = 0; i < rows; i++) {
                    byte elem = matrix[i][j];
                    if (elem < lowest) lowest = elem;
                }
                sum += lowest;
            }

            return sum;
        }
    }
}
