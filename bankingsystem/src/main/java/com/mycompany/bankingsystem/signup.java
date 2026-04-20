
package com.mycompany.bankingsystem;
import java.sql.*;

public class signup extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(signup.class.getName());

    public signup() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        idIn = new javax.swing.JTextField();
        pin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pinIn1 = new javax.swing.JPasswordField();
        pin1 = new javax.swing.JLabel();
        age = new javax.swing.JSpinner();
        pin2 = new javax.swing.JLabel();
        pinIn2 = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up");
        setLocation(new java.awt.Point(500, 500));
        setPreferredSize(new java.awt.Dimension(250, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(250, 430));

        jPanel3.setBackground(new java.awt.Color(255, 196, 196));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 425));

        login.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(133, 14, 53));
        login.setText("WELCOME");

        email.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(133, 14, 53));
        email.setText("FULL NAME");

        idIn.setBackground(new java.awt.Color(252, 245, 238));
        idIn.setForeground(new java.awt.Color(133, 14, 53));
        idIn.addActionListener(this::idInActionPerformed);

        pin.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        pin.setForeground(new java.awt.Color(133, 14, 53));
        pin.setText("AGE");

        jButton1.setBackground(new java.awt.Color(133, 14, 53));
        jButton1.setForeground(new java.awt.Color(252, 245, 238));
        jButton1.setText("SIGN IN");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setBackground(new java.awt.Color(255, 196, 196));
        jButton2.setText("Already have an account? Log-In");
        jButton2.setBorder(null);
        jButton2.addActionListener(this::jButton2ActionPerformed);

        pinIn1.setBackground(new java.awt.Color(252, 245, 238));
        pinIn1.setForeground(new java.awt.Color(133, 14, 53));

        pin1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        pin1.setForeground(new java.awt.Color(133, 14, 53));
        pin1.setText("ADDRESS");

        age.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        pin2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        pin2.setForeground(new java.awt.Color(133, 14, 53));
        pin2.setText("PHONE NUMBER");

        pinIn2.setBackground(new java.awt.Color(252, 245, 238));
        pinIn2.setForeground(new java.awt.Color(133, 14, 53));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(80, 80, 80))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pinIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pinIn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email)
                                    .addComponent(pin)
                                    .addComponent(pin1)
                                    .addComponent(pin2)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(login)
                .addGap(18, 18, 18)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pinIn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pinIn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jButton2)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void idInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new signup().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner age;
    private javax.swing.JSpinner age1;
    private javax.swing.JSpinner age2;
    private javax.swing.JSpinner age3;
    private javax.swing.JSpinner age4;
    private javax.swing.JSpinner age5;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel email2;
    private javax.swing.JLabel email3;
    private javax.swing.JLabel email4;
    private javax.swing.JLabel email5;
    private javax.swing.JTextField idIn;
    private javax.swing.JTextField idIn1;
    private javax.swing.JTextField idIn2;
    private javax.swing.JTextField idIn3;
    private javax.swing.JTextField idIn4;
    private javax.swing.JTextField idIn5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel login;
    private javax.swing.JLabel login1;
    private javax.swing.JLabel login2;
    private javax.swing.JLabel login3;
    private javax.swing.JLabel login4;
    private javax.swing.JLabel login5;
    private javax.swing.JLabel pin;
    private javax.swing.JLabel pin1;
    private javax.swing.JLabel pin10;
    private javax.swing.JLabel pin11;
    private javax.swing.JLabel pin12;
    private javax.swing.JLabel pin13;
    private javax.swing.JLabel pin14;
    private javax.swing.JLabel pin15;
    private javax.swing.JLabel pin16;
    private javax.swing.JLabel pin17;
    private javax.swing.JLabel pin2;
    private javax.swing.JLabel pin3;
    private javax.swing.JLabel pin4;
    private javax.swing.JLabel pin5;
    private javax.swing.JLabel pin6;
    private javax.swing.JLabel pin7;
    private javax.swing.JLabel pin8;
    private javax.swing.JLabel pin9;
    private javax.swing.JPasswordField pinIn1;
    private javax.swing.JPasswordField pinIn10;
    private javax.swing.JPasswordField pinIn11;
    private javax.swing.JPasswordField pinIn12;
    private javax.swing.JPasswordField pinIn2;
    private javax.swing.JPasswordField pinIn3;
    private javax.swing.JPasswordField pinIn4;
    private javax.swing.JPasswordField pinIn5;
    private javax.swing.JPasswordField pinIn6;
    private javax.swing.JPasswordField pinIn7;
    private javax.swing.JPasswordField pinIn8;
    private javax.swing.JPasswordField pinIn9;
    // End of variables declaration//GEN-END:variables
}
