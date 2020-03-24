/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.PurchaseInvoiceDAO;
import helper.DateHelper;
import helper.DialogHelper;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.PurchaseInvoice;

/**
 *
 * @author longd
 */
public class FindHistoryJInternalFrame extends javax.swing.JDialog {

    PurchaseInvoiceDAO dao = new PurchaseInvoiceDAO();

    /**
     * Creates new form FindHistoryJInternalFrame
     */
    public FindHistoryJInternalFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();
        lblInvoiceID = new javax.swing.JLabel();
        txtInvoiceID = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblImportDate = new javax.swing.JLabel();
        txtImportDate = new javax.swing.JTextField();
        lblDebit = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        txtDebit = new javax.swing.JTextField();
        lblCash = new javax.swing.JLabel();
        lblRemain = new javax.swing.JLabel();
        txtRemain = new javax.swing.JTextField();
        lblSupplierID = new javax.swing.JLabel();
        txtSupplierID = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtStatus = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Number", "DrugID", "Batch No", "MFG", "EXP", "Quantity", "Purchase Price", "Sale Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGridView);

        lblInvoiceID.setText("Purchase Invoice ID");

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        txtID.setEditable(false);

        lblID.setText("InvoiceID");

        lblImportDate.setText("Import Date");

        txtImportDate.setEditable(false);

        lblDebit.setText("Debit");

        txtCash.setEditable(false);

        txtDebit.setEditable(false);

        lblCash.setText("Cash");

        lblRemain.setText("Remain Price");

        txtRemain.setEditable(false);

        lblSupplierID.setText("Supplier ID");

        txtSupplierID.setEditable(false);

        lblEmployeeID.setText("Employee ID:");

        lblStatus.setText("Status");

        txtStatus.setEditable(false);
        txtStatus.setColumns(20);
        txtStatus.setLineWrap(true);
        txtStatus.setRows(5);
        txtStatus.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtStatus);

        btnDelete.setText("Delete Invoice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblInvoiceID)
                .addGap(18, 18, 18)
                .addComponent(txtInvoiceID, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblID))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSupplierID)
                            .addComponent(lblImportDate))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStatus)))
                    .addComponent(txtImportDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCash)
                        .addGap(18, 18, 18)
                        .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(lblDebit)
                        .addGap(18, 18, 18)
                        .addComponent(txtDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRemain)
                        .addGap(18, 18, 18)
                        .addComponent(txtRemain, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblInvoiceID)
                        .addComponent(txtInvoiceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEmployeeID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID)
                            .addComponent(lblDebit)
                            .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDebit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCash)
                            .addComponent(lblStatus))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRemain)
                            .addComponent(txtRemain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSupplierID)
                                    .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtImportDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImportDate)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        this.find();
    }//GEN-LAST:event_btnFindActionPerformed

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
            java.util.logging.Logger.getLogger(FindHistoryJInternalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindHistoryJInternalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindHistoryJInternalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindHistoryJInternalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FindHistoryJInternalFrame dialog = new FindHistoryJInternalFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCash;
    private javax.swing.JLabel lblDebit;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImportDate;
    private javax.swing.JLabel lblInvoiceID;
    private javax.swing.JLabel lblRemain;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSupplierID;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtDebit;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtImportDate;
    private javax.swing.JTextField txtInvoiceID;
    private javax.swing.JTextField txtRemain;
    private javax.swing.JTextArea txtStatus;
    private javax.swing.JTextField txtSupplierID;
    // End of variables declaration//GEN-END:variables

    void find() {
        String purchaseInvoiceID = txtInvoiceID.getText().trim();
        try {
            List<PurchaseInvoice> list = dao.findById(purchaseInvoiceID);
            if (list.size() > 0) {
                lblEmployeeID.setText("EmployeeID: " + list.get(0).getEmployeeID());
                txtID.setText(purchaseInvoiceID);
                txtSupplierID.setText(list.get(0).getSupplierID());
                txtImportDate.setText(DateHelper.toString(list.get(0).getPurchaseDate()));
                txtStatus.setText(list.get(0).getStatus());
                txtCash.setText(String.valueOf(list.get(0).getPurchaseByCash()));
                txtDebit.setText(String.valueOf(list.get(0).getPurchaseByCredit()));
                txtRemain.setText(String.valueOf(list.get(0).getRemainMoney()));
                this.fillToTable(list);
            } else {
                DialogHelper.alert(this, "Can not find this Invoice");
                txtInvoiceID.setText("");
                txtInvoiceID.requestFocus();
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Can not find this Invoice");
            txtInvoiceID.setText("");
            txtInvoiceID.requestFocus();
        }
    }

    void fillToTable(List<PurchaseInvoice> list) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblGridView.getModel();
        defaultTableModel.setRowCount(0);
        for (PurchaseInvoice model : list) {
            Object[] row = {
                model.getNumber(),
                model.getDrugID(),
                model.getBatchNo(),
                model.getMfg(),
                model.getExp(),
                model.getQuantity(),
                model.getPurchasePrice(),
                model.getSalePrice(),
                model.getDrugStatus()
            };
            defaultTableModel.addRow(row);
        }
    }
}
