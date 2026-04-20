package com.mycompany.bankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

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
    public void setSavingsDeposit(int accID,double newSavings) {
        double oldSavings = 0.0;
        
        String user = "root";
        String pass = "Alhyohan";
        String url = "jdbc:mysql://localhost:3306/bankingDb";
        
        try(Connection conn = DriverManager.getConnection(url,user,pass)){
            String old = "select* from bankingAccounts";
            PreparedStatement stmt = conn.prepareStatement(old);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("accId");
                double savings = rs.getDouble("sBalance");
                if(accID == id){
                    oldSavings = savings;
                }
            }
            
            
            
            
            String sql = "update bankingAccounts set sBalance = ? where accId=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1,oldSavings + newSavings);
            pstmt.setInt(2,accID);
            
            int rowsAffected = pstmt.executeUpdate();
            if(rowsAffected>0){
                JOptionPane.showMessageDialog(null,"DEPOSIT SUCCESSFUL");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
  
    }
    public void setSavingsWithdraw(int accID,double newSavings) {
        double oldSavings = 0.0;
        
        String user = "root";
        String pass = "Alhyohan";
        String url = "jdbc:mysql://localhost:3306/bankingDb";
        
        try(Connection conn = DriverManager.getConnection(url,user,pass)){
            String old = "select* from bankingAccounts";
            PreparedStatement stmt = conn.prepareStatement(old);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("accId");
                double savings = rs.getDouble("sBalance");
                if(accID == id){
                    oldSavings = savings;
                }
            }
            
            
            
            
            String sql = "update bankingAccounts set sBalance = ? where accId=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1,oldSavings - newSavings);
            pstmt.setInt(2,accID);
            
            int rowsAffected = pstmt.executeUpdate();
            if(rowsAffected>0){
                JOptionPane.showMessageDialog(null,"WITHDRAW SUCCESSFUL");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
  
    }
    
    
    
    
    
    
    
    
    
}