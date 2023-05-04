package multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Levi
 */
public class ValueUser {
    public static void primaryMethod() {
        //creates pool of threads for each task, create value object so it can be shared between classes, shutdown when done
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Value value = new Value();
        executor.execute(new ValueIncrease(value));
        executor.execute(new ValueDecrease(value));
        executor.shutdown();
    }

}
