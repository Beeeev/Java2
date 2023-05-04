package duplicatewords;
import java.util.*;
import java.io.*;


/**
 * Author:Levi Bevins
 * Chapter:21
 * Lab:1
 */
public class DuplicateWords {

    public static void main(String[] args) {
        
        boolean done = false;
        Scanner input = new Scanner(System.in);
        //loop to keep trying userinput till correct
        while(!done)
        {
            //userinput
            System.out.print("Enter a source text file: ");
            String filename = input.nextLine();
            File file = new File("src\\DuplicateWords\\"+filename);
            try
            {
                //create hashset and read file
                Set<String> set = new HashSet<>();
                Scanner fileContent = new Scanner(file);
                while(fileContent.hasNext())
                {
                    String word = fileContent.next();
                    set.add(word);
                }
                //after reading make a try set and print each item
                TreeSet<String> treeSet = new TreeSet<>(set);
                for(String animal:treeSet)
                {
                    System.out.println(animal);
                }
                done = true;
                break;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }

}
