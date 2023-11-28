import util.Inquirer;
import util.Calculator;
import util.Printer;

public class Main {
    public static void main(String[] args) {
        byte[][] initMatrix = Inquirer.inquire();

        byte[][] tMatrix = Calculator.transposeMatrix(initMatrix);;
        int sum = Calculator.calculateSum(tMatrix);

        Printer.printMatrix(tMatrix);
        Printer.printSum(sum);
    }
}
