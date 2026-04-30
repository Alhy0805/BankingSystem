package com.mycompany.bankingsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class databaseLogic {

    //Update names by id
    public static void updateUserName(int id, String name, AiUi ui) {
        if (AiUi.posit.equalsIgnoreCase("Admin")) {
            String sql = "UPDATE bankingaccounts SET fullName = ? WHERE accId = ?";
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the name of this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection conn = dbconn.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setString(1, name);
                    stmt.setInt(2, id);

                    stmt.executeUpdate();

                    ui.appendChatBox("\nSystem: Data Updated");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                ui.appendChatBox("\nAI: Operation Cancelled");
            }

        } else {
            ui.appendChatBox("\nAI: You dont have authority for this operation");
        }

    }

    public static void updateUserSBalance(int id, Double sBal, AiUi ui) {
        if (AiUi.posit.equalsIgnoreCase("Admin")) {
            String sql = "UPDATE bankingaccounts SET sBalance = ? WHERE accId = ?";
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the savings of this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection conn = dbconn.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setDouble(1, sBal);
                    stmt.setInt(2, id);

                    stmt.executeUpdate();

                    ui.appendChatBox("\nAI: Data Updated");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                ui.appendChatBox("\nAI: Operation Cancelled");
            }
        } else {
            ui.appendChatBox("\nAI: You dont have authority for this operation");
        }

    }

    public static void updateUserLBalance(int id, Double lBal, AiUi ui) {
        if (AiUi.posit.equalsIgnoreCase("Admin")) {
            String sql = "UPDATE bankingaccounts SET lBalance = ? WHERE accId = ?";
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the loan of this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection conn = dbconn.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setDouble(1, lBal);
                    stmt.setInt(2, id);

                    stmt.executeUpdate();

                    ui.appendChatBox("\nAI: Data Updated");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                ui.appendChatBox("\nAI: Operation Cancelled");
            }
        } else {
            ui.appendChatBox("\nAI: You dont have authority for this operation");
        }

    }

    public static void updateUserStatus(int id, String stat, AiUi ui) {
        if (AiUi.posit.equalsIgnoreCase("Admin")) {
            String sql = "UPDATE bankingaccounts SET status = ? WHERE accId = ?";
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the status of this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection conn = dbconn.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setString(1, stat);
                    stmt.setInt(2, id);

                    stmt.executeUpdate();

                    ui.appendChatBox("\nAI: Data Updated");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                ui.appendChatBox("\nAI: Operation Cancelled");
            }
        } else {
            ui.appendChatBox("\nAI: You dont have authority for this operation");
        }

    }

    public static void updateUserPosition(int id, String pos, AiUi ui) {
        if (AiUi.posit.equalsIgnoreCase("Admin")) {
            String sql = "UPDATE bankingaccounts SET position = ? WHERE accId = ?";
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the positon of this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection conn = dbconn.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setString(1, pos);
                    stmt.setInt(2, id);

                    stmt.executeUpdate();

                    ui.appendChatBox("\nAI: Data Updated");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                ui.appendChatBox("\nAI: Operation Cancelled");
            }
        } else {
            ui.appendChatBox("\nAI: You dont have authority for this operation");
        }
    }

    public static void updateUserPin(int id, int pin, AiUi ui) {
        if (AiUi.posit.equalsIgnoreCase("Admin")) {
            String sql = "UPDATE bankingaccounts SET pin = ? WHERE accId = ?";
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the pin of this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection conn = dbconn.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setInt(1, pin);
                    stmt.setInt(2, id);

                    stmt.executeUpdate();

                    ui.appendChatBox("\nAI: Data Updated");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                ui.appendChatBox("\nAI: Operation Cancelled");
            }
        } else {
            ui.appendChatBox("\nAI: You dont have authority for this operation");
        }

    }

    //adding user
    public static void addUser(String name, double sBal, double lBal, String stat, String pos, int pin, AiUi ui) {
        if (AiUi.posit.equalsIgnoreCase("Admin")) {
            String sql = "INSERT INTO bankingaccounts VALUES (NULL, ?, ?, ?, ?, ?, ?)";
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to add this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection conn = dbconn.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setString(1, name);
                    stmt.setDouble(2, sBal);
                    stmt.setDouble(3, lBal);
                    stmt.setString(4, stat);
                    stmt.setString(5, pos);
                    stmt.setInt(6, pin);

                    stmt.executeUpdate();

                    ui.appendChatBox("\nAI: Data Added");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                ui.appendChatBox("\nAI: Operation Cancelled");
            }
        } else {
            ui.appendChatBox("\nAI: You dont have authority for this operation");
        }
    }

    //delete
    public static void deleteUser(int id, AiUi ui) {
        if (AiUi.posit.equalsIgnoreCase("Admin")) {
            String sql = "DELETE FROM bankingaccounts WHERE accId = ?";
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection conn = dbconn.connect(); PreparedStatement pst = conn.prepareStatement(sql)) {

                    pst.setInt(1, id);

                    int rows = pst.executeUpdate();

                    if (rows > 0) {
                        ui.appendChatBox("\nAI: Data Deleted");
                    } else {
                        ui.appendChatBox("\nAI: No User found with that ID");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                ui.appendChatBox("\nAI: Operation Cancelled");
            }
        } else {
            ui.appendChatBox("\nAI: You dont have authority for this operation");
        }
    }

    public static void selectUserById(int id, AiUi ui) {

        String sql = "SELECT accId, fullName FROM bankingaccounts WHERE accId = ?";
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to search for this user id?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = dbconn.connect(); PreparedStatement pst = conn.prepareStatement(sql)) {

                pst.setInt(1, id);

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    // Assuming columns exist
                    int userId = rs.getInt("accId");
                    String name = rs.getString("fullname");

                    ui.appendChatBox("\nAI: User Found ( ");
                    ui.appendChatBox("ID: " + userId);
                    ui.appendChatBox(" | Name: " + name + " )");

                } else {
                    ui.appendChatBox("\nAI: No User found with that ID");
                }

            } catch (Exception e) {
                e.printStackTrace();
                ui.appendChatBox("\nAI: Error fetching user");
            }
        } else {
            ui.appendChatBox("\nAI: Operation Cancelled");
        }
    }

    public static void selectUserByName(String fname, AiUi ui) {

        String sql = "SELECT accId, fullName FROM bankingaccounts WHERE fullName = ?";
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to search for this user name?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = dbconn.connect(); PreparedStatement pst = conn.prepareStatement(sql)) {

                pst.setString(1, fname);

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    // Assuming columns exist
                    int userId = rs.getInt("accId");
                    String name = rs.getString("fullname");

                    ui.appendChatBox("\nAI: User Found ( ");
                    ui.appendChatBox("ID: " + userId);
                    ui.appendChatBox(" | Name: " + name + " )");

                } else {
                    ui.appendChatBox("\nAI: No User found with that name");
                }

            } catch (Exception e) {
                e.printStackTrace();
                ui.appendChatBox("\nAI: Error fetching user");
            }
        } else {
            ui.appendChatBox("\nAI: Operation Cancelled");
        }
    }

    public static void Transfer(int accID, double amount, AiUi ui) {
        int userId = AiUi.accId;

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to transfer this money?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            double oldSavings1 = 0.0;
            double oldSavings2 = 0.0;

            try (Connection conn = dbconn.connect()) {
                String old1 = "select* from bankingaccounts";
                PreparedStatement stmt1 = conn.prepareStatement(old1);
                ResultSet rs1 = stmt1.executeQuery();
                while (rs1.next()) {
                    int id = rs1.getInt("accId");
                    double savings = rs1.getDouble("sBalance");
                    if (userId == id) {
                        oldSavings1 = savings;
                    }
                }

                String sql1 = "update bankingAccounts set sBalance = ? where accId=?";
                PreparedStatement pstmt1 = conn.prepareStatement(sql1);
                pstmt1.setDouble(1, oldSavings1 - amount);
                pstmt1.setInt(2, userId);
                int rowsAffected = pstmt1.executeUpdate();
                //////////////////////////////////////////////////////
            PreparedStatement stmt2 = conn.prepareStatement(old1);
                ResultSet rs2 = stmt2.executeQuery();
                while (rs2.next()) {
                    int id = rs2.getInt("accId");
                    double savings = rs2.getDouble("sBalance");
                    if (accID == id) {
                        oldSavings2 = savings;
                    }
                }

                String sql2 = "update bankingAccounts set sBalance = ? where accId=?";
                PreparedStatement pstmt2 = conn.prepareStatement(sql2);
                pstmt2.setDouble(1, oldSavings2 + amount);
                pstmt2.setInt(2, accID);

                int totalAffected = pstmt2.executeUpdate() + rowsAffected;

                if (rowsAffected > 0) {
                    ui.appendChatBox("\nAI: Money has been transferred");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            ui.appendChatBox("\nAI: Operation Cancelled");
        }

    }

    public static void setSavingsDeposit(double newSavings, AiUi ui) {
        int accID = AiUi.accId;
        double oldSavings = 0.0;
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to deposit this money?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
        try (Connection conn = dbconn.connect()) {
            String old = "select* from bankingAccounts";
            PreparedStatement stmt = conn.prepareStatement(old);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("accId");
                double savings = rs.getDouble("sBalance");
                if (accID == id) {
                    oldSavings = savings;
                }
            }

            String sql = "update bankingAccounts set sBalance = ? where accId=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, oldSavings + newSavings);
            pstmt.setInt(2, accID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                ui.appendChatBox("\nAI: Deposit Successfull");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
} else {
            ui.appendChatBox("\nAI: Operation Cancelled");
        }
    }

    public static void setSavingsWithdraw(double newSavings, AiUi ui) {
        int accID = AiUi.accId;
        double oldSavings = 0.0;
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to withdraw this money?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {

        try (Connection conn = dbconn.connect()) {
            String old = "select* from bankingAccounts";
            PreparedStatement stmt = conn.prepareStatement(old);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("accId");
                double savings = rs.getDouble("sBalance");
                if (accID == id) {
                    oldSavings = savings;
                }
            }

            String sql = "update bankingAccounts set sBalance = ? where accId=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            if (oldSavings >= newSavings) {
                if (newSavings <= 0) {
                   ui.appendChatBox("\nAI: Invalid Amount");
                } else {
                    pstmt.setDouble(1, oldSavings - newSavings);
                    pstmt.setInt(2, accID);

                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        ui.appendChatBox("\nAI: Withdraw successfull");
                    }
                }

            } else {
                ui.appendChatBox("\nAI: Invalid Amount");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        } else {
            ui.appendChatBox("\nAI: Operation Cancelled");
        }

    }

    //chat
    public static void chatBot(String response, AiUi ui) {

        ui.appendChatBox("\nAI: " + response);

    }
}
