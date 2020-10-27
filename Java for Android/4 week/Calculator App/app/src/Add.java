package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements CalculationsInterface {

    private int firstNumber;
    private int secondNumber;

    public Add(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    @Override
    public int calculate() {
        return firstNumber + secondNumber;
    }
}
