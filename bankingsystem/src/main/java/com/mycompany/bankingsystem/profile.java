
package com.mycompany.bankingsystem;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class profile extends JPanel {
    cdb db = new cdb();
    Image image;
    public profile() {
        
        image = new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Desktop\\ditonga\\BankingSystem\\bankingsystem\\src\\main\\java\\com\\mycompany\\bankingsystem\\images\\bankingLOGO.png").getImage();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this); // fills the panel
    }
}