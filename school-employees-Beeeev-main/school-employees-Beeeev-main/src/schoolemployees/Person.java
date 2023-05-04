package schoolemployees;
//finihsed
/**
 *
 * @author Levi
 */
public class Person {
    
    //vars
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    //constructor
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    //getters and setters for each var
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    //toString to display
    @Override
    public String toString() {
        return  "\n Name: " + name 
                + "\n Address: " + address 
                + "\n Phone Number: " + phoneNumber 
                + "\n Email Address: " + emailAddress;
    }

}
