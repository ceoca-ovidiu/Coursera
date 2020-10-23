package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        int counter = 0;
        if (size % 2 == 0) {
            plusLines(size);
            counter = upperPart(size, counter);
            middlePart(size, '-', counter);
            counter -= 2;
            counter = lowerPart(size, counter);
            plusLines(size);
        } else if (size == 1) {
            plusLines(size);
            mOut.println("|<>|");
            plusLines(size);
        } else {
            plusLines(size);
            counter =  upperPart(size, counter);
            middlePart(size, '=', counter);
            counter -= 2;
            counter = lowerPart(size, counter);
            plusLines(size);
        }
    }
    public int lowerPart(int size, int counter) {
        for (int i = size - 1; i > 0; i--) {
           mOut.print("|");

            for (int j = size - i - 1; j >= 0; j--) {
                mOut.print(" ");
            }
            mOut.print("\\");
            for (int j = counter; j > 0; j--) {
                if (i % 2 == 0) {
                    mOut.print("-");
                } else {
                    mOut.print("=");
                }
            }
            mOut.print("/");
            for (int j = size - i - 1; j >= 0; j--) {
                mOut.print(" ");
            }
            mOut.println("|");
            counter -= 2;
        }
        return counter;
    }
    public int upperPart(int size, int counter) {
        for (int i = 0; i < size - 1; i++) {
            mOut.print("|");
            for (int j = 0; j <= size - i - 2; j++) {
                mOut.print(" ");
            }
            mOut.print("/");
            for (int j = 0; j < counter; j++) {
                if (i % 2 == 0) {
                    mOut.print("=");
                } else {
                    mOut.print("-");
                }
            }
            mOut.print("\\");
            for (int j = 0; j <= size - i - 2; j++) {
                mOut.print(" ");
            }
            mOut.println("|");
            counter += 2;
        }
        return counter;
    }
    public void middlePart(int size, char sign, int counter) {
        mOut.print("|<");
        for (int i = 0; i < counter; i++) {
            mOut.print(sign);
        }
        mOut.print(">|\n");
    }
    public void plusLines(int size) {
        mOut.print("+");
        for (int i = 0; i < 2 * size; i++) {
            mOut.print("-");
        }
        mOut.print("+\n");
    }
}
