package GUI;


import GUI.SignIn;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author ruanyaner.bz533
 */
public class PassWord extends javax.swing.JFrame {
     // Creates new form PassWord
    public PassWord() {
        initComponents();
        txtsq.setEditable(false);
    }
PreparedStatement pst;
    Statement st=null;
    ResultSet rs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        txtans = new javax.swing.JTextField();
        txtsq = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        lblemail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(136, 203, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Sitka Subheading", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Forgot Password?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 210, 30));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 50, 30));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sequrity Question:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 140, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Answer:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 120, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Set Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 110, 30));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 300, 30));

        txtans.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtansKeyPressed(evt);
            }
        });
        jPanel1.add(txtans, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 300, 30));

        txtsq.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtsq, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 300, 30));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 230, 30));

        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        jButton3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Back To Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        btnsearch.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(0, 153, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 70, 30));

        lblemail.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 42, 278, 15));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/goctuong.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -50, 190, 240));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2con.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 510, 200, 100));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meoxam.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 170, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 500, 600));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -100, 1910, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 new SignIn().setVisible(true);     

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
            //st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pst=con.prepareStatement("select sq from signup where email=?");
            pst.setString(1, txtemail.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                txtsq.setText(rs.getString("sq"));
                }
            else
                JOptionPane.showMessageDialog(this,"Email id not exist");
            txtans.setText("");
            txtpassword.setText("");
        } catch (ClassNotFoundException | SQLException ex) {
           // Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(txtsq.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Enter Email and Search it");   
        txtemail.requestFocus();
    }
    else if(txtans.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Enter vaild Answer");
        txtans.requestFocus();
    }
    else if(txtpassword.getText().equals("")){
        JOptionPane.showMessageDialog(this," Password Field Not Empity");
        txtpassword.requestFocus();
    }
    else{
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
        //st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        pst=conn.prepareStatement("select * from signup where answer=? and email=?");
        pst.setString(1, txtans.getText());
        pst.setString(2, txtemail.getText());
        rs=pst.executeQuery();
        if(rs.next()){
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
            pst=con.prepareStatement("update signup set password=? where email=?");
            pst.setString(1, txtpassword.getText());
            pst.setString(2, txtemail.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Password Reset\nLogin Now","Success",JOptionPane.INFORMATION_MESSAGE);
            new SignIn().setVisible(true); 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Wrong Answer Entery","Wrong",JOptionPane.WARNING_MESSAGE);
            txtpassword.setText("");
            txtans.setText("");
        }
    }catch(Exception e){ 
    }  
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtansKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtansKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER) 
    txtpassword.requestFocus();
    }//GEN-LAST:event_txtansKeyPressed

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    if(txtsq.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Enter Email and Search it");   
        txtemail.requestFocus();
    }
    else if(txtsq.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Enter vaild Answer");
        txtans.requestFocus();
    }
    else if(txtpassword.getText().equals("")){
        JOptionPane.showMessageDialog(this,"set Password Field Not Empity");
        txtpassword.requestFocus();
    }
    else{
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
        st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        pst=conn.prepareStatement("select * from signup where answer=?");
        pst.setString(1, txtans.getText());
        rs=pst.executeQuery();
        if(rs.next()){
           //txtsq.setText(rs.getString("answer"));
           //}
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
            pst=con.prepareStatement("update signup set password=? where email=?");
            pst.setString(1, txtpassword.getText());
            pst.setString(2, txtemail.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Password Reset\nLogin now","Success",JOptionPane.INFORMATION_MESSAGE);
            new SignIn().setVisible(true); 

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Wrong Answer Entery","Wrong",JOptionPane.WARNING_MESSAGE);
            txtpassword.setText("");
            txtans.setText("");
            txtans.requestFocus();
        }
    }catch(Exception e){ 
    }
    }
}
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
//txtemail.setText(txtemail.getText().toLowerCase()); 
//
//     int a=txtemail.getText().indexOf('@');
//     int b=txtemail.getText().length();
//     
//      if(a == -1){
//          lblemail.setText("Invalied Email id");
//      }
//      else if (b>a+1){
//      String s=txtemail.getText();
//      String[] splitString = s.split("@");
//      if(splitString[1].equalsIgnoreCase("gmail.com")){
//      lblemail.setText("");
//      txtpassword.requestFocus();
//      }
//      else
//         lblemail.setText("Invalied Email id");
//      }  
//      if(txtemail.getText().equals(""))
//          lblemail.setText("");
//
    }//GEN-LAST:event_txtemailKeyReleased

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
            java.util.logging.Logger.getLogger(PassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblemail;
    private javax.swing.JTextField txtans;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtsq;
    // End of variables declaration//GEN-END:variables
}
