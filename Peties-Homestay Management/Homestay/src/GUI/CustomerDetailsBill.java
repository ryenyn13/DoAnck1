package GUI;


import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ruanyaner.bz533
 */
public class CustomerDetailsBill extends javax.swing.JFrame {
    static String idd;
    /**
     * Creates new form CustomerDetailsBill
     */
    public CustomerDetailsBill() {
        initComponents();
        SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        txtdate.setText(d.format(date));
        s();
    }

 public void s() {

        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        java.sql.Connection con = null;
        int q, i;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay", "root", "123456789");
            pst = con.prepareStatement("Select * from customer where status=?");
            pst.setString(1, "check out");
            rs = pst.executeQuery();
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 1; i <= q; i++) {
                    columnData.add(rs.getString("billid"));
                    columnData.add(rs.getString("roomnumber"));
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("phone"));
                    columnData.add(rs.getString("nationality"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("address"));
                    columnData.add(rs.getString("date"));
                    columnData.add(rs.getString("outdate"));
                    columnData.add(rs.getString("bedfor"));
                    columnData.add(rs.getString("roomtype"));
                    columnData.add(rs.getString("price"));
                    columnData.add(rs.getString("days"));
                    columnData.add(rs.getString("amount"));

                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception e) {

        }
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill.jpg"))); // NOI18N
        jLabel1.setText("Customer Details Bill");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 13, 240, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit icon_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 30, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search by CheckOUT Date ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 230, -1));

        txtdate.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 140, 40));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 90, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bill ID", "Room Number", "Name", "Mobile Number", "Nationality", "Gender", "Email", "Adhar", "Address", "Check in Datel", "Ckeck out Date", "Bed", "Room Type", "Price", "Number of Days", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 950, 450));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Double Click on row to Open Bill");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 290, 42));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 100, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/tải xuống (3).jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -340, 190, 1110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/tải xuống (3).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -220, 730, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/tải xuống (3).jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, -8, -1, 1120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
if(evt.getClickCount()==2){
   
    DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
    int SelectedRows=jTable1.getSelectedRow();
    idd=((String) RecordTable.getValueAt(SelectedRows,0));
     new GenerateBill().setVisible(true);
}              
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        java.sql.Connection con = null;
        int q, i;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay", "root", "123456789");
            pst = con.prepareStatement("Select * from customer where status=? AND outdate=?");
            pst.setString(1, "check out");
            pst.setString(2,txtdate.getText());
            rs = pst.executeQuery();
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 1; i <= q; i++) {
                    columnData.add(rs.getString("billid"));
                    columnData.add(rs.getString("roomnumber"));
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("phone"));
                    columnData.add(rs.getString("nationality"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("address"));
                    columnData.add(rs.getString("date"));
                    columnData.add(rs.getString("outdate"));
                    columnData.add(rs.getString("bedfor"));
                    columnData.add(rs.getString("roomtype"));
                    columnData.add(rs.getString("price"));
                    columnData.add(rs.getString("days"));
                    columnData.add(rs.getString("amount"));

                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Record Not Found.");
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
s();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetailsBill().setVisible(true);
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
    private javax.swing.JTextField txtdate;
    // End of variables declaration//GEN-END:variables
}
