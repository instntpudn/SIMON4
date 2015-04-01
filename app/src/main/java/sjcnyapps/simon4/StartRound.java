package sjcnyapps.simon4;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by keith_000 on 3/25/2015.
 */
public class StartRound {


    public static void startRound(ArrayList<Integer> sequence)
    {
        addToSequence(sequence);
    }

    public static void addToSequence(ArrayList<Integer> sequence)
    {

        int i = generateRandom();
    }

    public static int generateRandom()
    {
        Random rand = new Random();
        int randomNum = rand.nextInt((4) + 1);
        return randomNum;
    }
}
