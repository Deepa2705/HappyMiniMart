
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Deepa
 */
public class CRUD_Operations {
    public static void createAdminTable(Connection con){
        String query="create table Admin (userId varchar(20) PRIMARY KEY, password varchar(20))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }

    public static void createSellerTable(Connection con){
        String query="create table Seller (userId varchar(20) PRIMARY KEY, password varchar(20),firstName varchar(20), lastName varchar(20), phoneNumber varchar(20), email varchar(30))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }
    
    public static void createProductTable(Connection con){
        String query="create table Product (Id varchar(20) PRIMARY KEY, name varchar(20),category varchar(20), quantity varchar(20), price varchar(20))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }
    
    public static void createCategoryTable(Connection con){
        String query="create table Category (Id varchar(20) PRIMARY KEY, name varchar(20),description varchar(20))";
                
        try {
            Statement st=con.createStatement();
            st.execute(query);
            
            System.out.println("Table created!");
        } catch (SQLException ex) {
            System.out.println("Table already exists: "+ex.getMessage());
        }
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Connection con=CreateDbConnection.createConnection();
//        createAdminTable(con);

//        createSellerTable(con);

//            createProductTable(con);

            createCategoryTable(con);
    }
}
