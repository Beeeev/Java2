package stringparsing;
import java.util.Scanner;
/**
 * Author: Levi Bevins
 * Chapter: 4
 * Lab: 1
 */
public class StringParsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner object to collect userinput and prompt user to enter information and store it in fullName
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Full name");
        String fullName = userInput.nextLine();
        
        //If the user response doesn't contain a comma, rearrange name and add a comma
        if(fullName.indexOf(',') == -1)
        {
            String firstName = fullName.substring(0, fullName.indexOf(" "));
            String lastName = fullName.substring(fullName.indexOf(" "), fullName.length());
            fullName = lastName + ", " + firstName;
        }
        //otherwise, keep the same
        else
        {
            fullName = fullName;
        }
        //print results
        System.out.println("Your full name is: " + fullName);
    }
    
}
