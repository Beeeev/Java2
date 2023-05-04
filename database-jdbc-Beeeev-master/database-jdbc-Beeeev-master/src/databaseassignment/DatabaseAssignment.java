
package databaseassignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Levi Bevins, 4/9/2023
 */
public class DatabaseAssignment {


    public static void main(String[] args) {
            //test credentials
            String username = "testuser";
            String pass = "1234";
        
            //Your code here!
            try
            {
                //make connection to server
                String sql = "jdbc:mysql://localhost:3306/sakila";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(sql, username, pass);
                System.out.println("Success!");
                
                //query statement and use that statement to print
                String query = "SELECT first_name, last_name, film_info FROM sakila.actor_info";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                
                while(rs.next())
                {
                    System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + "\n" );
                }
            
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        
    }
    
}
