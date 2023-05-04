package bankaccount;


/**
 * Author:Levi Bevins
 * Chapter:4
 * Lab:1
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creates account object with params, uses withdraw and deposit method, sets monthly interest too
        Account account1 = new Account(1122, 20000, 4.5);
        account1.withdrawFromAccount(2500);
        account1.depositIntoAccount(3000);
        account1.setMonthlyInterestRate();
        
        String header = "*** Account data ***";
        
        //print
        System.out.printf("%30s %n",header);
        System.out.println("Account ID          :" + " " + account1.getID());
        System.out.println("Account balance     : $" + " " + account1.getBalance());
        System.out.println("Monthly Interest    : $" + " " + String.format("%.2f",account1.getMonthlyInterest()));
        System.out.println("Account Created     :" + " " + account1.getDate());
    }
    
    
}
