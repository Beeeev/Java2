package states;

import java.util.*;
import java.io.*;


/**
 * Author:Levi Bevins
 * Chapter:21
 * Lab:2
 */
public class States {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //load file, create array, choiceInput for user, scanner for user
	String fileName = "src/states/states.txt";
	String[][] statesArray = new String[50][2];
	int choiceInput;
	Scanner userInput = new Scanner(System.in);
	// Create map here
	Map<String, String> hashMap = new HashMap<>();
        //read file into 2D array
	readData(statesArray, fileName);	;
        //add values to map
	for(int i = 0;i < 50;++i)
        {
            hashMap.put(statesArray[i][0], statesArray[i][1]);
	}
	do
	{
	    System.out.println("""

                               1. Print all state names and their abbreviations
                               2. Find a state abbreviation by entering the state's name
                               3. Quit""");
	    choiceInput = userInput.nextInt();
	    if(choiceInput == 1)
	    {
		System.out.println("State          Abbreviation");
		System.out.println("============== ============");

		// Print all key/value entries in map here
                hashMap.forEach((k,v) -> System.out.println(k + "\t" + v));
	    }
	    else if(choiceInput == 2)
	    {
 
                
                    System.out.println("Enter the state name: ");
                    userInput.nextLine();
                    String dataInput = userInput.nextLine();

                    if(hashMap.get(dataInput) != null)
                    {
                        System.out.println("The abbreviation for the state " + dataInput + " is " + hashMap.get(dataInput));
                        break;
                    }
                    else if(hashMap.get(dataInput) == null)
                    {
                        System.out.println("State not found");
                    }

            }
	} while (choiceInput != 3);
	userInput.close();
    }

    public static void readData(String[][] data, String fileName)
    {
	String input;
	String[] stateAbbr;

	try (Scanner fileInput = new Scanner(new File(fileName)))
	{
	    for(int i = 0;i < 50;++i)
	    {
		input = fileInput.nextLine();
		stateAbbr = input.split("\t");
		data[i][0] = stateAbbr[0];
		data[i][1] = stateAbbr[1];
	    }
	} catch (Exception ex)
	{
	    System.out.println("An error occurred!\n" + ex);
	}
    }
}
