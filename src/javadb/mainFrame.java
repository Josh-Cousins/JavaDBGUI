/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadb;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;

/**
 *
 * @author Josh
 */
public class mainFrame extends javax.swing.JFrame {

    public static final int UPDATE_PRODUCT = 1;
    public static final int UPDATE_MAN = 2;
    public static final int DELETE_PRODUCT = 3;
    public static final int DELETE_MAN = 4;
    public static final int ADD_PRODUCT = 5;
    public static final int ADD_MAN = 6;
    public int mode = 0;
    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        //Initial setup
        lstMan.setEnabled(false);
        txfManID.setEnabled(false);
        txfProdID.setEnabled(false);
        txfManName.setEnabled(false);
        toggleButtons(false, 3);
        toggleTxfs(false);
    }
    
    //Sets up the UI for working with products or manufacturers
    public void toggleManOrProd(boolean activeProduct){
        if (activeProduct) {
            lstProducts.setEnabled(true);
            lstMan.setEnabled(false);
        }
        else{
            lstProducts.setEnabled(false);
            lstMan.setEnabled(true);
        }
    }
    
    //Toggles manufacturer or product buttons or both (Enable/disable)
    //1 - product buttons | 2 - man buttons | 3 - both
    public void toggleButtons(boolean toggle, int mode){
        switch(mode){
            case 1:
                btnAddProd.setEnabled(toggle);
                btnDeleteProd.setEnabled(toggle);
                btnUpdateProd.setEnabled(toggle);
                break;
            case 2:
                btnAddMan.setEnabled(toggle);
                btnDeleteMan.setEnabled(toggle);
                btnUpdateMan.setEnabled(toggle);
                break;
            case 3:
                btnAddProd.setEnabled(toggle);
                btnDeleteProd.setEnabled(toggle);
                btnUpdateProd.setEnabled(toggle);
                btnAddMan.setEnabled(toggle);
                btnDeleteMan.setEnabled(toggle);
                btnUpdateMan.setEnabled(toggle);
                break;
        }
    }
    
    //Method to toggle editable text fields
    public void toggleTxfs(boolean toggle){
        txfProdName.setEnabled(toggle);
        spnPrice.setEnabled(toggle);
        spnStock.setEnabled(toggle);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        JavaDBPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("JavaDBPU").createEntityManager();
        productsQuery = java.beans.Beans.isDesignTime() ? null : JavaDBPUEntityManager.createQuery("SELECT p FROM Products p");
        productsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : productsQuery.getResultList();
        manufacturersQuery = java.beans.Beans.isDesignTime() ? null : JavaDBPUEntityManager.createQuery("SELECT m FROM Manufacturers m");
        manufacturersList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : manufacturersQuery.getResultList();
        scrlpnMain = new javax.swing.JScrollPane();
        lstProducts = new javax.swing.JList<>();
        pnlData = new javax.swing.JPanel();
        lblProdID = new javax.swing.JLabel();
        lblProdName = new javax.swing.JLabel();
        lblProdPrice = new javax.swing.JLabel();
        lblProdStock = new javax.swing.JLabel();
        lblManName = new javax.swing.JLabel();
        lblManID = new javax.swing.JLabel();
        txfProdID = new javax.swing.JTextField();
        txfProdName = new javax.swing.JTextField();
        txfManName = new javax.swing.JTextField();
        txfManID = new javax.swing.JTextField();
        spnPrice = new javax.swing.JSpinner();
        spnStock = new javax.swing.JSpinner();
        scrlpnMans = new javax.swing.JScrollPane();
        lstMan = new javax.swing.JList<>();
        pnlButtons = new javax.swing.JPanel();
        btnUpdateProd = new javax.swing.JButton();
        btnUpdateMan = new javax.swing.JButton();
        btnDeleteProd = new javax.swing.JButton();
        btnDeleteMan = new javax.swing.JButton();
        btnAddProd = new javax.swing.JButton();
        btnAddMan = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Manager");

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, productsList, lstProducts);
        bindingGroup.addBinding(jListBinding);

        lstProducts.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductsValueChanged(evt);
            }
        });
        scrlpnMain.setViewportView(lstProducts);

        lblProdID.setForeground(new java.awt.Color(204, 51, 0));
        lblProdID.setText("ID");

        lblProdName.setForeground(new java.awt.Color(204, 51, 0));
        lblProdName.setText("Name");

        lblProdPrice.setForeground(new java.awt.Color(204, 51, 0));
        lblProdPrice.setText("Price");

        lblProdStock.setForeground(new java.awt.Color(204, 51, 0));
        lblProdStock.setText("Stock");

        lblManName.setForeground(new java.awt.Color(51, 204, 0));
        lblManName.setText("Manufacturer");

        lblManID.setForeground(new java.awt.Color(51, 204, 0));
        lblManID.setText("Manufacturer ID");

        txfProdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfProdIDActionPerformed(evt);
            }
        });

        spnPrice.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        spnStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(pnlData);
        pnlData.setLayout(pnlDataLayout);
        pnlDataLayout.setHorizontalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProdName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProdPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProdStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblManName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProdID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblManID))
                .addGap(18, 18, 18)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfProdID)
                    .addComponent(txfProdName)
                    .addComponent(txfManName)
                    .addComponent(txfManID, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(spnPrice)
                    .addComponent(spnStock))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDataLayout.setVerticalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdID)
                    .addComponent(txfProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdName)
                    .addComponent(txfProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdPrice)
                    .addComponent(spnPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdStock)
                    .addComponent(spnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManName)
                    .addComponent(txfManName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManID)
                    .addComponent(txfManID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, manufacturersList, lstMan);
        bindingGroup.addBinding(jListBinding);

        lstMan.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstManValueChanged(evt);
            }
        });
        scrlpnMans.setViewportView(lstMan);

        btnUpdateProd.setText("Update Product");
        btnUpdateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProdActionPerformed(evt);
            }
        });

        btnUpdateMan.setText("Update Manufacturer");
        btnUpdateMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateManActionPerformed(evt);
            }
        });

        btnDeleteProd.setText("Delete Product");
        btnDeleteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProdActionPerformed(evt);
            }
        });

        btnDeleteMan.setText("Delete Manufacturer");
        btnDeleteMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteManActionPerformed(evt);
            }
        });

        btnAddProd.setText("Add Product");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        btnAddMan.setText("Add Manufacturer");
        btnAddMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlButtonsLayout.createSequentialGroup()
                        .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateProd)
                    .addComponent(btnUpdateMan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteProd)
                    .addComponent(btnDeleteMan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProd)
                    .addComponent(btnAddMan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnConfirm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrlpnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrlpnMans)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrlpnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrlpnMans, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Updates the info on the gui when the value is changed - products only
    private void lstProductsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductsValueChanged
        //If there is something selected we update the GUI
        if (lstProducts.getSelectedIndex()>-1) {
            Products selected = productsList.get(lstProducts.getSelectedIndex());
            txfProdName.setText(selected.getProductname());
            spnPrice.setValue(selected.getProductprice());
            txfProdID.setText(selected.getProductid()+"");
            spnStock.setValue(selected.getProductstock());
            //Links the Manufacturers list to the products lis
            Manufacturers partner = selected.getManid();
            for (int i = 0; i < manufacturersList.size(); i++) {
                if (manufacturersList.get(i).getManid()==partner.getManid()) {
                lstMan.setSelectedIndex(i);
                }
            }
            toggleButtons(true, 3);
            btnClear.setEnabled(true);
        }
        //If there was an update and nothing is selected we disable the edit buttons
        else{
            toggleButtons(false, 1);
            btnClear.setEnabled(false);
        }
    }//GEN-LAST:event_lstProductsValueChanged
    
    //Updates info on the GUI - Manufacturers only
    private void lstManValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstManValueChanged
        if (lstMan.getSelectedIndex()>-1) {
            Manufacturers selected = manufacturersList.get(lstMan.getSelectedIndex());
            txfManID.setText(selected.getManid()+"");
            txfManName.setText(selected.getManname());
            if (lstProducts.getSelectedIndex()>-1) {
                toggleButtons(false, 1);
            }
            else{
                toggleButtons(true, 1);
            }
        }
    }//GEN-LAST:event_lstManValueChanged

    private void btnUpdateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProdActionPerformed
        mode = UPDATE_PRODUCT;
        toggleManOrProd(true);
        toggleButtons(false, 2);
        toggleTxfs(rootPaneCheckingEnabled);
        btnAddProd.setEnabled(false);
        btnDeleteProd.setEnabled(false);
        lstProducts.setEnabled(false);
    }//GEN-LAST:event_btnUpdateProdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        lstProducts.clearSelection();
        lstMan.clearSelection();
        txfManID.setText("");
        txfManName.setText("");
        txfProdID.setText("");
        txfProdName.setText("");
        spnPrice.setValue(0);
        spnStock.setValue(0);
        toggleButtons(false, 3);
        toggleTxfs(false);
        toggleManOrProd(true);
        txfManName.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        ArrayList<Object> params = new ArrayList<>();
        switch(mode){
            case UPDATE_PRODUCT:
                System.out.println("product updated");
                break;
            case UPDATE_MAN:
                //0 - newName | 1 - manID
                params.add(txfManName.getText());
                params.add(txfManID.getText());
                dbMethods.updateDB(UPDATE_MAN, params);
                break;
            case DELETE_PRODUCT:
                System.out.println("product deleted");
                break;
            case DELETE_MAN:
                System.out.println("man deleted");
                break;
            case ADD_PRODUCT:
                System.out.println("product added");
                break;
            case ADD_MAN:
                System.out.println("man added");
                break;
        }
        manufacturersList = manufacturersQuery.getResultList();
        Vector<String> manNames = new Vector();
        for (Manufacturers m : manufacturersList) {
            manNames.add(m.toString());
        }
        lstMan.setListData(manNames);
        lstMan.updateUI();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int close = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?");
        if (close==JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnUpdateManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateManActionPerformed
        mode = UPDATE_MAN;
        toggleManOrProd(false);
        toggleButtons(false, 1);
        toggleButtons(false, 2);
        btnUpdateMan.setEnabled(true);
        txfManName.setEnabled(true);
    }//GEN-LAST:event_btnUpdateManActionPerformed

    private void btnDeleteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProdActionPerformed
        mode = DELETE_PRODUCT;
    }//GEN-LAST:event_btnDeleteProdActionPerformed

    private void btnDeleteManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteManActionPerformed
        mode = DELETE_MAN;
    }//GEN-LAST:event_btnDeleteManActionPerformed

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
        mode = ADD_PRODUCT;
    }//GEN-LAST:event_btnAddProdActionPerformed

    private void btnAddManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManActionPerformed
        mode = ADD_MAN;
    }//GEN-LAST:event_btnAddManActionPerformed

    private void txfProdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfProdIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfProdIDActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    
    //A way to get data from the gui in other classes
    public int getManID(){
        int manID = Integer.parseInt(txfManID.getText());
        return manID;
    }
    public int getProdID(){
        int prodID = Integer.parseInt(txfProdID.getText());
        return prodID;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager JavaDBPUEntityManager;
    private javax.swing.JButton btnAddMan;
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDeleteMan;
    private javax.swing.JButton btnDeleteProd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdateMan;
    private javax.swing.JButton btnUpdateProd;
    private javax.swing.JLabel lblManID;
    private javax.swing.JLabel lblManName;
    private javax.swing.JLabel lblProdID;
    private javax.swing.JLabel lblProdName;
    private javax.swing.JLabel lblProdPrice;
    private javax.swing.JLabel lblProdStock;
    private javax.swing.JList<String> lstMan;
    private javax.swing.JList<String> lstProducts;
    private java.util.List<javadb.Manufacturers> manufacturersList;
    private javax.persistence.Query manufacturersQuery;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlData;
    private java.util.List<javadb.Products> productsList;
    private javax.persistence.Query productsQuery;
    private javax.swing.JScrollPane scrlpnMain;
    private javax.swing.JScrollPane scrlpnMans;
    private javax.swing.JSpinner spnPrice;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTextField txfManID;
    private javax.swing.JTextField txfManName;
    private javax.swing.JTextField txfProdID;
    private javax.swing.JTextField txfProdName;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    
}
