package multithreading;

import java.util.Random;

/**
 *
 * @author Levi
 */
public class ValueDecrease implements Runnable {
    //vars
    Random random = new Random();
    private final int max = 249;
    private final int min = 0;
    public int randomTime;
    public int amountOfRuns;
    private Value valueObject;
    //passed from Value user so they can the same object
    public ValueDecrease(Value valueObject) {
        this.valueObject = valueObject;
    }
    //random time selected, run ten times and keep track of amount of tasks, sleep between each call
    @Override
    public void run()
    {
        randomTime = random.nextInt((max - min) + 1) + min;
        for(int i=0; i<10;i++)
        {
            amountOfRuns++;
            valueObject.decreaseRandom(randomTime, amountOfRuns);
            try
            {
                Thread.sleep(randomTime);
            }
            catch(InterruptedException ex)
            {}
        }
    }
    //used to pass time to Value class
    public int getRandomTime() {
        return randomTime;
    }
    
}
