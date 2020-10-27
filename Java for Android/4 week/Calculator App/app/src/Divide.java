package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements CalculationsInterface {

    private int firstNumber;
    private int secondNumber;


    public Divide(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    @Override
    public int calculate() {

        int divideOperation;
        int moduloOperation;

        divideOperation = firstNumber / secondNumber;
        moduloOperation = firstNumber % secondNumber;

        return divideOperation * 10 + moduloOperation;

    }
}
