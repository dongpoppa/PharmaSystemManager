/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.BranchDAO;
import DAO.PurchaseInvoiceDAO;
import DAO.StoragedDrugDAO;
import DAO.SupplierDAO;
import com.toedter.calendar.JTextFieldDateEditor;
import helper.DateHelper;
import helper.DialogHelper;
import helper.JdbcHelper;
import helper.ShareHelper;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Branch;
import model.PurchaseInvoice;
import model.Supplier;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Admin
 */
public class StatisticJInternalFrame extends javax.swing.JInternalFrame {

    SupplierDAO supplierDAO = new SupplierDAO();
    PurchaseInvoiceDAO purchaseInvoiceDAO = new PurchaseInvoiceDAO();
    BranchDAO branchDAO = new BranchDAO();
    StoragedDrugDAO SDDAO = new StoragedDrugDAO();

    /**
     * Creates new form StatisticJInternalFrame
     */
    public StatisticJInternalFrame(JFrame frame, int pnl) {
        initComponents();
        ShareHelper.frame = frame;
        pnlReport.setSelectedIndex(pnl);
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        pnlReport = new javax.swing.JTabbedPane();
        pnlRevenue = new javax.swing.JPanel();
        tab1_txtDrugName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tab1_lblTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdcFrom = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1_tblGridView = new javax.swing.JTable();
        jdcTo = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tab1_cbxBranch = new javax.swing.JComboBox<>();
        tab1_print = new javax.swing.JButton();
        tab1_report = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pnlDebt = new javax.swing.JPanel();
        lblSupplier = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();
        cboSupplier = new javax.swing.JComboBox();
        btnDebtChart = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        pnlDrugs1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDrug = new javax.swing.JTable();
        txtDrugName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbbDrugStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbbBranch = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Statistical Report");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total:");

        jLabel4.setText("Date From");

        tab1_lblTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tab1_lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        tab1_lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tab1_lblTotal.setText("VND ");

        jLabel5.setText("Date To");

        tab1_tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Branch", "Drug name", "Quantity", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab1_tblGridView.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(tab1_tblGridView);

        jLabel6.setText("Branch");

        tab1_cbxBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Branch" }));

        tab1_print.setText("Print");

