
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Deepa
 */
public class CreateDbConnection {
    
    public static Connection createConnection() throws SQLException, ClassNotFoundException{
        
        // Load the Derby driver
//        Class.forName("org.apache.derby.jdbc.ClientDriver");

        String URL="jdbc:derby://localhost:1527/happyminimart_;user=root;password=root";

        // Establish a connection to the Derby database
        Connection con = DriverManager.getConnection(URL);


//        if(con!=null) {
//            System.out.println("Connected to Database!!!");
//        }
        
        return con;
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection con=CreateDbConnection.createConnection();
        
        if(con!=null){
            System.out.println("Database Connected!!!");
        }else{
            System.out.println("Failed to connect!");
        }
    }
    
}
