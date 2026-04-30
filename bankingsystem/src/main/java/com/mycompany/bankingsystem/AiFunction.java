package com.mycompany.bankingsystem;

import com.google.gson.*;

public class AiFunction {

    public static String parse(String jsonFromAI, AiUi ui) {

        JsonObject obj = JsonParser.parseString(jsonFromAI).getAsJsonObject();

        String action = obj.get("action").getAsString();
        JsonObject p = obj.getAsJsonObject("parameters");

        switch (action) {

            case "addUser": {
                String name = getString(p, "name");
                double sBal = getDouble(p, "sbal");
                double psBal = Math.abs(sBal);
                double lBal = getDouble(p, "lbal");
                double plBal = Math.abs(lBal);
                String stat = getString(p, "status");
                String pos = getString(p, "position");
                int pin = getInt(p, "pin");

                databaseLogic.addUser(name, psBal, plBal, stat, pos, pin, ui);
                System.out.println("ADD USER EXECUTED");
                break;
            }

            case "updateUserName": {
                int id = getInt(p, "id");
                String name = getString(p, "name");

                databaseLogic.updateUserName(id, name, ui);
                System.out.println("UPDATE NAME EXECUTED");
                break;
            }

            case "updateUserSBal": {
                int id = getInt(p, "id");
                double sBal = getDouble(p, "sbal");

                databaseLogic.updateUserSBalance(id, sBal, ui);
                System.out.println("UPDATE SBAL EXECUTED");
                break;
            }

            case "updateUserLBal": {
                int id = getInt(p, "id");
                double lBal = getDouble(p, "lbal");

                databaseLogic.updateUserLBalance(id, lBal, ui);
                System.out.println("UPDATE LBAL EXECUTED");
                break;
            }

            case "updateUserStatus": {
                int id = getInt(p, "id");
                String status = getString(p, "status");

                databaseLogic.updateUserStatus(id, status, ui);
                System.out.println("UPDATE STATUS EXECUTED");
                break;
            }

            case "updateUserPosition": {
                int id = getInt(p, "id");
                String position = getString(p, "position");

                databaseLogic.updateUserPosition(id, position, ui);
                System.out.println("UPDATE POSITION EXECUTED");
                break;
            }

            case "updateUserPin": {
                int id = getInt(p, "id");
                int pin = getInt(p, "pin");

                databaseLogic.updateUserPin(id, pin, ui);
                System.out.println("UPDATE PIN EXECUTED");
                break;
            }

            case "deleteUser": {
                int id = getInt(p, "id");

                databaseLogic.deleteUser(id, ui);
                System.out.println("DELETE USER EXECUTED");
                break;
            }

            case "selectUserId": {
                int id = getInt(p, "id");

                databaseLogic.selectUserById(id, ui);
                System.out.println("SELECT BY ID EXECUTED");
                break;
            }

            case "selectUserName": {
                String name = getString(p, "name");

                databaseLogic.selectUserByName(name, ui);
                System.out.println("SELECT BY NAME EXECUTED");
                break;
            }
            
            case "transfer": {
                int userId = getInt(p, "senderId");
                int actId = getInt(p, "receiverId");
                double amount = getDouble(p, "amount");
                
                databaseLogic.Transfer(actId, amount, ui);
                break;
            }
            case "setSavingWithdraw":{
                double amount = getDouble(p, "amount");
                databaseLogic.setSavingsWithdraw(amount, ui);
                break;
            }
            
            case "setSavingDeposit":{
                double amount = getDouble(p, "amount");
                databaseLogic.setSavingsDeposit(amount, ui);
                break;
            }

            case "chatBot": {
                String message = getString(p, "message");

                databaseLogic.chatBot(message, ui);
                break;
            }

            default:
                System.out.println("Unknown action: " + action);
        }

        return action;
    }

    // ============================
    // 🔒 SAFE PARSING HELPERS
    // ============================

    private static String getString(JsonObject p, String key) {
        return (p.has(key) && !p.get(key).isJsonNull())
                ? p.get(key).getAsString()
                : "";
    }

    private static int getInt(JsonObject p, String key) {
        return (p.has(key) && !p.get(key).isJsonNull())
                ? p.get(key).getAsInt()
                : 0;
    }

    private static double getDouble(JsonObject p, String key) {
        return (p.has(key) && !p.get(key).isJsonNull())
                ? p.get(key).getAsDouble()
                : 0.0;
    }
}