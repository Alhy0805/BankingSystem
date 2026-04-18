package com.mycompany.bankingsystem;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Bankingsystem extends javax.swing.JFrame {
    public Bankingsystem(){
        login log = new login();
        log.setVisible(true);  
    }
    public static void main(String args[]) {
        Bankingsystem frame = new Bankingsystem();
        
    }
}
