package mooc.vandy.java4android.gate.logic;

import java.lang.reflect.Array;
import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    public void setCorralGates(Gate[] gate, Random rand){

        mOut.println("Initial gate setup : ");
        for(Gate gateIterator : gate){

            gateIterator.setSwing(rand.nextInt(3)-1);
            gateIterator.toString();

        }


    }

    public boolean anyCorralAvailable(Gate[] corral){

        for(Gate gateIterator : corral){

            if(gateIterator.getSwingDirection() == Gate.IN){
                return true;
            }

        }

        return false;

    }

    public int  corralSnails(Gate[] corral, Random rand){

        int pastureSnails = 5;
        int attemptCount = 0;
        int randomNumber = 0;
        int randomGate = 0;
        do {
            randomGate = rand.nextInt(corral.length);
            randomNumber = rand.nextInt(pastureSnails)+1;
            mOut.println(randomNumber + " are trying to move through corral " + randomGate);
            pastureSnails-=corral[randomGate].thru(randomNumber);
            attemptCount++;
        } while(pastureSnails > 0);
        mOut.println("It took "+attemptCount+" attempts to corral all of the snails.");
        return attemptCount;

    }

}
