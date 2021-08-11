package billing.management.system.in.java;

import java.awt.Color;
import java.sql.*;
import Connect.ConnectionProvider;
import javax.swing.JOptionPane;

public class newProduct extends javax.swing.JFrame {

    public newProduct() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        rateField = new javax.swing.JTextField();
        desField = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        idLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/New Product ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 13, 214, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/new product.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 13, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 600, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 372, 600, -1));

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/save.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 392, -1, -1));

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/Reset.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 392, -1, -1));

        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/close Jframe.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 392, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 133, 600, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Product ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 108, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Product Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 164, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Rate");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Description");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 259, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Active");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 306, -1, -1));

        nameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(153, 153, 153));
        nameField.setText("Enter Product Name");
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 161, 283, -1));

        rateField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rateField.setForeground(new java.awt.Color(153, 153, 153));
        rateField.setText("Enter Rate");
        rateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rateFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rateFieldFocusLost(evt);
            }
        });
        getContentPane().add(rateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 207, 283, -1));

        desField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        desField.setForeground(new java.awt.Color(153, 153, 153));
        desField.setText("Enter Description");
        desField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                desFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                desFieldFocusLost(evt);
            }
        });
        getContentPane().add(desField, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 256, 283, -1));

        ComboBox.setBackground(new java.awt.Color(153, 153, 153));
        ComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        getContentPane().add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 303, 283, -1));

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 51, 51));
        idLabel.setText("100");
        getContentPane().add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 104, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        setVisible(false);
        new newProduct().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        if(nameField.getText().equals("Enter Product Name")){
            nameField.setText("");
            nameField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        if(nameField.getText().equals("")){
            nameField.setText("Enter Product Name");
            nameField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_nameFieldFocusLost

    private void rateFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rateFieldFocusGained
        if(rateField.getText().equals("Enter Rate")){
            rateField.setText("");
            rateField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_rateFieldFocusGained

    private void rateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rateFieldFocusLost
        if(rateField.getText().equals("")){
            rateField.setText("Enter Rate");
            rateField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_rateFieldFocusLost

    private void desFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desFieldFocusGained
        if(desField.getText().equals("Enter Description")){
            desField.setText("");
            desField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_desFieldFocusGained

    private void desFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desFieldFocusLost
        if(desField.getText().equals("")){
            desField.setText("Enter Description");
            desField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_desFieldFocusLost

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(pId) from product");
            if(rs.first()){
                int id=rs.getInt(1);
                id=id+1;
                String str=String.valueOf(id);
                idLabel.setText(str);
            }else{
                idLabel.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String pId=idLabel.getText();
        String pdname=nameField.getText();
        String rate=rateField.getText();
        String des=desField.getText();
        String active=(String)ComboBox.getSelectedItem();
        
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into product values('"+pId+"','"+pdname+"','"+rate+"','"+des+"','"+active+"')");
            JOptionPane.showMessageDialog(null,"Succesfully Updated");
            setVisible(false);
            new newProduct().setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField desField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField rateField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
