package billing.management.system.in.java;

import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    public int z = 0;

    public home() {
        initComponents();
        newBuyerBtn.setVisible(false);
        updateBuyerBtn.setVisible(false);
        buyerDetailsBtn.setVisible(false);
        deleteBuyerBtn.setVisible(false);
        newProductBtn.setVisible(false);
        updateProductBtn.setVisible(false);
        productDetailsBtn.setVisible(false);
        delProductBtn.setVisible(false);
        billsBtn.setVisible(false);
        logoutBtn.setVisible(false);
        closeBtn.setVisible(false);
        /*-------------------------------*/
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arrowBtn = new javax.swing.JButton();
        newBuyerBtn = new javax.swing.JButton();
        updateBuyerBtn = new javax.swing.JButton();
        buyerDetailsBtn = new javax.swing.JButton();
        deleteBuyerBtn = new javax.swing.JButton();
        newProductBtn = new javax.swing.JButton();
        updateProductBtn = new javax.swing.JButton();
        productDetailsBtn = new javax.swing.JButton();
        delProductBtn = new javax.swing.JButton();
        billsBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arrowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/control hide and show.png"))); // NOI18N
        arrowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrowBtnMouseClicked(evt);
            }
        });
        getContentPane().add(arrowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        newBuyerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/new buyer.png"))); // NOI18N
        newBuyerBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                newBuyerBtnComponentShown(evt);
            }
        });
        newBuyerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBuyerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newBuyerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 11, -1, -1));

        updateBuyerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/Update buyer.png"))); // NOI18N
        updateBuyerBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updateBuyerBtnComponentShown(evt);
            }
        });
        updateBuyerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBuyerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBuyerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 11, -1, -1));

        buyerDetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/buyer Details.png"))); // NOI18N
        buyerDetailsBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                buyerDetailsBtnComponentShown(evt);
            }
        });
        buyerDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerDetailsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buyerDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 11, -1, -1));

        deleteBuyerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/delete buyer.png"))); // NOI18N
        deleteBuyerBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                deleteBuyerBtnComponentShown(evt);
            }
        });
        deleteBuyerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBuyerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBuyerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 11, -1, -1));

        newProductBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/new product.png"))); // NOI18N
        newProductBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                newProductBtnComponentShown(evt);
            }
        });
        newProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProductBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 11, -1, -1));

        updateProductBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/update product.png"))); // NOI18N
        updateProductBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updateProductBtnComponentShown(evt);
            }
        });
        updateProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 11, -1, -1));

        productDetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/details product.png"))); // NOI18N
        productDetailsBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                productDetailsBtnComponentShown(evt);
            }
        });
        productDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productDetailsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(productDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 11, -1, -1));

        delProductBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/delete product.png"))); // NOI18N
        delProductBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                delProductBtnComponentShown(evt);
            }
        });
        delProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delProductBtnActionPerformed(evt);
            }
        });
        getContentPane().add(delProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 11, -1, -1));

        billsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/billing.png"))); // NOI18N
        billsBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                billsBtnComponentShown(evt);
            }
        });
        billsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(billsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 11, -1, -1));

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/logout.png"))); // NOI18N
        logoutBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                logoutBtnComponentShown(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 11, -1, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/Close.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1231, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Buyer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 98, 92, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update Buyer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 98, 92, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buyer Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 98, 92, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Delete Buyer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 98, 92, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("New Product");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 98, 92, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Update Product");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 98, 92, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Product Details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 98, 92, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Delete Product");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 98, 92, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Billing");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 98, 92, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Logout");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 98, 92, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Close Application");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 100, 120, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/in/java/img/home.PNG"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really  want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void arrowBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrowBtnMouseClicked
        if (z == 0) {
            try {
                Thread.sleep(150);
                newBuyerBtn.setVisible(true);
                jLabel1.setVisible(true);
            } catch (Exception e) {

            }
        } else {
            newBuyerBtn.setVisible(false);
            updateBuyerBtn.setVisible(false);
            buyerDetailsBtn.setVisible(false);
            deleteBuyerBtn.setVisible(false);
            newProductBtn.setVisible(false);
            updateProductBtn.setVisible(false);
            productDetailsBtn.setVisible(false);
            delProductBtn.setVisible(false);
            billsBtn.setVisible(false);
            logoutBtn.setVisible(false);
            closeBtn.setVisible(false);
            /*-------------------------------*/
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            z = 0;
        }
    }//GEN-LAST:event_arrowBtnMouseClicked

    private void newBuyerBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_newBuyerBtnComponentShown
        try {
            Thread.sleep(150);
            updateBuyerBtn.setVisible(true);
            jLabel2.setVisible(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_newBuyerBtnComponentShown

    private void updateBuyerBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updateBuyerBtnComponentShown
        try {
            Thread.sleep(150);
            buyerDetailsBtn.setVisible(true);
            jLabel3.setVisible(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_updateBuyerBtnComponentShown

    private void buyerDetailsBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_buyerDetailsBtnComponentShown
        try {
            Thread.sleep(150);
            deleteBuyerBtn.setVisible(true);
            jLabel4.setVisible(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_buyerDetailsBtnComponentShown

    private void deleteBuyerBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deleteBuyerBtnComponentShown
        try {
            Thread.sleep(150);
            newProductBtn.setVisible(true);
            jLabel5.setVisible(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_deleteBuyerBtnComponentShown

    private void newProductBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_newProductBtnComponentShown
        try {
            Thread.sleep(150);
            updateProductBtn.setVisible(true);
            jLabel6.setVisible(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_newProductBtnComponentShown

    private void updateProductBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updateProductBtnComponentShown
        try {
            Thread.sleep(150);
            productDetailsBtn.setVisible(true);
            jLabel7.setVisible(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_updateProductBtnComponentShown

    private void productDetailsBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_productDetailsBtnComponentShown
        try {
            Thread.sleep(150);
            delProductBtn.setVisible(true);
            jLabel8.setVisible(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_productDetailsBtnComponentShown

    private void delProductBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_delProductBtnComponentShown
        try {
            Thread.sleep(150);
            billsBtn.setVisible(true);
            jLabel9.setVisible(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_delProductBtnComponentShown

    private void billsBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_billsBtnComponentShown
        try {
            Thread.sleep(150);
            logoutBtn.setVisible(true);
            jLabel10.setVisible(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_billsBtnComponentShown

    private void logoutBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_logoutBtnComponentShown
        try {
            Thread.sleep(150);
            closeBtn.setVisible(true);
            jLabel11.setVisible(true);
            z=1;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_logoutBtnComponentShown

    private void newBuyerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBuyerBtnActionPerformed
        new newBuyer().setVisible(true);
    }//GEN-LAST:event_newBuyerBtnActionPerformed

    private void updateBuyerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBuyerBtnActionPerformed
        new updateBuyer().setVisible(true);
    }//GEN-LAST:event_updateBuyerBtnActionPerformed

    private void buyerDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerDetailsBtnActionPerformed
        new buyersDetails().setVisible(true);
    }//GEN-LAST:event_buyerDetailsBtnActionPerformed

    private void deleteBuyerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBuyerBtnActionPerformed
        new deleteBuyer().setVisible(true);
    }//GEN-LAST:event_deleteBuyerBtnActionPerformed

    private void newProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProductBtnActionPerformed
        new newProduct().setVisible(true);
    }//GEN-LAST:event_newProductBtnActionPerformed

    private void updateProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductBtnActionPerformed
        new updateProduct().setVisible(true);
    }//GEN-LAST:event_updateProductBtnActionPerformed

    private void productDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productDetailsBtnActionPerformed
        new productDetails().setVisible(true);
    }//GEN-LAST:event_productDetailsBtnActionPerformed

    private void delProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delProductBtnActionPerformed
        new deleteProduct().setVisible(true);
    }//GEN-LAST:event_delProductBtnActionPerformed

    private void billsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsBtnActionPerformed
        new billing().setVisible(true);
    }//GEN-LAST:event_billsBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arrowBtn;
    private javax.swing.JButton billsBtn;
    private javax.swing.JButton buyerDetailsBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton delProductBtn;
    private javax.swing.JButton deleteBuyerBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton newBuyerBtn;
    private javax.swing.JButton newProductBtn;
    private javax.swing.JButton productDetailsBtn;
    private javax.swing.JButton updateBuyerBtn;
    private javax.swing.JButton updateProductBtn;
    // End of variables declaration//GEN-END:variables
}
