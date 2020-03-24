/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import helper.JdbcHelper;
import helper.ShareHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PurchaseInvoice;

/**
 *
 * @author rondw
 */
public class PurchaseInvoiceDAO {

    public String insert(PurchaseInvoice model) {
        try {
            String sql = "call InsertPurchaseInvoice (?, ?, ?, ?, ?, ?, ?, ?)";
            return JdbcHelper.CallableStatementWithOutputAtParameterOneAndTypeIsNvarchar(sql, model.getPurchaseDate(), model.getPurchaseByCash(), model.getPurchaseByCredit(), model.getDiscount(), model.getRemainMoney(), model.getEmployeeID(), model.getSupplierID());
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String lastPurchaseInvoiceID() {
        String sql = "SELECT TOP 1 MAHDMUA FROM HOADONTHUMUA ORDER BY MAHDMUA DESC";
        ResultSet resultSet = JdbcHelper.executeQuery(sql);
        String purchaseInvoiceID = null;
        try {
            while (resultSet.next()) {
                purchaseInvoiceID = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchaseInvoiceID;
    }

    public String DatePurchaseByID(String InvoiceID) {
        String sql = "SELECT NgayMua FROM dbo.HoaDonThuMua WHERE MaHDMua= '" + InvoiceID + "'";
        ResultSet resultSet = JdbcHelper.executeQuery(sql);
        String date = null;
        try {
            while (resultSet.next()) {
                date = String.valueOf(resultSet.getDate(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    public int lastStoragedDrugID() {
        String sql = "SELECT TOP 1 IDTHUOC FROM THUOCTRONGKHO ORDER BY IDTHUOC DESC";
        ResultSet resultSet = JdbcHelper.executeQuery(sql);
        int i = 0;
        try {
            while (resultSet.next()) {
                i = resultSet.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public void update(PurchaseInvoice model) {
        String sql = "UPDATE HoaDonThuMua SET NgayMua = ?, TTTienMat = ?,TTThe = ?, GiamGia = ?, SoTienConLai = ?, TrangThaiHDMua = ?, MaNV = ?, MaNCC = ? WHERE MaHDMua = ?";
        try {
            JdbcHelper.executeUpdate(sql, model.getPurchaseDate(), model.getPurchaseByCash(), model.getPurchaseByCredit(), model.getDiscount(), model.getRemainMoney(), model.getStatus(), model.getEmployeeID(), model.getSupplierID(), model.getID());
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateStatus(PurchaseInvoice model) {
        String sql = "UPDATE HoaDonThuMua SET TrangThaiHDMua = ? Where MaHDMua = ?";
        try {
            JdbcHelper.executeUpdate(sql, ShareHelper.getStatus(), model.getID());
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseInvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<PurchaseInvoice> select() {
        String sql = "SELECT * FROM HoaDonThuMua";
        return select(sql);
    }

    public PurchaseInvoice findById(String MaHDMua) {
        String sql = "SELECT * FROM HoaDonThuMua WHERE MaHDMua = ?";
        List<PurchaseInvoice> list = select(sql, MaHDMua);
        return list.size() > 0 ? list.get(0) : null;
    }

    public PurchaseInvoice findByEmployeeID(String EmployeeID) {
        String sql = "SELECT * FROM HoaDonThuMua WHERE MaNV = ?";
        List<PurchaseInvoice> list = select(sql, EmployeeID);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<PurchaseInvoice> findBySupplierID(String SupplierID) {
        String sql = "SELECT * FROM HoaDonThuMua WHERE MaNCC = ?";
        List<PurchaseInvoice> list = select(sql, SupplierID);
        return list;
    }

    private List<PurchaseInvoice> select(String sql, Object... args) {
        List<PurchaseInvoice> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    PurchaseInvoice model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private PurchaseInvoice readFromResultSet(ResultSet rs) throws SQLException {
        PurchaseInvoice model = new PurchaseInvoice();
        model.setID(rs.getString("MaHDMua"));
        model.setPurchaseDate(rs.getDate("NgayMua"));
        model.setPurchaseByCash(rs.getDouble("TTTienMat"));
        model.setPurchaseByCredit(rs.getDouble("TTThe"));
        model.setDiscount(rs.getInt("GiamGia"));
        model.setRemainMoney(rs.getDouble("SoTienConLai"));
        model.setStatus(rs.getString("TrangThaiHDMua"));
        model.setEmployeeID(rs.getString("MaNV"));
        model.setSupplierID(rs.getString("MaNCC"));
        return model;
    }
}
