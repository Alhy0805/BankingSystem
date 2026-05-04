/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bankingsystem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Student
 */
public class searchUser extends javax.swing.JFrame {
    int accId;
    String position;
    /**
     * Creates new form searchUser
     */
    public searchUser() {
        initComponents();
        
        setLocationRelativeTo(null);
    }
    public searchUser(int id) {
        initComponents();
        
        setLocationRelativeTo(null);
        accId = id;
        
        profile pfp = new profile();
        pfp.setPreferredSize(new Dimension(100, 100));
    
        pfpContainer.setLayout(new BorderLayout());

    
        pfpContainer.add(pfp, BorderLayout.CENTER);

    
        pfpContainer.revalidate();
        pfpContainer.repaint();
        
        filterType.add("ID");
        filterType.add("Name");
        filterType.add("Status");

        
    
        
        updateTable();
    }
    private void updateTable(){
        
        
        DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
        model.setRowCount(0);
        String user = "root";
        String pass = "Alhyohan";
        String url = "jdbc:mysql://localhost:3306/bankingDb";
        
        try(Connection conn = DriverManager.getConnection(url,user,pass)){
            String sql = "select* from bankingAccounts";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("accId");
                String name = rs.getString("fullName");
                double savings = rs.getDouble("sBalance");
                double loans = rs.getDouble("lBalance");
                String status = rs.getString("status");
                
                model.addRow(new Object[]{id,name,savings,loans,status});
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < mainTable.getColumnCount(); i++) {
            mainTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    private void FilteredTable(int fid){
        
        
        DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
        model.setRowCount(0);

        String user = "root";
        String pass = "Alhyohan";
        String url = "jdbc:mysql://localhost:3306/bankingDb";

        String sql = "SELECT * FROM bankingAccounts WHERE accId =" + fid;
                 

        try (Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {         // ← also auto-close pstmt

            try (ResultSet rs = pstmt.executeQuery()) {                      // ← also auto-close rs
                while (rs.next()) {                                          // ✅ Fixed
                    int id          = rs.getInt("accId");
                    String name     = rs.getString("fullName");
                    double savings  = rs.getDouble("sBalance");
                    double loans    = rs.getDouble("lBalance");
                    String status   = rs.getString("status");

                    model.addRow(new Object[]{id, name, savings, loans, status});
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);               // ✅ Fixed

        for (int i = 0; i < mainTable.getColumnCount(); i++) {
            mainTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    private void FilteredTable(String NAME){
        
        
        DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
        model.setRowCount(0);

        String user = "root";
        String pass = "Alhyohan";
        String url = "jdbc:mysql://localhost:3306/bankingDb";

        String sql = "SELECT * FROM bankingAccounts WHERE fullname = ? ";
                 

        try (Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {         // ← also auto-close pstmt
            pstmt.setString(1,NAME);
        
        try (ResultSet rs = pstmt.executeQuery()) {                      // ← also auto-close rs
            while (rs.next()) {                                          // ✅ Fixed
                int id          = rs.getInt("accId");
                String name     = rs.getString("fullName");
                double savings  = rs.getDouble("sBalance");
                double loans    = rs.getDouble("lBalance");
                String status   = rs.getString("status");

                model.addRow(new Object[]{id, name, savings, loans, status});
            }
        }

        }catch (SQLException e) {
            e.printStackTrace();
        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);               // ✅ Fixed

        for (int i = 0; i < mainTable.getColumnCount(); i++) {
            mainTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    private void FilteredTableString(String STATUS){
        
        
        DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
        model.setRowCount(0);

        String user = "root";
        String pass = "Alhyohan";
        String url = "jdbc:mysql://localhost:3306/bankingDb";

        String sql = "SELECT * FROM bankingAccounts WHERE status = ?";
                 

        try (Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {         // ← also auto-close pstmt
            pstmt.setString(1,STATUS);
            try (ResultSet rs = pstmt.executeQuery()) {                      // ← also auto-close rs
                while (rs.next()) {                                          // ✅ Fixed
                    int id          = rs.getInt("accId");
                    String name     = rs.getString("fullName");
                    double savings  = rs.getDouble("sBalance");
                    double loans    = rs.getDouble("lBalance");
                    String status   = rs.getString("status");

                    model.addRow(new Object[]{id, name, savings, loans, status});
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);               // ✅ Fixed

        for (int i = 0; i < mainTable.getColumnCount(); i++) {
            mainTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        settingsBtn = new javax.swing.JButton();
        dataBtn = new javax.swing.JButton();
        pfpContainer = new javax.swing.JPanel();
        dash = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        filterInput = new javax.swing.JTextField();
        filter = new javax.swing.JButton();
        filterType = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        diana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 245, 238));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 500));

        searchBtn.setBackground(new java.awt.Color(238, 105, 131));
        searchBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(133, 14, 53));
        searchBtn.setText("Accounts");
        searchBtn.setPreferredSize(new java.awt.Dimension(72, 35));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        settingsBtn.setBackground(new java.awt.Color(255, 196, 196));
        settingsBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        settingsBtn.setForeground(new java.awt.Color(133, 14, 53));
        settingsBtn.setText("Settings");
        settingsBtn.setPreferredSize(new java.awt.Dimension(75, 35));

        dataBtn.setBackground(new java.awt.Color(255, 196, 196));
        dataBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        dataBtn.setForeground(new java.awt.Color(133, 14, 53));
        dataBtn.setText("Data");
        dataBtn.setPreferredSize(new java.awt.Dimension(75, 35));
        dataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataBtnActionPerformed(evt);
            }
        });

        pfpContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Banko ni Negro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Microsoft Sans Serif", 1, 18), new java.awt.Color(133, 14, 53))); // NOI18N
        pfpContainer.setForeground(new java.awt.Color(133, 14, 53));
        pfpContainer.setMaximumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout pfpContainerLayout = new javax.swing.GroupLayout(pfpContainer);
        pfpContainer.setLayout(pfpContainerLayout);
        pfpContainerLayout.setHorizontalGroup(
            pfpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pfpContainerLayout.setVerticalGroup(
            pfpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dash.setBackground(new java.awt.Color(255, 196, 196));
        dash.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        dash.setForeground(new java.awt.Color(133, 14, 53));
        dash.setText("Dashboard");
        dash.setPreferredSize(new java.awt.Dimension(72, 35));
        dash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 196, 196));
        logout.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(133, 14, 53));
        logout.setText("Logout");
        logout.setPreferredSize(new java.awt.Dimension(75, 35));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pfpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dash, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(settingsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pfpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(dash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainTable.setBackground(new java.awt.Color(255, 196, 196));
        mainTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 14, 53), 1, true));
        mainTable.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        mainTable.setForeground(new java.awt.Color(133, 14, 53));
        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Account ID", "Full Name", "Savings Balance", "Loans Balance", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mainTable.setGridColor(new java.awt.Color(133, 14, 53));
        mainTable.setShowGrid(true);
        jScrollPane1.setViewportView(mainTable);
        if (mainTable.getColumnModel().getColumnCount() > 0) {
            mainTable.getColumnModel().getColumn(0).setResizable(false);
            mainTable.getColumnModel().getColumn(4).setResizable(false);
        }

        filterInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterInputActionPerformed(evt);
            }
        });

        filter.setBackground(new java.awt.Color(255, 196, 196));
        filter.setText("Filter");
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        jLabel1.setText("Filter Type");

        jLabel2.setText("Filter Data");

        diana.setBackground(new java.awt.Color(255, 196, 196));
        diana.setForeground(new java.awt.Color(133, 14, 53));
        diana.setText("Ask Diana?");
        diana.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dianaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filterType, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(diana))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(diana))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filter))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        searchUser sUser = new searchUser(accId);
        this.setVisible(false);
        this.dispose();
        sUser.setVisible(true);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void dataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataBtnActionPerformed
       adminData data = new adminData();
       data.setLocationRelativeTo(null);
       data.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_dataBtnActionPerformed

    private void dashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashActionPerformed
        adminDashboard dash =  new adminDashboard(accId);
        this.setVisible(false);
        this.dispose();
        dash.setVisible(true);
    }//GEN-LAST:event_dashActionPerformed

    private void filterInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterInputActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        
        
        if (filterInput.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Input At Least One", "Error", JOptionPane.ERROR_MESSAGE);
            updateTable();
            return;
        } else if(filterType.getSelectedItem().toString().trim().equals("ID")){
            int ID = Integer.parseInt(filterInput.getText().trim());
            
            FilteredTable(ID);
        }else if(filterType.getSelectedItem().toString().trim().equals("Name")){
            String name = filterInput.getText().trim();
            
            FilteredTable(name);
        }else if(filterType.getSelectedItem().toString().trim().equals("Status")){
            String status = filterInput.getText().trim();
            
            FilteredTableString(status);
        }
        
        
    }//GEN-LAST:event_filterActionPerformed

    private void dianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dianaActionPerformed

        // hide main dashboard
        new AiUi(accId, true, this,position);
        // TODO add your handling code here:
    }//GEN-LAST:event_dianaActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(searchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dash;
    private javax.swing.JButton dataBtn;
    private javax.swing.JButton diana;
    private javax.swing.JButton filter;
    private javax.swing.JTextField filterInput;
    private java.awt.Choice filterType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTable mainTable;
    private javax.swing.JPanel pfpContainer;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton settingsBtn;
    // End of variables declaration//GEN-END:variables
}                  





