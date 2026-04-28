
package com.mycompany.bankingsystem;
import java.sql.*;

public class dbconn {
    public static Connection connect() throws SQLException{
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/bankingDb";
        
        return DriverManager.getConnection(url,user,pass);
    }
    
    
}
