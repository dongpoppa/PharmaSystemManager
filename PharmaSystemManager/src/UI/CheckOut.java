/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import helper.DialogHelper;
import helper.ShareHelper;
import javax.swing.JFrame;

/**
 *
 * @author Long
 */
public class CheckOut extends javax.swing.JDialog {

    boolean check = false;

    /**
     * Creates new form ConfirmDeleteHelper
     */
    public CheckOut(JFrame parent, boolean modal, double total) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtTotal.setText(String.valueOf(total));
        lblTerm.setEnabled(true);
        cboTerm.setEnabled(true);
    }

    public CheckOut(JFrame parent, boolean modal, double total, boolean b) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtTotal.setText(String.valueOf(total));
        check = b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPassword = new javax.swing.JLabel();
        lblReason = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();
        txtCash = new javax.swing.JTextField();
        txtDebit = new javax.swing.JTextField();
        cboTerm = new javax.swing.JComboBox();
        lblTerm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);

        lblPassword.setText("CASH");

        lblReason.setText("DEBIT");

        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick.png"))); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancle.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel1.setText("TOTAL");

        txtTotal.setEditable(false);
        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("VND #,##0"))));
        txtTotal.setEnabled(false);

        txtCash.setText("0");
        txtCash.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCashFocusLost(evt);
            }
        });

        txtDebit.setText("0");
        txtDebit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDebitFocusLost(evt);
            }
        });

        cboTerm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6 months", "12 months", "18 months", "24 months", "30 months", "36 months" }));
        cboTerm.setEnabled(false);

        lblTerm.setText("TERM");
        lblTerm.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConfirm)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblReason, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTerm, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCash)
                            .addComponent(txtTotal)
                            .addComponent(txtDebit, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(cboTerm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblPassword)
                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReason))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTerm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.cancel();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        this.confirm();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtCashFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtCashFocusLost
    {//GEN-HEADEREND:event_txtCashFocusLost
        //        
    }//GEN-LAST:event_txtCashFocusLost

    private void txtDebitFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtDebitFocusLost
    {//GEN-HEADEREND:event_txtDebitFocusLost
        //
    }//GEN-LAST:event_txtDebitFocusLost

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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox cboTerm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblTerm;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtDebit;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    void confirm() {
        if (DialogHelper.confirm(this, "Are you sure?")) {

            try {
                ShareHelper.total = Double.valueOf(txtTotal.getText());
                ShareHelper.cash = Double.valueOf(txtCash.getText());
                ShareHelper.debit = Double.valueOf(txtDebit.getText());
            } catch (Exception e) {
                DialogHelper.alert(this, "Input error!");
            }

            if (check) {
                if (ShareHelper.cash + ShareHelper.debit != ShareHelper.total) {
                    DialogHelper.alert(this, "Your payment is not balance");
                    ShareHelper.cash = 0;
                    ShareHelper.debit = 0;
                    txtCash.setText("0");
                    txtDebit.setText("0");
                    return;
                }
            }
            if (ShareHelper.cash + ShareHelper.debit > ShareHelper.total) {
                DialogHelper.alert(this, "Cash + Debit can not be higher than Total amount");
                ShareHelper.cash = 0;
                ShareHelper.debit = 0;
                txtCash.setText("0");
                txtDebit.setText("0");
                return;
            }
            ShareHelper.paymentConfimation = true;
            if (ShareHelper.cash + ShareHelper.debit < ShareHelper.total) {
                ShareHelper.month = (cboTerm.getSelectedIndex() + 1) * 6;
            } else {
                ShareHelper.month = 0;
            }
            this.dispose();
        }
    }

    void cancel() {
        ShareHelper.paymentConfimation = false;
        this.dispose();
    }
}
