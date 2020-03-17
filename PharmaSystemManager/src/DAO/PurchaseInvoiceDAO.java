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
import model.PurchaseInvoice;

/**
 *
 * @author rondw
 */
public class PurchaseInvoiceDAO {
     public void insert(PurchaseInvoice model) {
        String sql = "INSERT INTO HoaDonThuMua (NgayMua, HinhThucThanhToan, GiamGia, SoTienThanhToan, SoTienConLai, TrangThaiHDMua, MaNV, MaNCC) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getPurchaseDate(), model.getPayType(), model.getDiscount(), model.getPurchaseMoney(), model.getRemainMoney(), model.getStatus(), model.getEmployeeID(), model.getSupplierID());
    }

    public void update(PurchaseInvoice model) {
        String sql = "UPDATE HoaDonThuMua SET NgayMua = ?, HinhThucThanhToan = ?, GiamGia = ?, SoTienThanhToan = ?, SoTienConLai = ?, TrangThaiHDMua = ?, MaNV = ?, MaNCC = ? WHERE MaHDMua = ?";
        JdbcHelper.executeUpdate(sql, model.getPurchaseDate(), model.getPayType(), model.getDiscount(), model.getPurchaseMoney(), model.getRemainMoney(), model.getStatus(), model.getEmployeeID(), model.getSupplierID(),model.getID());
    }


    public void updateStatus(PurchaseInvoice model) {
        String sql = "UPDATE HoaDonThuMua SET TrangThaiHDMua = ? Where MaHDMua = ?";
        JdbcHelper.executeUpdate(sql, ShareHelper.getStatus(), model.getID());
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
        model.setPayType(rs.getString("HinhThucThanhToan"));
        model.setDiscount(rs.getInt("GiamGia"));
        model.setPurchaseMoney(rs.getDouble("SoTienThanhToan"));
        model.setRemainMoney(rs.getDouble("SoTienConLai"));
        model.setStatus(rs.getString("TrangThaiHDMua"));
        model.setEmployeeID(rs.getString("MaNV"));
        model.setSupplierID(rs.getString("MaNCC"));
        return model;
    }
}
