package schoolemployees;
import java.util.Date;
//finihsed
/**
 *
 * @author Levi
 */
public class Employee extends Person{
    
    //vars and date obj
    private String Office;
    private int salary;
    Date date = new Date();

    //contructor that inherits from Person
    public Employee(String name, String address, String phoneNumber, String emailAddress, String Office, int salary) {
        super(name, address, phoneNumber, emailAddress);
        this.Office = Office;
        this.salary = salary;
    }
    
    //getters and setters
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getOffice() {
        return Office;
    }
    public void setOffice(String Office) {
        this.Office = Office;
    }
    public String getDate()
    {
        return date.toString();
    }
    //toString used to display obj and uses inheritance to display Person class
@Override
    public String toString() {
        return  super.toString()
                + "\n Office: " + getOffice()
                + "\n Salary: " + getSalary()
                + "\n Date Hired: " + getDate();
    }
}
