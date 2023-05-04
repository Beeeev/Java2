package schoolemployees;
//finihsed
/**
 *
 * @author Levi
 */
public class Staff extends Employee{
    
    //var
    private String title;

     //constructor that inherits from Employee
    public Staff(String name, String address, String phoneNumber, String emailAddress, String title, String Office, int salary) {
        super(name, address, phoneNumber, emailAddress, Office, salary);
        this.title = title;
    }
    
    
    //getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //toString used to display obj and uses inheritance to display Employee class
    @Override
    public String toString() {
        return  super.toString()
                + "\n Title: " + getTitle();
    }

}
