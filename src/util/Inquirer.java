package util;

import java.util.Scanner;

public class Inquirer {
    public static byte[][] inquire() {
        Scanner scanner = new Scanner(System.in);

        int rcBot = 1;
        int rcTop = 7;

        int cellBot = -128;
        int cellTop = 127;

        int rows = ask(scanner, "rows number", rcBot, rcTop);
        int cols = ask(scanner, "cols number", rcBot, rcTop);
        
        byte[][]matrix = new byte[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String name = "cell [" + i + ";" + j + "]";
                matrix[i][j] = (byte) ask(scanner, name, cellBot, cellTop);
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
