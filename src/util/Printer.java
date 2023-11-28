package util;

public class Printer {
    public static void printMatrix(String name, byte[][] matrix) {
        System.out.println("\n" + name);

        for (byte[] row : matrix) {
            for (byte element : row) {
                System.out.print((int) element + " ");
            }
            System.out.println();
        }
    }

    public static void printSum(int sum) {
        System.out.println("\nSum: " + sum + "\n");
    }
}
