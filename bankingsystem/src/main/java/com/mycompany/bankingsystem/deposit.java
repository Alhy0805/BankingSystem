/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bankingsystem;
import javax.swing.*;
import java.awt.*;




public class deposit extends javax.swing.JFrame  {
    private int accId;
    public deposit() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    
    // 1. Create your image panel
        profile pfp = new profile();
        pfp.setPreferredSize(new Dimension(100, 100));
    // 2. Set a simple layout for the container so the image fills it
        pfpContainer.setLayout(new BorderLayout());

    // 3. Add the image to the container
        pfpContainer.add(pfp, BorderLayout.CENTER);

    // 4. Refresh to show changes
        pfpContainer.revalidate();
        pfpContainer.repaint();
    }
    public deposit(int id) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    
    // 1. Create your image panel
        profile pfp = new profile();
        pfp.setPreferredSize(new Dimension(100, 100));
    // 2. Set a simple layout for the container so the image fills it
        pfpContainer.setLayout(new BorderLayout());

    // 3. Add the image to the container
        pfpContainer.add(pfp, BorderLayout.CENTER);

    // 4. Refresh to show changes
        pfpContainer.revalidate();
        pfpContainer.repaint();
        
        accId = id;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        depositTab = new javax.swing.JButton();
        withdrawTab = new javax.swing.JButton();
        savings = new javax.swing.JButton();
        loan = new javax.swing.JButton();
        transac = new javax.swing.JButton();
        settings = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        pfpContainer = new javax.swing.JPanel();
        transferTab = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        savingsBtn = new javax.swing.JButton();
        locbankBtn = new javax.swing.JButton();
        interbankBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Dconfirm = new javax.swing.JButton();
        deposit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(133, 14, 53));
        mainPanel.setPreferredSize(new java.awt.Dimension(1200, 650));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 245, 238));
        jLabel1.setText("Welcome");

        buttonsPanel.setBackground(new java.awt.Color(252, 245, 238));
        buttonsPanel.setForeground(new java.awt.Color(252, 245, 238));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(200, 500));

        depositTab.setBackground(new java.awt.Color(238, 105, 131));
        depositTab.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        depositTab.setForeground(new java.awt.Color(133, 14, 53));
        depositTab.setText("Deposit");
        depositTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositTabActionPerformed(evt);
            }
        });

        withdrawTab.setBackground(new java.awt.Color(255, 196, 196));
        withdrawTab.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        withdrawTab.setForeground(new java.awt.Color(133, 14, 53));
        withdrawTab.setText("Withdraw");
        withdrawTab.setPreferredSize(new java.awt.Dimension(70, 35));
        withdrawTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawTabActionPerformed(evt);
            }
        });

        savings.setBackground(new java.awt.Color(255, 196, 196));
        savings.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        savings.setForeground(new java.awt.Color(133, 14, 53));
        savings.setText("Savings");
        savings.setPreferredSize(new java.awt.Dimension(70, 35));
        savings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingsActionPerformed(evt);
            }
        });

        loan.setBackground(new java.awt.Color(255, 196, 196));
        loan.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        loan.setForeground(new java.awt.Color(133, 14, 53));
        loan.setText("Loan");
        loan.setPreferredSize(new java.awt.Dimension(70, 35));
        loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanActionPerformed(evt);
            }
        });

        transac.setBackground(new java.awt.Color(255, 196, 196));
        transac.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        transac.setForeground(new java.awt.Color(133, 14, 53));
        transac.setText("Transaction");
        transac.setPreferredSize(new java.awt.Dimension(70, 35));
        transac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transacActionPerformed(evt);
            }
        });

        settings.setBackground(new java.awt.Color(255, 196, 196));
        settings.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        settings.setForeground(new java.awt.Color(133, 14, 53));
        settings.setText("Settings");
        settings.setPreferredSize(new java.awt.Dimension(70, 35));
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 196, 196));
        logout.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(133, 14, 53));
        logout.setText("Logout");
        logout.setPreferredSize(new java.awt.Dimension(100, 35));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pfpContainerLayout = new javax.swing.GroupLayout(pfpContainer);
        pfpContainer.setLayout(pfpContainerLayout);
        pfpContainerLayout.setHorizontalGroup(
            pfpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pfpContainerLayout.setVerticalGroup(
            pfpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        transferTab.setBackground(new java.awt.Color(255, 196, 196));
        transferTab.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        transferTab.setForeground(new java.awt.Color(133, 14, 53));
        transferTab.setText("Transfer");
        transferTab.setPreferredSize(new java.awt.Dimension(70, 35));
        transferTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferTabActionPerformed(evt);
            }
        });

        dashboard.setBackground(new java.awt.Color(255, 196, 196));
        dashboard.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        dashboard.setForeground(new java.awt.Color(133, 14, 53));
        dashboard.setText("Dashboard");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositTab, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(transferTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                        .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addComponent(pfpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositTab, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdrawTab, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transferTab, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savings, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transac, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(252, 245, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(755, 415));

        savingsBtn.setBackground(new java.awt.Color(238, 105, 131));
        savingsBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        savingsBtn.setText("Savings");
        savingsBtn.setPreferredSize(new java.awt.Dimension(75, 35));

        locbankBtn.setBackground(new java.awt.Color(255, 196, 196));
        locbankBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        locbankBtn.setText("Local Bank");
        locbankBtn.setPreferredSize(new java.awt.Dimension(75, 35));

        interbankBtn.setBackground(new java.awt.Color(255, 196, 196));
        interbankBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        interbankBtn.setText("International Bank");
        interbankBtn.setPreferredSize(new java.awt.Dimension(75, 35));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savingsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(locbankBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(interbankBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(savingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(locbankBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(interbankBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(462, 244));

        Dconfirm.setBackground(new java.awt.Color(238, 105, 131));
        Dconfirm.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        Dconfirm.setText("Confirm");
        Dconfirm.setToolTipText("");
        Dconfirm.setPreferredSize(new java.awt.Dimension(75, 35));
        Dconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DconfirmActionPerformed(evt);
            }
        });

        deposit.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        deposit.setText("0.00");
        deposit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 24)); // NOI18N
        jLabel2.setText("DEPOSIT");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel3.setText("Enter Amount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addComponent(Dconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsActionPerformed

    private void transacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transacActionPerformed

    private void loanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanActionPerformed
        loan loan = new loan();
        transition.switchFrame(this,loan);
    }//GEN-LAST:event_loanActionPerformed

    private void savingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsActionPerformed
        sbalance sbal = new sbalance(accId);
        transition.switchFrame(this,sbal);
    }//GEN-LAST:event_savingsActionPerformed

    private void withdrawTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawTabActionPerformed
        widthraw with = new widthraw(accId);
        transition.switchFrame(this,with);
    }//GEN-LAST:event_withdrawTabActionPerformed

    private void depositTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositTabActionPerformed
        deposit userDash = new deposit();
        transition.switchFrame(this,userDash);
    }//GEN-LAST:event_depositTabActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        deposit.setText("");
    }//GEN-LAST:event_depositActionPerformed

    private void transferTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferTabActionPerformed
       transfer trans = new transfer(accId);
        transition.switchFrame(this,trans);
    }//GEN-LAST:event_transferTabActionPerformed

    private void DconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DconfirmActionPerformed
        cdb cdb = new cdb();
        String Ssavings = deposit.getText();
        
        if(Ssavings.isEmpty()){
           ErrorManager.showError((java.awt.Frame)javax.swing.SwingUtilities.getWindowAncestor(this), 0);
       }else{
           try{
               double newSavings = Double.parseDouble(Ssavings.trim());
                cdb.setSavingsDeposit(accId, newSavings);
                deposit.setText("0.00");
           }catch(NumberFormatException e){           
               ErrorManager.showError((java.awt.Frame)javax.swing.SwingUtilities.getWindowAncestor(this), 0);
           }
       }
    }//GEN-LAST:event_DconfirmActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        udashboard dashboard = new udashboard(accId);
        transition.switchFrame(this,dashboard);
    }//GEN-LAST:event_dashboardActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dconfirm;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton dashboard;
    private javax.swing.JTextField deposit;
    private javax.swing.JButton depositTab;
    private javax.swing.JButton interbankBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loan;
    private javax.swing.JButton locbankBtn;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pfpContainer;
    private javax.swing.JButton savings;
    private javax.swing.JButton savingsBtn;
    private javax.swing.JButton settings;
    private javax.swing.JButton transac;
    private javax.swing.JButton transferTab;
    private javax.swing.JButton withdrawTab;
    // End of variables declaration//GEN-END:variables
}
