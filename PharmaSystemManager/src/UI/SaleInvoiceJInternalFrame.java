/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.DrugInfomationSalesDAO;
import helper.DialogHelper;
import helper.ShareHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.DrugInfomation;

/**
 *
 * @author rondw
 */
public class SaleInvoiceJInternalFrame extends javax.swing.JInternalFrame
{

    /**
     * Creates new form PurchaseInvoiceJInternalFrame
     */
    public SaleInvoiceJInternalFrame()
    {
        initComponents();
        init();
    }

    DrugInfomationSalesDAO dao = new DrugInfomationSalesDAO();
    DefaultTableModel modelInvoice;
    DefaultListModel modelList;
    DrugInfomation selectedDrug;

    public SaleInvoiceJInternalFrame(JFrame frame)
    {
        initComponents();
        init();
        ShareHelper.frame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtDC = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        txtInfo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtQuantity = new com.toedter.components.JSpinField();
        jLabel14 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMan = new javax.swing.JTextField();
        lblMax = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        txtPrice = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listDrug = new javax.swing.JList<>();
        btnPrint = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();

        setClosable(true);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Medicine infomation"));

        tblInvoice.setAutoCreateRowSorter(true);
        tblInvoice.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Drug ID", "Drug name", "Quantity", "Price", "Amount", "Select", "No", "Max"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInvoice.setRowHeight(25);
        tblInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInvoiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInvoice);
        if (tblInvoice.getColumnModel().getColumnCount() > 0) {
            tblInvoice.getColumnModel().getColumn(0).setResizable(false);
            tblInvoice.getColumnModel().getColumn(2).setResizable(false);
            tblInvoice.getColumnModel().getColumn(3).setResizable(false);
            tblInvoice.getColumnModel().getColumn(4).setResizable(false);
            tblInvoice.getColumnModel().getColumn(5).setResizable(false);
            tblInvoice.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblInvoice.getColumnModel().getColumn(6).setMinWidth(0);
            tblInvoice.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblInvoice.getColumnModel().getColumn(6).setMaxWidth(0);
            tblInvoice.getColumnModel().getColumn(7).setMinWidth(0);
            tblInvoice.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblInvoice.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        jPanel7.setLayout(new java.awt.GridLayout(1, 5, 10, 10));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("TOTAL AMOUNT");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Discount");

        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Select all");

        txtDC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));

        jLabel2.setText("%");

        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("VND #,##0"))));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(586, 586, 586))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setMaximumSize(new java.awt.Dimension(424, 373));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Drug Info");

        txtInfo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Drug name");

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Quantity");

        txtQuantity.setMaximum(20);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Price");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel13.setText("Nghìn VNĐ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Manufacturer");

        txtMan.setEditable(false);
        txtMan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblMax.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMax.setForeground(new java.awt.Color(0, 153, 0));
        lblMax.setText("100");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Drug ID");

        btnAddToCart.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_cart.png"))); // NOI18N
        btnAddToCart.setText("Add to invoice");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        txtPrice.setEditable(false);
        txtPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("VND #,##0"))));
        txtPrice.setMaximumSize(new java.awt.Dimension(4, 20));
        txtPrice.setName(""); // NOI18N

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Available:");

        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtMan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblMax, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnAddToCart, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel16)
                                    .addGap(12, 12, 12)
                                    .addComponent(lblMax)
                                    .addGap(14, 14, 14))
                                .addComponent(txtName)
                                .addComponent(txtMan)
                                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(btnAddToCart)
                            .addGap(23, 23, 23))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(96, 96, 96))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMax)
                        .addComponent(jLabel16)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        listDrug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listDrugMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listDrug);

        btnPrint.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print.png"))); // NOI18N
        btnPrint.setText("Print");

        btnCheckOut.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_invoice.png"))); // NOI18N
        btnCheckOut.setText("Check out");

        btnClear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancle.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        btnFind.setText("Find history");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane2)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFindActionPerformed
    {//GEN-HEADEREND:event_btnFindActionPerformed
        fillToList();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jCheckBox1ItemStateChanged
    {//GEN-HEADEREND:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected())
        {
            for (int i = 0; i < modelInvoice.getRowCount(); i++)
            {
                modelInvoice.setValueAt(true, i, 5);
            }
        }
        else
        {
            for (int i = 0; i < modelInvoice.getRowCount(); i++)
            {
                modelInvoice.setValueAt(false, i, 5);
            }
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed
        fillToList();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddToCartActionPerformed
    {//GEN-HEADEREND:event_btnAddToCartActionPerformed
        addToCart();
        btnAddToCart.setText("Add to invoice");
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void listDrugMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_listDrugMouseClicked
    {//GEN-HEADEREND:event_listDrugMouseClicked
        chooseFromList();
    }//GEN-LAST:event_listDrugMouseClicked

    private void tblInvoiceMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblInvoiceMouseClicked
    {//GEN-HEADEREND:event_tblInvoiceMouseClicked
        getModel();
    }//GEN-LAST:event_tblInvoiceMouseClicked

    void init()
    {
        setFrameIcon(ShareHelper.APP_ICON);
        modelInvoice = (DefaultTableModel) tblInvoice.getModel();
        modelInvoice.setRowCount(0);
    }

    void fillToList()
    {
        listDrug.setModel(new DefaultListModel());
        modelList = (DefaultListModel) listDrug.getModel();
        modelList.removeAllElements();
        try
        {
            List<DrugInfomation> list = dao.findByID(txtInfo.getText());
            for (DrugInfomation drug : list)
            {
                modelList.addElement(drug);
            }

        } catch (Exception e)
        {
            e.printStackTrace();
            DialogHelper.alert(this, "Database access error!");
        }
    }

    void chooseFromList()
    {
        try
        {
            selectedDrug = (DrugInfomation) modelList.getElementAt(listDrug.getSelectedIndex());
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        txtID.setText(selectedDrug.getDrugID());
        txtMan.setText(selectedDrug.getManufactured());
        txtName.setText(selectedDrug.getDrugName());
        txtPrice.setText(String.valueOf(selectedDrug.getSalePrice()));
        txtQuantity.setValue(0);
        lblMax.setText(String.valueOf(selectedDrug.getQuantity()));
        txtQuantity.setMaximum(selectedDrug.getQuantity());
    }

    int selectedRow()
    {
        return tblInvoice.getSelectedRow();
    }

    void addToCart()
    {
        if (txtQuantity.getValue() <= 0)
        {
            return;
        }
        if (btnAddToCart.getText().equals("Update to invoice"))
        {
            modelInvoice.removeRow(selectedRow());
        }
        else
        {
            for (int i = 0; i < tblInvoice.getRowCount(); i++)
            {
                if (selectedDrug.getDrugNumber() == (Integer) modelInvoice.getValueAt(i, 6))
                {
                    int par = txtQuantity.getValue() + (Integer) modelInvoice.getValueAt(i, 2);
                    if (par > (Integer) modelInvoice.getValueAt(i, 7))
                    {
                        DialogHelper.alert(this, "Số lượng thêm vào quá giới hạn!");
                    }
                    else
                    {
                        modelInvoice.setValueAt(par, i, 2);
                        DialogHelper.alert(this, "Đã thay đổi số lượng!");
                    }
                    return;
                }
            }
        }

        Vector vec = new Vector();
        vec.add(selectedDrug.getDrugID());
        vec.add(selectedDrug.getDrugName());
        vec.add(txtQuantity.getValue());
        vec.add(selectedDrug.getSalePrice());
        vec.add((txtQuantity.getValue() * selectedDrug.getSalePrice()));
        vec.add(false);
        vec.add(selectedDrug.getDrugNumber());
        vec.add(selectedDrug.getQuantity());

        modelInvoice.addRow(vec);

        double discount = txtDC.getText().trim().equals("") ? 1 : Double.valueOf(txtDC.getText());
        double total = 0;

        for (int i = 0; i < modelInvoice.getRowCount(); i++)
        {
            total += (double) modelInvoice.getValueAt(i, 4);
        }
        txtTotal.setValue(total * discount / 100);
        clearTextField();
        listDrug.setEnabled(true);
    }

    void getModel()
    {
        selectedDrug = dao.findById(modelInvoice.getValueAt(selectedRow(), 0).toString());
        txtID.setText(selectedDrug.getDrugID());
        txtName.setText(selectedDrug.getDrugName());
        txtMan.setText(selectedDrug.getManufactured());
        txtPrice.setText(modelInvoice.getValueAt(selectedRow(), 3).toString());
        txtQuantity.setValue((Integer) modelInvoice.getValueAt(selectedRow(), 2));
        lblMax.setText(String.valueOf(selectedDrug.getQuantity()));
        btnAddToCart.setText("Update to invoice");
        listDrug.setEnabled(false);
    }

    void clearTextField()
    {
        txtID.setText("");
        txtName.setText("");
        txtMan.setText("");
        txtPrice.setText("");
        txtQuantity.setValue(0);
    }

    void removeRow(DefaultTableModel model1, int index)
    {
        DefaultTableModel model2 = new DefaultTableModel();
        model2.setRowCount(0);
        for (int i = 0; i < model1.getRowCount(); i++)
        {
            for (int j = 0; j < model1.getRowCount(); j++)
            {

            }
        }
    }

    void clear()
    {
        for (int i = 0; i < tblInvoice.getRowCount(); i++)
        {
            if ((Boolean) modelInvoice.getValueAt(i, 5))
            {
                modelInvoice.removeRow(i);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMax;
    private javax.swing.JList<String> listDrug;
    private javax.swing.JTable tblInvoice;
    private javax.swing.JFormattedTextField txtDC;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtInfo;
    private javax.swing.JTextField txtMan;
    private javax.swing.JTextField txtName;
    private javax.swing.JFormattedTextField txtPrice;
    private com.toedter.components.JSpinField txtQuantity;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
