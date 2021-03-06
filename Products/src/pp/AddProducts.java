/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author STATION_04
 */
public class AddProducts extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs = null;
    PreparedStatement pst=null;
    
    public AddProducts() {
        initComponents();
        conn=dbconnection.MyDbConnection();
    }
    
    public void clearFields(){
        txtBarcode.setText("");
        txtDescription.setText("");
        cboUnit.setSelectedItem("");
        cboCategory.setSelectedItem("");
        txtPrice.setText("");
        txtStocks.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtStocks = new javax.swing.JTextField();
        cboCategory = new javax.swing.JComboBox();
        cboUnit = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Product Info");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Input Product Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 360, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("BARCODE");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 20, 90, 30);

        txtBarcode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarcodeKeyReleased(evt);
            }
        });
        jPanel2.add(txtBarcode);
        txtBarcode.setBounds(130, 20, 230, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("DESCRIPTION");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 60, 100, 30);

        txtDescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(txtDescription);
        txtDescription.setBounds(130, 60, 230, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("UNIT");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 100, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CATEGORY");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 140, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("PRICE");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 180, 90, 30);

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(txtPrice);
        txtPrice.setBounds(130, 180, 230, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("STOCKS");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 220, 90, 30);

        txtStocks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(txtStocks);
        txtStocks.setBounds(130, 220, 230, 30);

        cboCategory.setEditable(true);
        cboCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "JUNK FOODS", "FROOZEN FOODS", "SOFT/HARD DRINKS", "APPAREL", "CAN GOODS", " " }));
        jPanel2.add(cboCategory);
        cboCategory.setBounds(130, 140, 230, 30);

        cboUnit.setEditable(true);
        cboUnit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "PCS", "PACK", "CASE" }));
        jPanel2.add(cboUnit);
        cboUnit.setBounds(130, 100, 230, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, 50, 500, 280);

        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 350, 100, 40);

        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(130, 350, 100, 40);

        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(240, 350, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            if (txtBarcode.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Barcode filed is empty!");
            }else if (txtDescription.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Description filed is empty!");
            }else if (cboUnit.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Unit filed is empty!");
            }else if (cboCategory.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Category filed is empty!");
            }else if (txtPrice.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Price filed is empty!");
            }else if (txtStocks.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Stocks filed is empty!");
            }else{
                String str="INSERT INTO products "
                + "(Barcode,Description,Unit,Categories,Price,Stocks) "
                + "VALUES(?,?,?,?,?,?)";
                pst=conn.prepareStatement(str);
                pst.setString(1, txtBarcode.getText());
                pst.setString(2, txtDescription.getText());
                pst.setString(3, cboUnit.getSelectedItem().toString());
                pst.setString(4, cboCategory.getSelectedItem().toString());
                pst.setString(5, txtPrice.getText());
                pst.setString(6, txtStocks.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null,"Successfully Added!");
                clearFields();
            }
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            if (txtBarcode.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Barcode filed is empty!");
            }else if (txtDescription.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Description filed is empty!");
            }else if (cboUnit.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Unit filed is empty!");
            }else if (cboCategory.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Category filed is empty!");
            }else if (txtPrice.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Price filed is empty!");
            }else if (txtStocks.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Stocks filed is empty!");
            }else{
                String bc = txtBarcode.getText();
                String descr = txtDescription.getText();
                String un = cboUnit.getSelectedItem().toString();
                String cate = cboCategory.getSelectedItem().toString();
                String pri = txtPrice.getText();
                String stoc = txtStocks.getText();
                
                String str="UPDATE products SET "
                + "Barcode='" + bc + "',Description='" + descr + "',Unit='" + un + "',Categories='" + cate + "',Price='" + pri + "',Stocks='" + stoc + "' "
                + "WHERE Barcode='" + bc + "'";
                pst=conn.prepareStatement(str);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Successfully Updated!");
                clearFields();
            }
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtBarcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcodeKeyReleased
        try{
            String sql="SELECT * FROM products WHERE Barcode='" + txtBarcode.getText() + "'";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            if(rs.next())
            {
                txtDescription.setText(rs.getString("Description"));
                cboUnit.setSelectedItem(rs.getString("Unit"));
                cboCategory.setSelectedItem(rs.getString("Categories"));
                txtPrice.setText(rs.getString("Price"));
                txtStocks.setText(rs.getString("Stocks"));
            }else{
                txtDescription.setText("");
                cboUnit.setSelectedItem("");
                cboCategory.setSelectedItem("");
                txtPrice.setText("");
                txtStocks.setText("");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_txtBarcodeKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            if (txtBarcode.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Barcode filed is empty!");
            }else if (txtDescription.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Description filed is empty!");
            }else if (cboUnit.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Unit filed is empty!");
            }else if (cboCategory.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Category filed is empty!");
            }else if (txtPrice.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Price filed is empty!");
            }else if (txtStocks.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Stocks filed is empty!");
            }else{
                int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?","Delete",JOptionPane.YES_NO_OPTION);
                if (p==0){
                    String str="DELETE FROM products WHERE Barcode='" + txtBarcode.getText() + "'";
                    pst=conn.prepareStatement(str);
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"Successfully Deleted!");
                    clearFields();
                }
            }
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboCategory;
    private javax.swing.JComboBox cboUnit;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStocks;
    // End of variables declaration//GEN-END:variables
}
