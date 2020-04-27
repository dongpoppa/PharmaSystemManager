/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import helper.DialogHelper;
import helper.ShareHelper;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.Timer;

/**
 *
 * @author rondw
 */
public class MainFrame extends javax.swing.JFrame
{

    EmployeeJInternalFrame employeeJInternalFrame;
    SupplierJInternalFrame supplierJInternalFrame;
    BranchJInternalFrame branchJInternalFrame;
    DrugJInternalFrame drugJInternalFrame;
    StoreStatus drugStatus;
    SaleInvoiceJInternalFrame saleInvoice;
    PurchaseInvoiceJInternalFrame purchaseInvoiceJInternalFrame;
    String name="", pos="", branch="";
    int dem=0, max=0;

    /**
     * Creates new form MainFrame
     */
    public MainFrame()
    {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        pnlStatus = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblPharName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblPosition = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblBranch = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnPurchase = new javax.swing.JButton();
        btnSale = new javax.swing.JButton();
        btnSup = new javax.swing.JButton();
        btnDrugInfo = new javax.swing.JButton();
        btnStoreStatus = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnBranch = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        Image img = new ImageIcon("src\\icon\\logo_background.png").getImage();
        desktop = new javax.swing.JDesktopPane()
        {
            public void paintComponent(Graphics g)
            {
                g.drawImage(img, this.getWidth()/2 - img.getWidth(null)/2, (this.getHeight() - 20)/2 - (img.getHeight(null) - 20)/2, null);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        mnSystem = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnChangePass = new javax.swing.JMenuItem();
        mnLogout = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();
        mnInvoice = new javax.swing.JMenu();
        mnPurchase = new javax.swing.JMenuItem();
        mnSales = new javax.swing.JMenuItem();
        mnManager = new javax.swing.JMenu();
        mnDrug = new javax.swing.JMenuItem();
        mnStatus = new javax.swing.JMenuItem();
        mnEmployee = new javax.swing.JMenuItem();
        mnBranch = new javax.swing.JMenuItem();
        mnSuplier = new javax.swing.JMenuItem();
        mnReport = new javax.swing.JMenu();
        mnRevenueReport = new javax.swing.JMenuItem();
        mnDebtReport = new javax.swing.JMenuItem();
        mnDrugReport = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharma4U");
        setAutoRequestFocus(false);

        pnlStatus.setBackground(new java.awt.Color(255, 255, 102));
        pnlStatus.setMinimumSize(new java.awt.Dimension(384, 30));
        pnlStatus.setPreferredSize(new java.awt.Dimension(211, 24));
        pnlStatus.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setMaximumSize(new java.awt.Dimension(220, 24));

        lblPharName.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPharName.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPharName)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPharName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlStatus.add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(220, 26));

        lblPosition.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlStatus.add(jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));

