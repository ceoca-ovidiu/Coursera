package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements CalculationsInterface {

    private int firstNumber;
    private int secondNumber;

    public Multiply(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    @Override
    public int calculate() {
        return firstNumber * secondNumber;
    }
}
