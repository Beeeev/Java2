package schoolemployees;
//finihsed
/**
 *
 * @author Levi
 */
public class Student extends Person{
   
        //vars
        public static final int Freshman = 1;
        public static final int Sophomore = 2;
        public static final int Junior = 3;
        public static final int Senior = 4;

        private int classStatus;

        //constructor that inherits from Person
    public Student(String name, String address, String phoneNumber, String emailAddress, int classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }
    
    //getter and setter for status
    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }
    public String getClassStatus() {
       switch (classStatus) {
			case 1 : return "Freshman"; 
			case 2 : return "Sophomore"; 
			case 3 : return "Junior"; 
			case 4 : return "Senior";
			default : return "Unknown"; 
		}
    }
    
    //toString to display this obj and uses inheritance to display Person class
    @Override
    public String toString() {
        return  super.toString()
                + "\n Class Status: " + getClassStatus();
    }
}
