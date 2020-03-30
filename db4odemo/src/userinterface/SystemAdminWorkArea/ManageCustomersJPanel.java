/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    public CustomerDirectory customerDirectory;
    public JPanel container;
    public EcoSystem system;

    public ManageCustomersJPanel(JPanel userProcessContainer, EcoSystem system, CustomerDirectory customerDirectory) {
        initComponents();
        this.customerDirectory = customerDirectory;
        this.container = userProcessContainer;
        this.system = system;
        populate();
    }

    public void populate() {
        DefaultTableModel model = (DefaultTableModel) customerJTable.getModel();

        model.setRowCount(0);
        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            for (Customer customer : customerDirectory.getCustomerDirectory()) {
                if (customer.getCustomerId().equalsIgnoreCase(ua.getEmployee().getName())) {
                    Object[] row = new Object[5];
                    row[0] = customer.getCustomerId();
                    row[1] = customer.getName();
                    row[2] = customer.getPhoneNo();
                    row[3] = customer.getAddress();
                    row[4] = ua.getUsername();
                    model.addRow(row);
                }
            }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        customerJTable = new javax.swing.JTable();
        viewCustomer = new javax.swing.JButton();
        deleteCustomer = new javax.swing.JButton();
        addCustomerBtn = new javax.swing.JButton();
        viewCustomerOrdersBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Customers");

        customerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Id", "Name", "Contact No", "Address", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerJTable);

        viewCustomer.setText("View Customer");
        viewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerActionPerformed(evt);
            }
        });

        deleteCustomer.setText("Delete Customer");
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });

        addCustomerBtn.setText("Add Customer");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        viewCustomerOrdersBtn.setText("View Customer Orders");
        viewCustomerOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerOrdersBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(463, 463, 463)
                        .addComponent(jLabel1)
                        .addGap(0, 492, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(addCustomerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewCustomerOrdersBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerBtn)
                    .addComponent(viewCustomer)
                    .addComponent(viewCustomerOrdersBtn)
                    .addComponent(deleteCustomer))
                .addContainerGap(483, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerJTable.getSelectedRow();
        int count = customerJTable.getSelectedRowCount();
        if(count == 1){
            if (selectedRow >= 0) {
            CardLayout layout = (CardLayout) container.getLayout();
            Customer customer = customerDirectory.getCustomerId(selectedRow);
            ViewCustomersJPanel viewCustomersJPanel = new ViewCustomersJPanel(container, customer, customerDirectory);
            container.add(viewCustomersJPanel);
            layout.next(container);
        }
        }
         else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_viewCustomerActionPerformed

    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerJTable.getSelectedRow();
            if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                customerDirectory.deleteCustomer(selectedRow,system);
                populate();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteCustomerActionPerformed

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        CreateCustomersJPanel createCustomersJPanel = new CreateCustomersJPanel(container, system, customerDirectory);
        container.add(createCustomersJPanel);
        layout.next(container);
    }//GEN-LAST:event_addCustomerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewCustomerOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerOrdersBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCustomerOrdersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable customerJTable;
    private javax.swing.JButton deleteCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewCustomer;
    private javax.swing.JButton viewCustomerOrdersBtn;
    // End of variables declaration//GEN-END:variables
}
