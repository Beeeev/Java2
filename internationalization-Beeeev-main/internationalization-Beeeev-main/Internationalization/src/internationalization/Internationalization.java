
package internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Levi Bevins, Ch36, Lab 1
 */
public class Internationalization {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Locale currentLocale = Locale.getDefault();
        String language = currentLocale.getLanguage();
        String input;

        do {
            //user selection
            System.out.println("Current language: " + language);
            System.out.println("Select an option:");
            System.out.println("1. Change language");
            System.out.println("2. Print current date");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            input = scanner.nextLine();
            
            //run while
            switch (input) {
                //if user selects to change language
                case "1":
                    System.out.print("Enter new language (en, fr, es): ");
                    String newLanguage = scanner.nextLine();
                    if (newLanguage.equalsIgnoreCase("en")) {
                        currentLocale = Locale.US;
                    } else if (newLanguage.equalsIgnoreCase("fr")) {
                        currentLocale = Locale.FRANCE;
                    } else if (newLanguage.equalsIgnoreCase("es")) {
                        currentLocale = new Locale("es", "ES");
                    } else {
                        System.out.println("Invalid language!");
                    }
                    language = currentLocale.getLanguage();
                    break;
                //if user selects to print date, use locale to decide how to print
                case "2":
                    DateFormat dateFormatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, currentLocale);
                    String currentDate = dateFormatter.format(new Date());
                    System.out.println("Current date: " + currentDate);
                    break;
                case "3":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (!input.equals("3"));
        
        scanner.close();
    }
}
    

