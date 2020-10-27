package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;


    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;

    }


    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {

        switch (operation) {
            case 1: //add

                Add add = new Add(argumentOne, argumentTwo);
                mOut.print(String.valueOf(add.calculate())); // String.valueOf to convert int to string
                break;

            case 2: //substract

                Subtract subtract = new Subtract(argumentOne, argumentTwo);
                mOut.print(String.valueOf(subtract.calculate()));
                break;

            case 3://multiplication

                Multiply multiply = new Multiply(argumentOne, argumentTwo);
                mOut.print(String.valueOf(multiply.calculate()));
                break;

            default: // divide

                if (argumentTwo == 0) {
                    mOut.print("cannot divide by 0");
                } else {

                    Divide divide = new Divide(argumentOne, argumentTwo);
                    mOut.print(String.valueOf(divide.calculate() / 10) + " R: " + String.valueOf(divide.calculate() % 10)); // receive a number made of two parts first part is the actual number and the second part is the rest of the division

                }
        }
    }
}
