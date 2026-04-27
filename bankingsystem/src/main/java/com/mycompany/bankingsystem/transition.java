package com.mycompany.bankingsystem;

import javax.swing.Timer;
import javax.swing.JFrame;

public class transition {
    public static void switchFrame(JFrame current, JFrame next) {
        try {
            // 1. Prepare the next frame in the center
            next.setOpacity(0.0f);
            next.pack(); // Ensures the size is calculated correctly
            next.setLocationRelativeTo(null); // Centers it on screen
            next.setVisible(true);

            // 2. The Animation Timer
            Timer timer = new Timer(15, null);
            timer.addActionListener(e -> {
                float curOp = current.getOpacity();
                float nextOp = next.getOpacity();

                // Gradually decrease current and increase next
                if (curOp > 0.1f) {
                    current.setOpacity(curOp - 0.1f);
                    next.setOpacity(nextOp + 0.1f);
                } else {
                    // 3. Finalize
                    ((Timer)e.getSource()).stop();
                    current.dispose();
                    next.setOpacity(1.0f);
                }
            });
            timer.start();
            
        } catch (Exception e) {
            // Fallback: If opacity fails, just center and show
            next.setLocationRelativeTo(null);
            next.setVisible(true);
            current.dispose();
        }
    }
}
