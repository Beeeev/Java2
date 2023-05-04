package randomdatafilesort;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Author:Levi Bevins
 * Chapter:12
 * Lab:1
 */
public class RandomDataFileSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //vars and objects
        java.io.File file = new java.io.File("randomdata.dat");
        Random random = new Random();
        int[] array = new int[100];
        int upperbound = 300;
        
        //if file exists, exit and tell user
        if(file.exists())
        {
            System.out.println("File already exists");
            System.exit(0);
        }
        //try to use file and write 100 random numbers to file
        try(java.io.PrintWriter output = new java.io.PrintWriter(file);)
        {
            for (int i = 0; i < array.length; i++)
            {
                array[i] = random.nextInt(upperbound);
                Arrays.sort(array);
                output.println(array[i]);
            }
            
        }
        //catch any exceptions
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
        catch(Exception ex)
        {
            System.out.println("Something went wrong!");
        }
        //try to read data from file
        try(Scanner input = new Scanner(file))
        {
            //read each line and print to console
            while(input.hasNext())
            {
                String line = input.nextLine();
                String[] numbers = line.split(" ");
                for(String number:numbers)
                {
                    System.out.println(number);
                }
            }
        }
        //catch any exceptions
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
        catch(Exception ex)
        {
            System.out.println("Something went wrong!");
        }
    }
    
}
