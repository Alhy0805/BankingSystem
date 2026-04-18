package com.mycompany.bankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cdb {
    
    public double getSavings(int accID) {
        double realSavings = 0.0;
        
        String user = "root";
        String pass = "Alhyohan";
        String url = "jdbc:mysql://localhost:3306/bankingDb";
        
        try(Connection conn = DriverManager.getConnection(url,user,pass)){
            String sql = "select* from bankingAccounts";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("accId");
                String name = rs.getString("fullName");
                double savings = rs.getDouble("sBalance");
                double loans = rs.getDouble("lBalance");
                String status = rs.getString("status");
                if(accID == id){
                    realSavings = savings;
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return realSavings;
    }
}