package randomarrayexceptioncheck;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Author:Levi Bevins  
 * Chapter:12
 * Lab:2
 */
public class RandomArrayExceptionCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //vars and objects
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        int upperbound = 300;
        
        try
        {
            //create array of 100 random ints
            for (int i = 0; i < array.length; i++)
            {
                array[i] = random.nextInt(upperbound);
                Arrays.sort(array);
            }
            //prompt user to enter index, if out of bounds give message and prompt user to try again
            while(true)
            {
                System.out.println("Enter in the index of the element you wish to view: ");
                int indexRequest = input.nextInt();
            
                if(indexRequest > array.length)
                {
                    System.out.println("Out of bounds");
                }
                else
                {
                    System.out.println(array[indexRequest]);
                    break;
                }
            }
        }
        //if user enters anything but an int send exception
        catch(InputMismatchException ex)
        {
            System.out.println("Must enter integer");
        }
        //general exceptions
        catch(Exception ex)
        {
            System.out.println("Something went wrong!");
        }
    }
    
}
