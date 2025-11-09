/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author USER
 */
public class DBCONNECTION {
        public static void main(String[] args) {
            
        
            
            try {
            // Load the MySQL JDBC driver (optional in newer versions, but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhotel_db", "root", "1234");
            System.out.println("Connection established: " + con);
            
            // TODO: Add your application logic here, e.g., execute queries
            
            // Close the connection when done
            con.close();
            
        } catch (ClassNotFoundException ex) {
            // Log the error with a proper message
            System.getLogger(DBCONNECTION.class.getName()).log(System.Logger.Level.ERROR, "MySQL JDBC Driver not found", ex);
        } catch (SQLException ex) {
            // Log the error with a proper message
            System.getLogger(DBCONNECTION.class.getName()).log(System.Logger.Level.ERROR, "Database connection failed", ex);
        }
    }
    }


