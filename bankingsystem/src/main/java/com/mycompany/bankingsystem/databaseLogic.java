package com.mycompany.bankingsystem;

import java.sql.*;
import javax.swing.JOptionPane;

public class databaseLogic {

    //Update names by id
    public static void updateUserName(int id, String name, AiUi ui) {
        if (AiUi.posit.equalsIgnoreCase("Admin")) {
            String sql = "UPDATE bankingaccounts SET fullname = ? WHERE accId = ?";
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to ppdate the name of this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
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

        String sql = "SELECT accId, fullname FROM bankingaccounts WHERE accId = ?";
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

        String sql = "SELECT accId, fullname FROM bankingaccounts WHERE fullname = ?";
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

    //chat
    public static void chatBot(String response, AiUi ui) {

        ui.appendChatBox("\nAI: " + response);

    }
}
