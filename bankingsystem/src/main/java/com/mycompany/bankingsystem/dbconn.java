
package com.mycompany.bankingsystem;
import java.sql.*;

public class dbconn {
    public static Connection connect() throws SQLException{
        String user = "root";
        String pass = "";
<<<<<<< HEAD
        String url = "jdbc:mysql://localhost:3306/bankingdb";
=======
        String url = "jdbc:mysql://localhost:3306/bankingDb";
>>>>>>> a54318ce13564695fc0789ee48dbffed61a2bde4
        
        return DriverManager.getConnection(url,user,pass);
    }
    
    
}
