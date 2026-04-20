
package com.mycompany.bankingsystem;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class profile extends JPanel {
    Image image;
    public profile() {
        image = new ImageIcon("C:\\Users\\student\\Documents\\NetBeansProjects\\Finaljava\\src\\main\\java\\com\\mycompany\\finaljava\\images\\try.png").getImage();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}