        lblBranch.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblBranch.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblBranch)
                .addGap(0, 220, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlStatus.add(jPanel4);

        lblTime.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 51, 51));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        lblTime.setText("hh:mm:ss      ");
        pnlStatus.add(lblTime);

        getContentPane().add(pnlStatus, java.awt.BorderLayout.PAGE_END);

        pnlMenu.setBackground(new java.awt.Color(190, 232, 239));
        pnlMenu.setPreferredSize(new java.awt.Dimension(150, 551));
        pnlMenu.setLayout(new java.awt.GridLayout(9, 1));

        btnPurchase.setBackground(new java.awt.Color(255, 227, 249));
        btnPurchase.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(51, 51, 51));
        btnPurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/purchase_invoice.png"))); // NOI18N
        btnPurchase.setText("Purchase Invoices");
        btnPurchase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPurchase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPurchase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPurchase.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPurchaseActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPurchase);

        btnSale.setBackground(new java.awt.Color(255, 227, 249));
        btnSale.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnSale.setForeground(new java.awt.Color(51, 51, 51));
        btnSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sale_invoice.png"))); // NOI18N
        btnSale.setText("Sale Invoices");
        btnSale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSale.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSale.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaleActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSale);

        btnSup.setBackground(new java.awt.Color(255, 227, 249));
        btnSup.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnSup.setForeground(new java.awt.Color(51, 51, 51));
        btnSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/supplier.png"))); // NOI18N
        btnSup.setText("Suppliers");
        btnSup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSup.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnSup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSupActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSup);

        btnDrugInfo.setBackground(new java.awt.Color(255, 227, 249));
        btnDrugInfo.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnDrugInfo.setForeground(new java.awt.Color(51, 51, 51));
        btnDrugInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/drug_information.png"))); // NOI18N
        btnDrugInfo.setText("Drugs Infomation");
        btnDrugInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDrugInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDrugInfo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDrugInfoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnDrugInfo);

        btnStoreStatus.setBackground(new java.awt.Color(255, 227, 249));
        btnStoreStatus.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnStoreStatus.setForeground(new java.awt.Color(51, 51, 51));
        btnStoreStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/drug_status.png"))); // NOI18N
        btnStoreStatus.setText("Store Status");
        btnStoreStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStoreStatus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStoreStatus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnStoreStatusActionPerformed(evt);
            }
        });
        pnlMenu.add(btnStoreStatus);

        btnEmployee.setBackground(new java.awt.Color(255, 227, 249));
        btnEmployee.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(51, 51, 51));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/employee.png"))); // NOI18N
        btnEmployee.setText("Employee");
        btnEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmployee.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEmployeeActionPerformed(evt);
            }
        });
        pnlMenu.add(btnEmployee);

        btnBranch.setBackground(new java.awt.Color(255, 227, 249));
        btnBranch.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnBranch.setForeground(new java.awt.Color(51, 51, 51));
        btnBranch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/store.png"))); // NOI18N
        btnBranch.setText("Branch");
        btnBranch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBranch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBranch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBranchActionPerformed(evt);
            }
        });
        pnlMenu.add(btnBranch);

        btnReport.setBackground(new java.awt.Color(255, 227, 249));
        btnReport.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnReport.setForeground(new java.awt.Color(51, 51, 51));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        btnReport.setText("Report");
        btnReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReport.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnReportActionPerformed(evt);
            }
        });
        pnlMenu.add(btnReport);

        btnLogout.setBackground(new java.awt.Color(255, 227, 249));
        btnLogout.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(51, 51, 51));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setHideActionText(true);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLogoutActionPerformed(evt);
            }
        });
        pnlMenu.add(btnLogout);

        getContentPane().add(pnlMenu, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1047, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 102));

        mnSystem.setBackground(new java.awt.Color(255, 255, 102));
        mnSystem.setForeground(new java.awt.Color(0, 51, 51));
        mnSystem.setText("   File   ");
        mnSystem.add(jSeparator1);

        mnChangePass.setText("Change password");
        mnChangePass.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnChangePassActionPerformed(evt);
            }
        });
        mnSystem.add(mnChangePass);

        mnLogout.setText("Logout");
        mnLogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnLogoutActionPerformed(evt);
            }
        });
        mnSystem.add(mnLogout);
        mnSystem.add(jSeparator2);

        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnExitActionPerformed(evt);
            }
        });
        mnSystem.add(mnExit);

        jMenuBar1.add(mnSystem);

        mnInvoice.setBackground(new java.awt.Color(255, 255, 102));
        mnInvoice.setForeground(new java.awt.Color(0, 51, 51));
        mnInvoice.setText("   Invoices   ");

        mnPurchase.setText("Purchase invoice");
        mnPurchase.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnPurchaseActionPerformed(evt);
            }
        });
        mnInvoice.add(mnPurchase);

        mnSales.setText("Sale invoice");
        mnSales.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnSalesActionPerformed(evt);
            }
        });
        mnInvoice.add(mnSales);

        jMenuBar1.add(mnInvoice);

        mnManager.setBackground(new java.awt.Color(255, 255, 102));
        mnManager.setForeground(new java.awt.Color(0, 51, 51));
        mnManager.setText("   Manager   ");

        mnDrug.setText("Drug infomation");
        mnDrug.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnDrugActionPerformed(evt);
            }
        });
        mnManager.add(mnDrug);

        mnStatus.setText("Store status");
        mnStatus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnStatusActionPerformed(evt);
            }
        });
        mnManager.add(mnStatus);

        mnEmployee.setText("Employee");
        mnEmployee.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnEmployeeActionPerformed(evt);
            }
        });
        mnManager.add(mnEmployee);

        mnBranch.setText("Branch");
        mnBranch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnBranchActionPerformed(evt);
            }
        });
        mnManager.add(mnBranch);

        mnSuplier.setText("Supplier");
        mnSuplier.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnSuplierActionPerformed(evt);
            }
        });
        mnManager.add(mnSuplier);

        jMenuBar1.add(mnManager);

        mnReport.setBackground(new java.awt.Color(255, 255, 102));
        mnReport.setForeground(new java.awt.Color(0, 51, 51));
        mnReport.setText("   Statistical   ");

        mnRevenueReport.setText("Revenue Report");
        mnRevenueReport.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnRevenueReportActionPerformed(evt);
            }
        });
        mnReport.add(mnRevenueReport);

        mnDebtReport.setText("Debt Report");
        mnDebtReport.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnDebtReportActionPerformed(evt);
            }
        });
        mnReport.add(mnDebtReport);

        mnDrugReport.setText("Drug Report");
        mnDrugReport.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnDrugReportActionPerformed(evt);
            }
        });
        mnReport.add(mnDrugReport);

        jMenuBar1.add(mnReport);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        this.openEmployee();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogoutActionPerformed
    {//GEN-HEADEREND:event_btnLogoutActionPerformed
       logout();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
        openSales();
    }//GEN-LAST:event_btnSaleActionPerformed

    private void btnSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupActionPerformed

        openSupplier();
    }//GEN-LAST:event_btnSupActionPerformed

    private void btnBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchActionPerformed

        this.openBranch();
    }//GEN-LAST:event_btnBranchActionPerformed

    private void btnDrugInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrugInfoActionPerformed
        openDrugInfo();
    }//GEN-LAST:event_btnDrugInfoActionPerformed

    private void btnStoreStatusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnStoreStatusActionPerformed
    {//GEN-HEADEREND:event_btnStoreStatusActionPerformed
        openStatus();
    }//GEN-LAST:event_btnStoreStatusActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed

        openPurchaseInvoice();
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

        openReport(0);
    }//GEN-LAST:event_btnReportActionPerformed

    private void mnChangePassActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnChangePassActionPerformed
    {//GEN-HEADEREND:event_mnChangePassActionPerformed
        openChangePass();
    }//GEN-LAST:event_mnChangePassActionPerformed

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnLogoutActionPerformed
    {//GEN-HEADEREND:event_mnLogoutActionPerformed
        logout();
    }//GEN-LAST:event_mnLogoutActionPerformed

    private void mnSuplierActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnSuplierActionPerformed
    {//GEN-HEADEREND:event_mnSuplierActionPerformed
        openSupplier();
    }//GEN-LAST:event_mnSuplierActionPerformed

    private void mnDrugActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnDrugActionPerformed
    {//GEN-HEADEREND:event_mnDrugActionPerformed
        openDrugInfo();
    }//GEN-LAST:event_mnDrugActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnExitActionPerformed
    {//GEN-HEADEREND:event_mnExitActionPerformed
        if(DialogHelper.confirm(this, "Exit program?")) System.exit(0);
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnPurchaseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnPurchaseActionPerformed
    {//GEN-HEADEREND:event_mnPurchaseActionPerformed
        openPurchaseInvoice();
    }//GEN-LAST:event_mnPurchaseActionPerformed

    private void mnSalesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnSalesActionPerformed
    {//GEN-HEADEREND:event_mnSalesActionPerformed
        openSales();
    }//GEN-LAST:event_mnSalesActionPerformed

    private void mnStatusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnStatusActionPerformed
    {//GEN-HEADEREND:event_mnStatusActionPerformed
        openStatus();
    }//GEN-LAST:event_mnStatusActionPerformed

    private void mnEmployeeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnEmployeeActionPerformed
    {//GEN-HEADEREND:event_mnEmployeeActionPerformed
        openEmployee();
    }//GEN-LAST:event_mnEmployeeActionPerformed

    private void mnBranchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnBranchActionPerformed
    {//GEN-HEADEREND:event_mnBranchActionPerformed
       openBranch();
    }//GEN-LAST:event_mnBranchActionPerformed

    private void mnRevenueReportActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnRevenueReportActionPerformed
    {//GEN-HEADEREND:event_mnRevenueReportActionPerformed
        openReport(0);
    }//GEN-LAST:event_mnRevenueReportActionPerformed

    private void mnDebtReportActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnDebtReportActionPerformed
    {//GEN-HEADEREND:event_mnDebtReportActionPerformed
        openReport(1);
    }//GEN-LAST:event_mnDebtReportActionPerformed

    private void mnDrugReportActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnDrugReportActionPerformed
    {//GEN-HEADEREND:event_mnDrugReportActionPerformed
        openReport(2);
    }//GEN-LAST:event_mnDrugReportActionPerformed

    //--------------------------------------------------------------------//
    //--------------------------------------------------------------------//
    //----------------------------FUNCTION--------------------------------//
    //--------------------------------------------------------------------//
    //--------------------------------------------------------------------//
    void init()
    {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        setIconImage(ShareHelper.APP_ICON.getImage());
        this.setVisible(true);

        //Status panel
        new Timer(300, new ActionListener()
        {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e)
            {
                lblTime.setText(sdf.format(new Date())+"   ");
                if(dem<max+5) dem++; else dem=0;
                lblPharName.setText(name.substring(0, dem<name.length()?dem:name.length()));
                lblBranch.setText(branch.substring(0, dem<branch.length()?dem:branch.length()));
                lblPosition.setText(pos.substring(0, dem<pos.length()?dem:pos.length()));
            }
        }).start();
        
        this.login();
    }

    public void setMainStatus()
    {
        name=ShareHelper.USER==null?"":ShareHelper.USER.getName();
        pos=ShareHelper.USER==null?"":ShareHelper.getUserPosition();
        branch=ShareHelper.Branch==null?"":ShareHelper.Branch.toString();
        dem=0;
        max=ShareHelper.Branch==null?0:ShareHelper.Branch.toString().length();
    }

    void login()
    {
        new LoginJDialog(this, true).setVisible(true);
        setMainStatus();
    }
    
    void logout()
    {
        closeFrames();
        ShareHelper.logoff();
        setMainStatus();
        login();
    }

    void openEmployee()
    {
        closeFrames();
        
        if (!ShareHelper.USER.isRole())
        {
            DialogHelper.alert(this, "You can't access here");
            return;
        }
        employeeJInternalFrame = new EmployeeJInternalFrame(this);
        addFrame(employeeJInternalFrame);
    }

    void openSupplier()
    {
        closeFrames();
        if (!ShareHelper.USER.isRole())
        {
            DialogHelper.alert(this, "You can't access here");
            return;
        }
        supplierJInternalFrame = new SupplierJInternalFrame(this);
        addFrame(supplierJInternalFrame);
    }
    
    private void openStatus()
    {
        closeFrames();
        drugStatus = new StoreStatus();
        addFrame(drugStatus);
    }

    void openBranch()
    {
        closeFrames();
        if (!ShareHelper.USER.isRole() || ShareHelper.USER.getStoreID() != null)
        {
            DialogHelper.alert(this, "You can't access here");
            return;
        }
        branchJInternalFrame = new BranchJInternalFrame(this);
        addFrame(branchJInternalFrame);
    }

    void openDrugInfo()
    {
        closeFrames();
        if (!ShareHelper.USER.isRole())
        {
            DialogHelper.alert(this, "You can't access here");
            return;
        }
        drugJInternalFrame = new DrugJInternalFrame(this);
        addFrame(drugJInternalFrame);
    }
    
    private void openSales()
    {
        closeFrames();
        saleInvoice = new SaleInvoiceJInternalFrame();
        addFrame(saleInvoice);
    }

    void openPurchaseInvoice()
    {
        closeFrames();
        if (!ShareHelper.USER.isRole())
        {
            DialogHelper.alert(this, "You can't access here");
            return;
        }
        
        purchaseInvoiceJInternalFrame = new PurchaseInvoiceJInternalFrame(this);
        addFrame(purchaseInvoiceJInternalFrame);
    }
    
    private void openReport(int pnl)
    {
        closeFrames();
        StatisticJInternalFrame statisticJInternalFrame = new StatisticJInternalFrame(this, pnl);
        addFrame(statisticJInternalFrame);
    }
    
    void closeFrames(){
        for (JInternalFrame fr : desktop.getAllFrames())
        {
            fr.dispose();
        }
    }
    
    void addFrame(JInternalFrame frame){
        desktop.add(frame);
        frame.setLocation(this.getWidth() / 2 - frame.getWidth() / 2, desktop.getHeight() / 2 - frame.getHeight() / 2);
        frame.setVisible(true);
    }

    private void openChangePass()
    {
        new ChangePassJDialog(this, true).setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
                ShareHelper.frame = frame;
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBranch;
    private javax.swing.JButton btnDrugInfo;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSale;
    private javax.swing.JButton btnStoreStatus;
    private javax.swing.JButton btnSup;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblPharName;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblTime;
    private javax.swing.JMenuItem mnBranch;
    private javax.swing.JMenuItem mnChangePass;
    private javax.swing.JMenuItem mnDebtReport;
    private javax.swing.JMenuItem mnDrug;
    private javax.swing.JMenuItem mnDrugReport;
    private javax.swing.JMenuItem mnEmployee;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenu mnInvoice;
    private javax.swing.JMenuItem mnLogout;
    private javax.swing.JMenu mnManager;
    private javax.swing.JMenuItem mnPurchase;
    private javax.swing.JMenu mnReport;
    private javax.swing.JMenuItem mnRevenueReport;
    private javax.swing.JMenuItem mnSales;
    private javax.swing.JMenuItem mnStatus;
    private javax.swing.JMenuItem mnSuplier;
    private javax.swing.JMenu mnSystem;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlStatus;
    // End of variables declaration//GEN-END:variables

    

    

    

}
