package util;

import java.util.Scanner;

public class Inquirer {
    private static final int ROW_COL_BOTTOM = 1;
    private static final int ROW_COL_TOP = 7;
    private static final int CELL_BOTTOM = -128;
    private static final int CELL_TOP = 127;

    public static byte[][] inquire() {
        Scanner scanner = new Scanner(System.in);

        int rows = ask(scanner, "rows number", ROW_COL_BOTTOM, ROW_COL_TOP);
        int cols = ask(scanner, "cols number", ROW_COL_BOTTOM, ROW_COL_TOP);

        byte[][] matrix = new byte[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String name = "cell [" + i + ";" + j + "]";
                matrix[i][j] = (byte) ask(scanner, name, CELL_BOTTOM, CELL_TOP);
            }
        }

        scanner.close();
        return matrix;
    }

    private static int ask(Scanner scanner, String name, int bottom, int top) {
        do {
            System.out.print("Enter " + name + " from " + bottom + " to " + top + ": ");
            int data = scanner.nextInt();

            if (data >= bottom && data <= top) {
                return data;
            }
        } while (true);
    }
}
