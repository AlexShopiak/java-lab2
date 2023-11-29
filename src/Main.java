import util.Inquirer;
import util.Calculator;
import util.Printer;

public class Main {
    public static void main(String[] args) {
        byte[][] bMatrix = Inquirer.inquire();
        Printer.printMatrix("Matrix B", bMatrix);

        byte[][] cMatrix = Calculator.transposeMatrix(bMatrix);
        int sum = Calculator.calculateSum(cMatrix);

        Printer.printMatrix("Matrix C=B^T", cMatrix);
        Printer.printSum(sum);
    }
}
