
package com.mycompany.bankingsystem;
import java.sql.*;

public class login extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(login.class.getName());

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        idIn = new javax.swing.JTextField();
        pin = new javax.swing.JLabel();
        pinIn = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 500));

        panel.setBackground(new java.awt.Color(255, 196, 196));
        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        login.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(133, 14, 53));
        login.setText("WELCOME");

        email.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(133, 14, 53));
        email.setText("ID :");

        idIn.setBackground(new java.awt.Color(252, 245, 238));
        idIn.setForeground(new java.awt.Color(133, 14, 53));

        pin.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        pin.setForeground(new java.awt.Color(133, 14, 53));
        pin.setText("Pin :");

        pinIn.setBackground(new java.awt.Color(252, 245, 238));
        pinIn.setForeground(new java.awt.Color(133, 14, 53));

        jButton1.setBackground(new java.awt.Color(133, 14, 53));
        jButton1.setForeground(new java.awt.Color(252, 245, 238));
        jButton1.setText("SIGN IN");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setBackground(new java.awt.Color(255, 196, 196));
        jButton2.setText("Don't have an account? Sign-Up");
        jButton2.setBorder(null);
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idIn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinIn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(jButton1))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pin)
                                .addComponent(email)))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(login))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int inputId = Integer.parseInt(idIn.getText());
        int inputPin = Integer.parseInt(new String(pinIn.getPassword()));
        
        String user = "root";
        String pass = "Alhyohan";
        String url = "jdbc:mysql://localhost:3306/bankingDb";
        boolean f = false;
        try(Connection conn = DriverManager.getConnection(url,user,pass)){
            String sql = "select accId,position,pin from bankingAccounts";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                int dbid = rs.getInt("accId");
                String dbposition = rs.getString("position");
                int dbpin = rs.getInt("pin");
                if(inputId == dbid && inputPin == dbpin && dbposition.equals("Admin")){
                    adminDashboard admin = new adminDashboard(dbid); // pass the ID here
                    admin.setVisible(true);
                    this.setVisible(false); // also hide the login window
                }
                if(inputId == dbid && inputPin == dbpin && dbposition.equals("User")){
                    deposit userDash = new deposit(dbid);
                    this.setVisible(false);
                    userDash.setVisible(true);
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        signup signup = new signup();;
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JTextField idIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel login;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel pin;
    private javax.swing.JPasswordField pinIn;
    // End of variables declaration//GEN-END:variables
}