        tab1_report.setText("Report");
        tab1_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab1_reportActionPerformed(evt);
            }
        });

        jLabel7.setText("Drug Name");

        javax.swing.GroupLayout pnlRevenueLayout = new javax.swing.GroupLayout(pnlRevenue);
        pnlRevenue.setLayout(pnlRevenueLayout);
        pnlRevenueLayout.setHorizontalGroup(
            pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRevenueLayout.createSequentialGroup()
                .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRevenueLayout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlRevenueLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tab1_lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(pnlRevenueLayout.createSequentialGroup()
                                .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tab1_report, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlRevenueLayout.createSequentialGroup()
                                        .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tab1_cbxBranch, 0, 277, Short.MAX_VALUE)
                                            .addComponent(jdcFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRevenueLayout.createSequentialGroup()
                                        .addComponent(tab1_print, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnlRevenueLayout.createSequentialGroup()
                                        .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jdcTo, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                            .addComponent(tab1_txtDrugName)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRevenueLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        pnlRevenueLayout.setVerticalGroup(
            pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRevenueLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tab1_cbxBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tab1_txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab1_print)
                    .addComponent(tab1_report))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tab1_lblTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jdcFrom.setDateFormatString("dd-MM-yyyy");
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jdcFrom.getDateEditor();
        editor.setEditable(false);
        jdcTo.setDateFormatString("dd-MM-yyyy");
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) jdcTo.getDateEditor();
        editor1.setEditable(false);

        pnlReport.addTab("Revenue Report", pnlRevenue);

        lblSupplier.setText("Supplier");

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print.png"))); // NOI18N
        btnPrint.setText("Print");

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cash", "Debit", "Remain", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblGridView);

        cboSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSupplierActionPerformed(evt);
            }
        });

        btnDebtChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chart.png"))); // NOI18N
        btnDebtChart.setText("Chart");
        btnDebtChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebtChartActionPerformed(evt);
            }
        });

        lblTotal.setForeground(new java.awt.Color(51, 51, 255));
        lblTotal.setText("Total: ");

        javax.swing.GroupLayout pnlDebtLayout = new javax.swing.GroupLayout(pnlDebt);
        pnlDebt.setLayout(pnlDebtLayout);
        pnlDebtLayout.setHorizontalGroup(
            pnlDebtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDebtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDebtChart, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDebtLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        pnlDebtLayout.setVerticalGroup(
            pnlDebtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDebtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDebtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplier)
                    .addComponent(btnPrint)
                    .addComponent(cboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDebtChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotal)
                .addGap(11, 11, 11))
        );

        pnlReport.addTab("Debt Report", pnlDebt);

        jButton5.setText("Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Print");

        tblDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Batch No.", "Stored Qualtity", "Unit", "Imported Date", "MFG Date", "EXP Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblDrug);

        jLabel9.setText("Drug Name");

        cbbDrugStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Drugs", "In-use Drugs", "Revoked Drugs" }));

        jLabel11.setText("Status");

        jLabel12.setText("Branch");

        javax.swing.GroupLayout pnlDrugs1Layout = new javax.swing.GroupLayout(pnlDrugs1);
        pnlDrugs1.setLayout(pnlDrugs1Layout);
        pnlDrugs1Layout.setHorizontalGroup(
            pnlDrugs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDrugs1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDrugs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                    .addGroup(pnlDrugs1Layout.createSequentialGroup()
                        .addGroup(pnlDrugs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDrugs1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDrugs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbbBranch, 0, 289, Short.MAX_VALUE)
                                    .addComponent(txtDrugName)))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDrugs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDrugs1Layout.createSequentialGroup()
                                .addGroup(pnlDrugs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlDrugs1Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDrugs1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbDrugStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
        );
        pnlDrugs1Layout.setVerticalGroup(
            pnlDrugs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDrugs1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDrugs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbDrugStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDrugs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pnlReport.addTab("Drugs Report", pnlDrugs1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(pnlReport, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pnlReport, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        this.fillToSupplierCombobox();
        this.fillToTableDebt();
        fillToDrugBranchCbb();
        fillToTableDrug();
        this.fillToRevenueBranchCbx();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        fillToTableDrug();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnDebtChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebtChartActionPerformed
        // TODO add your handling code here:
        this.showDebtChart();
    }//GEN-LAST:event_btnDebtChartActionPerformed

    private void cboSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSupplierActionPerformed
        // TODO add your handling code here:
        this.fillToTableDebt();
    }//GEN-LAST:event_cboSupplierActionPerformed

    private void tab1_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab1_reportActionPerformed
        // TODO add your handling code here:
        this.fillToTableRevenue();
    }//GEN-LAST:event_tab1_reportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDebtChart;
    private javax.swing.JButton btnPrint;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbBranch;
    private javax.swing.JComboBox<String> cbbDrugStatus;
    private javax.swing.JComboBox cboSupplier;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private com.toedter.calendar.JDateChooser jdcFrom;
    private com.toedter.calendar.JDateChooser jdcTo;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlDebt;
    private javax.swing.JPanel pnlDrugs1;
    private javax.swing.JTabbedPane pnlReport;
    private javax.swing.JPanel pnlRevenue;
    private javax.swing.JComboBox<String> tab1_cbxBranch;
    private javax.swing.JLabel tab1_lblTotal;
    private javax.swing.JButton tab1_print;
    private javax.swing.JButton tab1_report;
    private javax.swing.JTable tab1_tblGridView;
    private javax.swing.JTextField tab1_txtDrugName;
    private javax.swing.JTable tblDrug;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtDrugName;
    // End of variables declaration//GEN-END:variables

    void init() {
        setFrameIcon(ShareHelper.APP_ICON);
    }

    void fillToSupplierCombobox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSupplier.getModel();
        model.removeAllElements();
        try {
            List<Supplier> list = supplierDAO.select();
            Supplier all = new Supplier();
            all.setName("All Suppliers");
            all.setID("");
            model.addElement(all);
            for (Supplier supplier : list) {
                model.addElement(supplier);
            }
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Database access error!");
        }
    }

    void fillToDrugBranchCbb() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbBranch.getModel();
        model.removeAllElements();
        model.addElement("All branchs");
        try {
            List<Branch> list = branchDAO.select();
            list.forEach((branch) -> {
                model.addElement(branch);
            });
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Database access error!");
        }
    }

    void fillToTableDebt() {
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);
        Supplier supplier = (Supplier) cboSupplier.getSelectedItem();
        List<Object[]> list = purchaseInvoiceDAO.getDebt(supplier.getID());
        for (Object[] row : list) {
            model.addRow(row);
        }
        double total = 0;
        for (int i = 0; i < tblGridView.getRowCount(); i++) {
            total += Double.parseDouble(String.valueOf(tblGridView.getValueAt(i, 3)));
        }
        lblTotal.setText("Total: " + total + " (VND)");
    }

    void fillToTableDrug() {
        DefaultTableModel model = (DefaultTableModel) tblDrug.getModel();
        model.setRowCount(0);
        String name, branch, status = "";

        name = "".equals(txtDrugName.getText()) ? "%" : txtDrugName.getText();
        if (cbbBranch.getSelectedIndex() == 0) {
            branch = "%";
        } else {
            branch = ((Branch) cbbBranch.getSelectedItem()).getBranchID();
        }

        switch (cbbDrugStatus.getSelectedIndex()) {
            case 0:
                status = "";
                break;
            case 1:
                status = " and THUOCTRONGKHO.trangthaithuoc is null";
                break;
            case 2:
                status = " and THUOCTRONGKHO.trangthaithuoc is not null";
                break;
        }

        String sql = "Select * from THUOCTRONGKHO JOIN Thuoc on thuoc.mathuoc=thuoctrongkho.mathuoc WHERE MADAILY like '" + branch + "' and tenThuoc like '%" + name + "%' " + status + " order by Tenthuoc";
        System.out.println(sql);

        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] row
                            = {
                                rs.getString("MATHUOC"),
                                rs.getString("tenthuoc"),
                                rs.getString("MaLoHang"),
                                rs.getInt("soluongton"),
                                rs.getString("donvitinh"),
                                rs.getDate("ngaynhaphang"),
                                rs.getDate("ngaysx"),
                                rs.getDate("ngayhethan"),
                                rs.getString("trangthaithuoc")
                            };
                    model.addRow(row);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void showDebtChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String sql = "SELECT YEAR(NGAYDAOHAN) AS NGAYDAOHAN, SUM(SOTIENCONLAI) AS SOTIENCONLAI FROM HoaDonThuMua\n"
                + "GROUP BY YEAR(NGAYDAOHAN)\n"
                + "ORDER BY NGAYDAOHAN ASC";
        ResultSet resultSet = JdbcHelper.executeQuery(sql);
        List<PurchaseInvoice> list = new ArrayList<>();
        try {
            while (resultSet.next()) {
                PurchaseInvoice purchaseInvoice = new PurchaseInvoice();
                purchaseInvoice.setYearDueDate(resultSet.getInt("NGAYDAOHAN"));
                purchaseInvoice.setRemainMoney(resultSet.getDouble("SOTIENCONLAI"));
                list.add(purchaseInvoice);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        for (int i = 0; i < list.size(); i++) {
            dataset.addValue(list.get(i).getRemainMoney(), "Debt", String.valueOf(list.get(i).getYearDueDate()));
        }
        JFreeChart barChart = ChartFactory.createBarChart("Chart of Debt by year", "Year", "Debt", dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = barChart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        ChartFrame chartFrame = new ChartFrame("Chart of Debt by year", barChart, true);
        chartFrame.setVisible(true);
        chartFrame.setSize(800, 500);
    }
    
        //------------------------------------------------------------------------//
    //------------------------------------------------------------------------//
    //----------------------------REVENUE REPORT------------------------------//
    //------------------------------------------------------------------------//
    //------------------------------------------------------------------------//
    void fillToRevenueBranchCbx() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) tab1_cbxBranch.getModel();
        model.removeAllElements();
        model.addElement("All branchs");
        try {
            List<Branch> list = branchDAO.select();
            list.forEach((branch)
                    -> {
                model.addElement(branch);
            });
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Database access error!");
        }
    }

    void fillToTableRevenue() {
        String drugName = tab1_txtDrugName.getText();
        double total = 0;
        Date dateFrom = new Date(0);
        Date dateTo = DateHelper.now();
        if (jdcFrom.getDate() != null) {
            dateFrom = jdcFrom.getDate();
        }
        if (jdcTo.getDate() != null) {
            dateTo = jdcTo.getDate();
        }
        String brarchID = "";
        if (tab1_cbxBranch.getSelectedIndex() != 0) {
            Branch branch = (Branch) tab1_cbxBranch.getSelectedItem();
            brarchID = branch.getBranchID();
        }
        ResultSet rs = JdbcHelper.executeQuery("{call spDoanhThu(?,?,?,?)}", dateFrom, dateTo, brarchID, drugName);
        DefaultTableModel model = (DefaultTableModel) tab1_tblGridView.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getDate(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4),
                    rs.getDouble(5)});
                total += Double.parseDouble(rs.getString(5));
            }
            tab1_lblTotal.setText(String.valueOf(total)+" VND");
            tab1_tblGridView.setAutoCreateColumnsFromModel(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            DialogHelper.alert(this, "Database access error!");
        }
    }
    //------------------------------------------------------------------------//
    //------------------------------------------------------------------------//
    //--------------------------REVENUE REPORT END----------------------------//
    //------------------------------------------------------------------------//
    //------------------------------------------------------------------------//
}
