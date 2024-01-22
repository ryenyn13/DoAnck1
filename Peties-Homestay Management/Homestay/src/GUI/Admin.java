package GUI;

import GUI.SignIn;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ruanyaner.bz533
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
   public Admin() {
        initComponents();
        s();
        txtemail.requestFocus();
    }
public void s(){
    PreparedStatement pst=null;
    Statement st=null;
    ResultSet rs=null;
    Connection con=null;
    int q,i;
   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
            pst=con.prepareStatement("Select * from signup");
            rs=pst.executeQuery();
            ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
            q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while(rs.next()){
                Vector columnData=new Vector();
                for(i=1;i<=q;i++){
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("password"));
                    columnData.add(rs.getString("sq"));
                    columnData.add(rs.getString("answer"));
                    columnData.add(rs.getString("status"));
                    
                }
                RecordTable.addRow(columnData);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(Record.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Double Click on Table row to change Status");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 410, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Search by Email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 140, 30));

        jButton1.setBackground(new java.awt.Color(0, 168, 168));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 117, -1, 20));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 390, 40));

        jTable1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Password", "Sequrity Questiom", "Answer", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 1200, 390));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit icon_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 20, 20));

        jButton3.setBackground(new java.awt.Color(0, 168, 168));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 117, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/b19.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/b19.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/b19.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 680, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/b19.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new SignIn().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                s();       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(txtemail.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Record Not Found");
    }
    else{
    PreparedStatement pst=null;
    Statement st=null;
    ResultSet rs=null;
    Connection con=null;
    int q,i;
   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
            pst=con.prepareStatement("Select * from signup where email=?");
            pst.setString(1,txtemail.getText());
            rs=pst.executeQuery();
            ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
            q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while(rs.next()){
                Vector columnData=new Vector();
                for(i=1;i<=q;i++){
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("password"));
                    columnData.add(rs.getString("sq"));
                    columnData.add(rs.getString("answer"));
                    columnData.add(rs.getString("status"));
                    
                }
                RecordTable.addRow(columnData);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this,"Record Not Found"); //Logger.getLogger(Record.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount()==2){ //click chuột 2 lần đổi trạng -> thái duyệt tài khoản
    
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            int SelectedRows=jTable1.getSelectedRow();
            String ck=((String) RecordTable.getValueAt(SelectedRows,5));
             System.out.println(ck);

            String email=((String) RecordTable.getValueAt(SelectedRows,1));
            if(ck==null){
                int yes=JOptionPane.showConfirmDialog(this,"Status is pending, do you want to change it");
                if(JOptionPane.YES_OPTION==yes){
                    PreparedStatement pst=null;
                    Connection con=null;
                     try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
                        pst = con.prepareStatement("update signup set status=? where email=?");
                         pst.setString(1, "approved");
                        pst.setString(2,email);
                         pst.executeUpdate();
                        s();
                    }
                   catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }        
                }
            }
            else{
                int yes=JOptionPane.showConfirmDialog(this,"Staus is Approved ,do you want to change it");
                if(JOptionPane.YES_OPTION==yes){
                if(JOptionPane.YES_OPTION==yes){
                PreparedStatement pst=null;
                Connection con=null;
                try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
                pst = con.prepareStatement("update signup set status=? where email=?");
                pst.setString(1, "pending");
                 pst.setString(2,email);
                 pst.executeUpdate();
                s();
                }catch(Exception e){ 
            }
            }
            }
            }
        }     
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
