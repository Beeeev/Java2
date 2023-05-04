package multithreading;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 *
 * @author Levi
 */
public class Value {
    //vars
    public int number;
    private final int max = 9;
    private final int min = 0;
    Random random = new Random();
    //lock and condition to control threads
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    
    //same for both methods pretty much, lock thread, get randomNum,
    //add or sub number till number exceeds 10 or -10 and go back to respective thread to continue task
    public void incrementRandom(int randomTime, int amountOfRuns)
    {
        lock.lock();
        int randomNum = random.nextInt((max - min) + 1) + min;
        number = number + randomNum;
        try
        {
             if(number > 10)
             {
                System.out.println("(" + amountOfRuns + ")" + " Increase thread waiting: " + randomTime);
                condition.await();
             }
            System.out.println("(" + amountOfRuns + ")" + " increase thread executed: \t" + "amount = " + randomNum + "\tnumber = " + number);
        }
        catch(InterruptedException ex)
        {}
        finally
        {
            lock.unlock();
        }
    
        
    }
    public void decreaseRandom(int randomTime, int amountOfRuns)
    {
        lock.lock();
        int randomNum = random.nextInt((max - min) + 1) + min;
        number = number - randomNum;
        try
        {
             if(number < -10)
             {
                System.out.println("(" + amountOfRuns + ")" + " Decrease thread waiting: " + randomTime);
                condition.await();
             }
            System.out.println("(" + amountOfRuns + ")" + " Decrease thread executed: \t" + "amount = " + randomNum + "\tnumber = " + number );
        }
        catch(InterruptedException ex)
        {}
        finally
        {
            lock.unlock();
        }
     }

    public int getNumber() {
        return number;
    }

    
   }
    
