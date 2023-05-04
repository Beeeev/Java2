package namelistsearch;
import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Author:Levi Bevins
 * Chapter:20
 * Lab:1
 */
public class NameListSearch {

    public static void main(String[] args)  {
        //loading files into object and creating lists for the files
        File boysFile = new File("src\\namelistsearch\\BoysNames.txt");
        File girlsFile = new File("src\\namelistsearch\\GirlsNames.txt");
        ArrayList<String> boysCollection = new ArrayList<>();
        ArrayList<String> girlsCollection = new ArrayList<>();
        try
        {
            //scan the files and read files into collections
            //userInput created to read user input
            Scanner boyInput = new Scanner(boysFile);
            Scanner girlInput = new Scanner(girlsFile);
            Scanner userScanner = new Scanner(System.in);
            while(boyInput.hasNextLine())
            {
                boysCollection.add(boyInput.next());
            }
            while(girlInput.hasNextLine())
            {
                girlsCollection.add(girlInput.next());
            }
            //prompt user for a name
            System.out.println("Enter a name: ");
            String userInput = userScanner.nextLine();
            //store postition of userInput and add one for humans(...Programmers arent human)
            int girlsPosition = girlsCollection.indexOf(userInput) + 1;
            int boysPosition = boysCollection.indexOf(userInput) + 1;
            //if userInput is found in both files return position in list
            if(boysCollection.contains(userInput) && girlsCollection.contains(userInput))
            {
                System.out.println(userInput + " was found in both the Boys and Girls");
                System.out.println(userInput + " was located in the Boys list at position " + boysPosition + 
                                   "\n and in the Girls list at position " + girlsPosition);
            }
            //my name is in the list! 
            else if(boysCollection.contains(userInput))
            {
                System.out.println(userInput + " was found in the Boys list");
                System.out.println(userInput + " was located in the Boys list at position " + boysPosition);
            }                       
            else if(girlsCollection.contains(userInput))
            {
                System.out.println(userInput + " was found in the Girls list");
                    System.out.println(userInput +  " was located in the Girls list at position " + girlsPosition);
            }
            else
            {
                System.out.println(userInput + " was not found");
            }
            
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(exception);
        }
        
    }
    
}
