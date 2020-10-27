package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements CalculationsInterface {
    private int firstNumber;
    private int secondNumber;

    public Subtract(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    @Override
    public int calculate() {
        return firstNumber - secondNumber;
    }
}
