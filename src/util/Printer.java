package util;

public class Printer {
    public static void printMatrix(byte[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("C Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((int) matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSum(int sum) {
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
