package schoolemployees;

import java.util.ArrayList;
//finihsed
/**
 * Author:Levi Bevins
 * Chapter:11
 * Lab:1
 */
public class SchoolEmployees {

    public static void main(String[] args) {
        
        //Each obj created
       Person person = new Person("Bob", "123 Bob Ave", 
               "800-700-4000", "bob@bobmail.com"); 
       Student student = new Student("Joe", "700 Joe ave", "999-999-999",
               "joe@joemail.com", Student.Freshman); 
       Employee employee = new Employee("Mike", "123 Mike ave", "888-888-999",
			"mike80@aol.com", "910", 60000);
       Faculty faculty = new Faculty("Sue", "28 Sue street", "419-999-999",
			"sue28@aol.com", "4pm to 6pm", "Professor" , "101" , 50000);
       Staff staff = new Staff("Tom", "90 County road", "419-888-888",
			"tomcat@aol.com", "Executive Assistant", "12", 65000);
       
       //arraylist made and each of the objs added
       ArrayList<Person> schoolList = new ArrayList<Person>();
       schoolList.add(person);
       schoolList.add(student);
       schoolList.add(employee);
       schoolList.add(faculty);
       schoolList.add(staff);
       
       //for loop to print each of the objs toString
       for(Person eachPerson : schoolList)
       {
           System.out.println(eachPerson.toString()+"\n");
       }
    }
    
}
