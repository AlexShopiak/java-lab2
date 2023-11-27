import util.Inquirer;
import util.Calculator;
import util.Printer;

public class Main {
    public static void main(String[] args) {
        byte[][] initMatrix = Inquirer.inquire();

        Calculator.calculate(initMatrix);

        byte[][] matrix = Calculator.getMatrix();
        int sum = Calculator.getSum();

        Printer.printMatrix(matrix);
        Printer.printSum(sum);
    }
}
