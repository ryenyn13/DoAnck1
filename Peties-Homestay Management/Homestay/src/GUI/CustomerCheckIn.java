package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CustomerCheckIn extends javax.swing.JFrame {
     // Creates new form CustomerCheckIn
    public CustomerCheckIn() {
        initComponents();
        SimpleDateFormat dat = new SimpleDateFormat("yyyy/MM/dd ");
        Date d = new Date();
        txtdate.setText(dat.format(d));
        txtname.requestFocus();

        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay", "root", "123456789");
            //st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pst = con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bedfor=?");
            pst.setString(1, "Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobed.getItemAt(combobed.getSelectedIndex()));
            rs = pst.executeQuery();
            while (rs.next()) {
                comboroomnumber.addItem(rs.getString("roomnumber"));
            }
            pst = con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtaddres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtadhar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnat = new javax.swing.JTextField();
        combogender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtprice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comboroomnumber = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        comboroomtype = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        combobed = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        h = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked.png"))); // NOI18N
        jLabel1.setText("Customer Check IN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 220, 70));

        jPanel1.setBackground(new java.awt.Color(135, 201, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Pet Gender:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 170, 30));

        lblemail.setForeground(new java.awt.Color(204, 0, 0));
        lblemail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 390, 20));

        txtaddres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtaddres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaddresFocusLost(evt);
            }
        });
        txtaddres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaddresMouseClicked(evt);
            }
        });
        txtaddres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddresActionPerformed(evt);
            }
        });
        jPanel2.add(txtaddres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 320, 30));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Address:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 294, 34));

        txtadhar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtadhar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtadharFocusLost(evt);
            }
        });
        txtadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtadharKeyPressed(evt);
            }
        });
        jPanel2.add(txtadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 320, 30));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Own's CCCD:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 294, 38));

        txtnat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtnat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnatFocusLost(evt);
            }
        });
        txtnat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnatKeyPressed(evt);
            }
        });
        jPanel2.add(txtnat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 320, 30));

        combogender.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        combogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        combogender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                combogenderFocusLost(evt);
            }
        });
        combogender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combogenderActionPerformed(evt);
            }
        });
        combogender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combogenderKeyPressed(evt);
            }
        });
        jPanel2.add(combogender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 320, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Mobile Number:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 291, 36));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Nationality:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 100, 29));

        txtemail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 320, 30));

        txtmob.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtmob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmobFocusLost(evt);
            }
        });
        txtmob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmobKeyPressed(evt);
            }
        });
        jPanel2.add(txtmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 320, 30));

        txtname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 320, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Email:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 160, 40));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Pet Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, 35));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 540, 590));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 90, 30));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Book Room");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, -1, 40));

        txtprice.setEditable(false);
        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 310, 30));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 160, 30));

        comboroomnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboroomnumber.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboroomnumberItemStateChanged(evt);
            }
        });
        jPanel1.add(comboroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 310, 30));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Room Number:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 130, 30));

        comboroomtype.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        comboroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "General", "Big", "Large" }));
        comboroomtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboroomtypeItemStateChanged(evt);
            }
        });
        comboroomtype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboroomtypeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboroomtypeMouseReleased(evt);
            }
        });
        comboroomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboroomtypeActionPerformed(evt);
            }
        });
        jPanel1.add(comboroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 310, 30));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Room Type:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 100, 30));

        combobed.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        combobed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small Cat", "General Cat", "Bigsize Cat", "Small Dog", "General Dog", "Bigsize Dog", " " }));
        combobed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobedItemStateChanged(evt);
            }
        });
        combobed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobedActionPerformed(evt);
            }
        });
        jPanel1.add(combobed, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 310, 30));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bed for:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 80, 30));

        txtdate.setEditable(false);
        txtdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 310, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Check IN Date(Today):");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 294, 40));

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Information");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 1050, 680));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit icon_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/tải xuống4.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, 770));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/tải xuống4.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 590, 770));

        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/tải xuống4.jpg"))); // NOI18N
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -60, 590, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtname.setText("");
        txtmob.setText("");
        txtnat.setText("");
        txtemail.setText("");
        txtadhar.setText("");
        txtaddres.setText("");
        combogender.setSelectedIndex(0);
        combobed.setSelectedIndex(0);
        comboroomtype.setSelectedIndex(0);
        if (comboroomnumber.getItemCount() == 0) {
            txtprice.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed

    }//GEN-LAST:event_txtdateActionPerformed

    private void comboroomnumberItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboroomnumberItemStateChanged
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay", "root", "123456789");
            pst = con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_comboroomnumberItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtname.requestFocus();
        } else if (txtmob.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtmob.requestFocus();
        } else if (txtemail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtemail.requestFocus();
        } else if (txtnat.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtnat.requestFocus();
        } else if (txtadhar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtadhar.requestFocus();
        } else if (txtaddres.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Field is Requied");
            txtaddres.requestFocus();
        } else if (txtprice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Sorry, This type of Room Not avaible Select another room ");
            txtaddres.requestFocus();
        } else if (txtmob.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Mobile Number Should be 10 Digit.");
        } else if (txtadhar.getText().length() != 12) {
            JOptionPane.showMessageDialog(this, "Own's CCCD Should be 12 Digit.");
        } else {
            try {
                long l = Long.parseLong(txtmob.getText());
                l = Long.parseLong(txtadhar.getText());
                try {
                    PreparedStatement pst;
                    ResultSet rs;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay", "root", "123456789");
                    pst = con.prepareStatement("insert into customer(name,phone,email,gender,address,nationality,joindate,roomnumber,bedfor,roomtype,price,status)values(?,?,?,?,?,?,?,?,?,?,?,?)");
                    pst.setString(1, txtname.getText());
                    pst.setString(2, txtmob.getText());
                    pst.setString(3, txtemail.getText().toLowerCase());
                    pst.setString(4, combogender.getItemAt(combogender.getSelectedIndex()));
                    pst.setString(5, txtaddres.getText());
//                    pst.setString(6, txtadhar.getText());
                    pst.setString(6, txtnat.getText());
                    pst.setString(7, txtdate.getText());
                    pst.setString(8, (String) comboroomnumber.getSelectedItem());
                    pst.setString(9, (String) combobed.getSelectedItem());
                    pst.setString(10, (String) comboroomtype.getSelectedItem());
                    pst.setString(11, txtprice.getText());
                    pst.setString(12, "NULL");
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Room Alloted");
                    pst = con.prepareStatement("update room set status=? where roomnumber=?");
                    pst.setString(1, "Booked");
                    pst.setString(2, (String) comboroomnumber.getSelectedItem());
                    pst.executeUpdate();
                    pst = con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bedfor=?");
                    pst.setString(1, "Not Booked");
                    pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
                    pst.setString(3, combobed.getItemAt(combobed.getSelectedIndex()));
                    rs = pst.executeQuery();
                    comboroomnumber.removeAllItems();
                    while (rs.next()) {
                        comboroomnumber.addItem(rs.getString("roomnumber"));
                    }
                    pst = con.prepareStatement("select price from room where roomnumber=?");
                    pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        txtprice.setText(rs.getString("price"));
                    }
                    txtname.setText("");
                    txtmob.setText("");
                    txtnat.setText("");
                    txtemail.setText("");
                    txtadhar.setText("");
                    txtaddres.setText("");
                    combogender.setSelectedIndex(0);
                    combobed.setSelectedIndex(0);
                    comboroomtype.setSelectedIndex(0);
                    if (comboroomnumber.getItemCount() == 0) {
                        txtprice.setText("");
                    }
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                    Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, e);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Either Mobile Number or CCCD Not valied");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboroomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboroomtypeActionPerformed

    }//GEN-LAST:event_comboroomtypeActionPerformed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased

    }//GEN-LAST:event_jButton2MouseReleased

    private void comboroomtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboroomtypeItemStateChanged
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay", "root", "123456789");
            pst = con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bedfor=?");
            pst.setString(1, "Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobed.getItemAt(combobed.getSelectedIndex()));
            rs = pst.executeQuery();
            comboroomnumber.removeAllItems();
            while (rs.next()) {
                comboroomnumber.addItem(rs.getString("roomnumber"));
            }
            pst = con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }

    }//GEN-LAST:event_comboroomtypeItemStateChanged

    private void comboroomtypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboroomtypeMouseClicked
    }//GEN-LAST:event_comboroomtypeMouseClicked

    private void comboroomtypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboroomtypeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboroomtypeMouseReleased

    private void combobedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobedItemStateChanged
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay", "root", "123456789");
            pst = con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bedfor=?");
            pst.setString(1, "Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobed.getItemAt(combobed.getSelectedIndex()));
            rs = pst.executeQuery();
            comboroomnumber.removeAllItems();
            while (rs.next()) {
                comboroomnumber.addItem(rs.getString("roomnumber"));
            }
            pst = con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }

    }//GEN-LAST:event_combobedItemStateChanged

    private void txtaddresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddresActionPerformed

    }//GEN-LAST:event_txtaddresActionPerformed

    private void txtaddresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaddresMouseClicked

    }//GEN-LAST:event_txtaddresMouseClicked

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained

    }//GEN-LAST:event_txtnameFocusGained

    private void txtmobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmobFocusLost

    }//GEN-LAST:event_txtmobFocusLost

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost

    }//GEN-LAST:event_txtemailFocusLost

    private void combogenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combogenderFocusLost

    }//GEN-LAST:event_combogenderFocusLost

    private void txtnatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnatFocusLost

    }//GEN-LAST:event_txtnatFocusLost

    private void txtadharFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtadharFocusLost

    }//GEN-LAST:event_txtadharFocusLost

    private void txtaddresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddresFocusLost

    }//GEN-LAST:event_txtaddresFocusLost

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
    }//GEN-LAST:event_txtnameFocusLost

    private void combogenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combogenderActionPerformed

    }//GEN-LAST:event_combogenderActionPerformed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtmob.requestFocus();
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtmobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtemail.requestFocus(); 
    }//GEN-LAST:event_txtmobKeyPressed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            combogender.requestFocus();    
    }//GEN-LAST:event_txtemailKeyPressed

    private void combogenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combogenderKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtnat.requestFocus();  
    }//GEN-LAST:event_combogenderKeyPressed

    private void txtnatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnatKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtadhar.requestFocus();  
    }//GEN-LAST:event_txtnatKeyPressed

    private void txtadharKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadharKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtaddres.requestFocus();       
    }//GEN-LAST:event_txtadharKeyPressed

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
       
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
//        txtemail.setText(txtemail.getText().toLowerCase());
//
//        int a = txtemail.getText().indexOf('@');
//        int b = txtemail.getText().length();
//        if (a == -1) {
//            lblemail.setText("Invalied Email id");
//        }
//        if (txtemail.getText().equals(""))
//            lblemail.setText("");
    }//GEN-LAST:event_txtemailKeyReleased

    private void combobedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobedActionPerformed
     
    }//GEN-LAST:event_combobedActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
       
    }//GEN-LAST:event_txtemailActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobed;
    private javax.swing.JComboBox<String> combogender;
    private javax.swing.JComboBox<String> comboroomnumber;
    private javax.swing.JComboBox<String> comboroomtype;
    private javax.swing.JLabel h;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblemail;
    private javax.swing.JTextField txtaddres;
    private javax.swing.JTextField txtadhar;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnat;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
