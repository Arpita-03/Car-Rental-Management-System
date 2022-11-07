/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author vijay bhamre
 */
public class Rental extends javax.swing.JFrame {

    /**
     * Creates new form Rental
     */
    public Rental() {
        initComponents();
        
    LoadCarid();
    txtdate.setDateFormatString("yyyy/MM/dd");
    txtdue.setDateFormatString("yyyy/MM/dd");
    
    txtcust_id.setEnabled(false);
    txtcustname.setEnabled(false);
    txtrental.setEnabled(false);
    txtdate.setEnabled(false);
    txtdue.setEnabled(false);
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    PreparedStatement pst1;
    PreparedStatement pst2;
    PreparedStatement pst3;
    PreparedStatement pst4;
    
    public void LoadCarid()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost/arent","root","");
            pst = con.prepareStatement("Select * from carregistration");
            ResultSet rs = pst.executeQuery();
            combocarID.removeAllItems();
            
            
             
            while(rs.next())
            {
                
             combocarID.addItem(rs.getString(2));
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combocarID = new javax.swing.JComboBox<>();
        txtcust_id = new javax.swing.JTextField();
        txtcustname = new javax.swing.JTextField();
        txtrental = new javax.swing.JTextField();
        txtdate = new com.toedter.calendar.JDateChooser();
        txtdue = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtavl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Rental"));

        jLabel2.setText("Vehicle- ID");

        jLabel3.setText("Customer ID");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Rental Fee");

        jLabel6.setText("Date");

        jLabel7.setText("Due Date");

        combocarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocarIDActionPerformed(evt);
            }
        });

        txtcust_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcust_idKeyPressed(evt);
            }
        });

        jLabel8.setText("Availability");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcust_id, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcustname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtrental, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(combocarID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txtavl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtdue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(199, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combocarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtavl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcust_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcustname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtrental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtdue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 430, 400));

        jLabel9.setIcon(new javax.swing.ImageIcon("F:\\java-jdk & mysql\\images\\fifth.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combocarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocarIDActionPerformed
        // TODO add your handling code here:
        String car_id = combocarID.getSelectedItem().toString();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost/arent","root","");
            
            pst1 = con.prepareStatement("select * from carregistration where car_no = ?");
            pst1.setString(1, car_id);
            rs = pst1.executeQuery();
            
            if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(this,"Car number not found");
            }
            else
            {
                String aval = rs.getString("available");
                txtavl.setText(aval.trim());
                
                if(aval.equals("yes"))
                {
                   txtcust_id.setEnabled(true);
                   txtcustname.setEnabled(true);
                   txtrental.setEnabled(true);
                   txtdate.setEnabled(true);
                   txtdue.setEnabled(true); 
                }
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        
    }//GEN-LAST:event_combocarIDActionPerformed

    private void txtcust_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcust_idKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
      
        {
            String cust_id = txtcust_id.getText();
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con =  DriverManager.getConnection("jdbc:mysql://localhost/arent","root","");
                pst2 = con.prepareStatement("select * from customer where cust_id= ?");
                pst2.setString(1, cust_id);
                rs = pst2.executeQuery();
                
                if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(this,"Customer number not found");
            }
            else
            {
                String custname = rs.getString("name");
                txtcustname.setText(custname.trim());
            }
                
                        
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_txtcust_idKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            String car_id = combocarID.getSelectedItem().toString();
            String cust_id = txtcust_id.getText();
            String fee = txtrental.getText();
            SimpleDateFormat Date_format = new SimpleDateFormat("yyyy-MM-DD");
            String date = Date_format.format(txtdate.getDate());
            SimpleDateFormat Date_format1 = new SimpleDateFormat("yyyy-MM-DD");
            String due = Date_format1.format(txtdue.getDate());
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost/arent","root","");
            pst3 = con.prepareStatement("insert into rental(car_id,cust_id,fee,date,due)values(?,?,?,?,?)");
            pst3 .setString(1, car_id);
            pst3 .setString(2, cust_id);
            pst3 .setString(3, fee );
            pst3 .setString(4, date);
            pst3 .setString(5, due);
            pst3.executeUpdate();
            
            pst4 = con.prepareStatement("update carregistration set available='NO' where car_no=?");
            pst4.setString(1, car_id);
            pst4.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Success");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combocarID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtavl;
    private javax.swing.JTextField txtcust_id;
    private javax.swing.JTextField txtcustname;
    private com.toedter.calendar.JDateChooser txtdate;
    private com.toedter.calendar.JDateChooser txtdue;
    private javax.swing.JTextField txtrental;
    // End of variables declaration//GEN-END:variables
}
