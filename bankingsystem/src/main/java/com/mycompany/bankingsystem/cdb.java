package com.mycompany.bankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class cdb {
    int userId;
    public double getSavings(int accID) {
        double realSavings = 0.0;
     
        try(Connection conn = dbconn.connect()){
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
        
        try(Connection conn = dbconn.connect()){
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
        

        try(Connection conn = dbconn.connect()){
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
            if(oldSavings >= newSavings){
                if(newSavings <= 0){
                JOptionPane.showMessageDialog(null,"INVALID AMOUNT");
                }else{
                    pstmt.setDouble(1,oldSavings - newSavings);
                    pstmt.setInt(2,accID); 
                
                    int rowsAffected = pstmt.executeUpdate();
                    if(rowsAffected>0){
                        JOptionPane.showMessageDialog(null,"WITHDRAW SUCCESSFUL");
                    }
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"INVALID AMOUNT");
            }
            
            
            
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
  
    }
    public void Transfer(int userId,int accID,double amount) {
        double oldSavings1 = 0.0;
        double oldSavings2 = 0.0;
          
        try(Connection conn = dbconn.connect()){
            String old1 = "select* from bankingAccounts";
            PreparedStatement stmt1 = conn.prepareStatement(old1);
            ResultSet rs1 = stmt1.executeQuery();
            while(rs1.next()){
                int id = rs1.getInt("accId");
                double savings = rs1.getDouble("sBalance");
                if(userId == id){
                    oldSavings1 = savings;
                }
            }
            
            String sql1 = "update bankingAccounts set sBalance = ? where accId=?";
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setDouble(1,oldSavings1 - amount);
            pstmt1.setInt(2,userId);
            int rowsAffected = pstmt1.executeUpdate();
            //////////////////////////////////////////////////////
            PreparedStatement stmt2 = conn.prepareStatement(old1);
            ResultSet rs2 = stmt2.executeQuery();
            while(rs2.next()){
                int id = rs2.getInt("accId");
                double savings = rs2.getDouble("sBalance");
                if(accID == id){
                    oldSavings2 = savings;
                }
            }
            
            String sql2 = "update bankingAccounts set sBalance = ? where accId=?";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setDouble(1,oldSavings2+ amount);
            pstmt2.setInt(2,accID);
            
            int totalAffected = pstmt2.executeUpdate() + rowsAffected;
            
            
            if(rowsAffected>0){
                JOptionPane.showMessageDialog(null,"TRANSFER SUCCESSFUL");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
  
    }
    public double getTotalDep(int accId) {
    double amount = 0.0;

        try (Connection conn = dbconn.connect()) {
            String sql = "SELECT totalDep FROM bankingAccounts WHERE accId = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, accId);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                amount = rs.getDouble("totalDep");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return amount;
    }
    public double getTotalWith(int accId) {
    double amount = 0.0;

        try (Connection conn = dbconn.connect()) {
            String sql = "SELECT totalWith FROM bankingAccounts WHERE accId = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, accId);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                amount = rs.getDouble("totalWith");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return amount;
    }
    public double getTotalTrans(int accId) {
    double amount = 0.0;

        try (Connection conn = dbconn.connect()) {
            String sql = "SELECT totalTrans FROM bankingAccounts WHERE accId = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, accId);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                amount = rs.getDouble("totalTrans");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return amount;
    }
    public double getTotalLoan(int accId) {
    double amount = 0.0;

        try (Connection conn = dbconn.connect()) {
            String sql = "SELECT totalLoan FROM bankingAccounts WHERE accId = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, accId);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                amount = rs.getDouble("totalLoan");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return amount;
    }
    public double getTotalTransac(int accId) {
    double amount = 0.0;

        try (Connection conn = dbconn.connect()) {
            String sql = "SELECT totalTransac FROM bankingAccounts WHERE accId = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, accId);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                amount = rs.getDouble("totalTransac");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return amount;
    }
    
    
    
}