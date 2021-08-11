
package billing.management.system.in.java;

import java.sql.*;
import Connect.ConnectionProvider;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class billing extends javax.swing.JFrame {
    public int finalTotal=0;
    public billing() {
        initComponents();
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        dateLabel.setText(dFormat.format(date));
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        timeLabel.setText(dtf.format(now));        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buyerNameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        buyerContactField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buyerEmailField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        buyerAddressField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pIdField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pNameField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rateField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        quanField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        desField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        paidField = new javax.swing.JTextField();
        returnField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1164, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/billing frame.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/Billing ani.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 13, 256, 86));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 24, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Time:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 59, -1, -1));

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 24, -1, -1));

        timeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 59, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, 1164, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Buyer Details:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 125, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 168, -1, -1));

        buyerNameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buyerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(buyerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 165, 180, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Contact No");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 168, -1, -1));

        buyerContactField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buyerContactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerContactFieldActionPerformed(evt);
            }
        });
        getContentPane().add(buyerContactField, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 165, 180, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 168, -1, -1));

        buyerEmailField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buyerEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerEmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(buyerEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 165, 226, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 168, -1, -1));

        buyerAddressField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buyerAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerAddressFieldActionPerformed(evt);
            }
        });
        getContentPane().add(buyerAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 165, 243, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 206, 1164, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Product Details");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 223, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Product ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 266, -1, -1));

        pIdField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pIdFieldActionPerformed(evt);
            }
        });
        getContentPane().add(pIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 263, 70, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Product Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 266, -1, -1));

        pNameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 263, 187, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Rate");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 266, -1, -1));

        rateField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(rateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 263, 70, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Quantity");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 266, -1, -1));

        quanField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(quanField, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 263, 39, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Description");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 266, -1, -1));

        desField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(desField, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 263, 300, -1));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/add.png"))); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 299, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 335, 1164, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Rate", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 352, 671, 185));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Calculation Details:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 352, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Total");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 408, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Paid Amount");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 461, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Return Amount");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 514, -1, -1));

        totalField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 405, 200, -1));

        paidField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paidField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidFieldActionPerformed(evt);
            }
        });
        getContentPane().add(paidField, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 458, 200, -1));

        returnField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(returnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 511, 200, -1));

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/save.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        saveBtn.setMaximumSize(new java.awt.Dimension(95, 29));
        saveBtn.setMinimumSize(new java.awt.Dimension(95, 29));
        saveBtn.setPreferredSize(new java.awt.Dimension(95, 29));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1052, 402, 100, 29));

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/Reset.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1052, 455, 100, 29));

        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/close Jframe.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1052, 508, 100, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/billing background.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void buyerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerNameFieldActionPerformed
        String name=buyerNameField.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from buyer where name like '"+name+"%'");
            if(rs.next()){
                buyerNameField.setText(rs.getString(1));
                buyerContactField.setText(rs.getString(2));
                buyerEmailField.setText(rs.getString(3));
                buyerAddressField.setText(rs.getString(4));
            }else{
                buyerContactField.setText("");
                buyerEmailField.setText("");
                buyerAddressField.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buyerNameFieldActionPerformed

    private void buyerContactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerContactFieldActionPerformed
        String contact=buyerContactField.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from buyer where contactNo like '"+contact+"%'");
            if(rs.next()){
                buyerNameField.setText(rs.getString(1));
                buyerContactField.setText(rs.getString(2));
                buyerEmailField.setText(rs.getString(3));
                buyerAddressField.setText(rs.getString(4));
            }else{
                buyerNameField.setText("");
                buyerEmailField.setText("");
                buyerAddressField.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buyerContactFieldActionPerformed

    private void buyerEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerEmailFieldActionPerformed
        String email=buyerEmailField.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from buyer where email like '"+email+"%'");
            if(rs.next()){
                buyerNameField.setText(rs.getString(1));
                buyerContactField.setText(rs.getString(2));
                buyerEmailField.setText(rs.getString(3));
                buyerAddressField.setText(rs.getString(4));
            }else{
                buyerNameField.setText("");
                buyerContactField.setText("");
                buyerAddressField.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buyerEmailFieldActionPerformed

    private void buyerAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerAddressFieldActionPerformed
        String addr=buyerAddressField.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from buyer where address like '"+addr+"%'");
            if(rs.next()){
                buyerNameField.setText(rs.getString(1));
                buyerContactField.setText(rs.getString(2));
                buyerEmailField.setText(rs.getString(3));
                buyerAddressField.setText(rs.getString(4));
            }else{
                buyerNameField.setText("");
                buyerContactField.setText("");
                buyerEmailField.setText("");                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buyerAddressFieldActionPerformed

    private void pIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pIdFieldActionPerformed
        String pId=pIdField.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from product where pId like '"+pId+"%'");
            if(rs.next()){
                pIdField.setText(rs.getString(1));
                pNameField.setText(rs.getString(2));
                rateField.setText(rs.getString(3));
                quanField.setText("1");
                desField.setText(rs.getString(4));
            }else{
                pNameField.setText("");
                rateField.setText("");
                quanField.setText("");
                desField.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_pIdFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String name=buyerNameField.getText();    
        String contactNo=buyerContactField.getText();
        String email=buyerEmailField.getText();
        String address=buyerAddressField.getText();
        String path="D:\\00-ClassProject2021\\Java Project";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+""+dateLabel.getText()+""+timeLabel.getText()+".pdf"));
            doc.open();
            Paragraph paragraph=new Paragraph("                                            Hiro (Billing Management System)\n                                            Contact Number:(+66)0123456789\n\n");
            doc.add(paragraph);
            Paragraph paragraph2=new Paragraph("Date & Time:"+dateLabel.getText()+""+timeLabel.getText()+"\nBuyer Details:\nName:"+name+"\nContact No:"+contactNo+"\nEmail:"+email+"\nAddress:"+address+"\n\n");
            doc.add(paragraph2);
            PdfPTable tb1=new PdfPTable(5);
            tb1.addCell("Name");
            tb1.addCell("Description");
            tb1.addCell("Rate");
            tb1.addCell("Quantity");
            tb1.addCell("Sub Total");
            for(int i=0;i<jTable1.getRowCount();i++){
                String n=jTable1.getValueAt(i, 0).toString();
                String d=jTable1.getValueAt(i, 1).toString();
                String r=jTable1.getValueAt(i, 2).toString();
                String g=jTable1.getValueAt(i, 3).toString();
                String s=jTable1.getValueAt(i, 4).toString();
                tb1.addCell(n);
                tb1.addCell(d);
                tb1.addCell(r);
                tb1.addCell(g);
                tb1.addCell(s);
            }
            doc.add(tb1);
            Paragraph paragraph3=new Paragraph("\nTotal"+totalField.getText()+"\nPaid Amout"+paidField.getText()+"\nReturn Amount"+returnField.getText()+"\n\nThankyou for Vising !Please Come Again. \nHiro");
            doc.add(paragraph3);
            JOptionPane.showMessageDialog(null, "Bill Generated");
            setVisible(false);
            new billing().setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            doc.close();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int price=Integer.parseInt(rateField.getText());
        int quantity=Integer.parseInt(quanField.getText());
        int total=price*quantity;
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{pNameField.getText(),desField.getText(),price,quantity,total});
        finalTotal=finalTotal+total;
        String finalTotal1=String.valueOf(finalTotal);
        totalField.setText(finalTotal1);
        pIdField.setText("");
        pNameField.setText("");
        rateField.setText("");
        quanField.setText("");
        desField.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void paidFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidFieldActionPerformed
        String paidAmout=paidField.getText();
        int z=Integer.parseInt(paidAmout);
        finalTotal=z-finalTotal;
        String finalTotal1=String.valueOf(finalTotal);
        returnField.setText(finalTotal1);
        returnField.setEditable(false);
    }//GEN-LAST:event_paidFieldActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        setVisible(false);
        new billing().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField buyerAddressField;
    private javax.swing.JTextField buyerContactField;
    private javax.swing.JTextField buyerEmailField;
    private javax.swing.JTextField buyerNameField;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField desField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pIdField;
    private javax.swing.JTextField pNameField;
    private javax.swing.JTextField paidField;
    private javax.swing.JTextField quanField;
    private javax.swing.JTextField rateField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField returnField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}
