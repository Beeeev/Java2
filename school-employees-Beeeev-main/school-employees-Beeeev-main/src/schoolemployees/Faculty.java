package schoolemployees;
//finihsed
/**
 *
 * @author Levi
 */
public class Faculty extends Employee {
    
    //vars
    private String officeHours;
    private String rank;

    //constructor that inherits from Employee
    public Faculty(String name, String address, String phoneNumber, 
                    String emailAddress, String officeHours, String rank, String Office, int salary) {
        super(name, address, phoneNumber, emailAddress, Office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    
    //getters and setters
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    //toString used to display obj and uses inheritance to display Employee class
    @Override
    public String toString() {
        return  super.toString() 
                + "\n Office Hours: " + getOfficeHours()
                + "\n Rank: " + getRank();
    }

}
