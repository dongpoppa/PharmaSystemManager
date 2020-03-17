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
import model.SaleInvoice;

/**
 *
 * @author rondw
 */
public class SaleInvoiceDAO {
     public void insert(SaleInvoice model) {
        String sql = "INSERT INTO HoaDonBanHang (NgayBan, HinhThucThanhToan, GiamGia, TrangThaiHDBan, MaNV) VALUES (?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getSaleDate(), model.getPayType(), model.getDiscount(), model.getStatus(), model.getEmployeeID());
    }

    public void update(SaleInvoice model) {
        String sql = "UPDATE HoaDonBanHang SET NgayBan = ?, HinhThucThanhToan = ?, GiamGia = ?, TrangThaiHDBan = ?, MaNV = ? WHERE MaHDBan = ?";
        JdbcHelper.executeUpdate(sql, model.getSaleDate(), model.getPayType(), model.getDiscount(), model.getStatus(), model.getEmployeeID(),model.getID());
    }

    public void updateStatus(SaleInvoice model) {
        String sql = "UPDATE HoaDonBanHang SET TrangThaiHDBan = ? Where MaHDBan = ?";
        JdbcHelper.executeUpdate(sql, ShareHelper.getStatus(), model.getID());
    }

    public List<SaleInvoice> select() {
        String sql = "SELECT * FROM HoaDonBanHang";
        return select(sql);
    }

    public SaleInvoice findById(String MaHDBan) {
        String sql = "SELECT * FROM HoaDonBanHang WHERE MaHDBan = ?";
        List<SaleInvoice> list = select(sql, MaHDBan);
        return list.size() > 0 ? list.get(0) : null;
    }

     public SaleInvoice findByEmployeeID(String EmployeeID) {
        String sql = "SELECT * FROM HoaDonBanHang WHERE MaNV = ?";
        List<SaleInvoice> list = select(sql, EmployeeID);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<SaleInvoice> select(String sql, Object... args) {
        List<SaleInvoice> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    SaleInvoice model = readFromResultSet(rs);
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

    private SaleInvoice readFromResultSet(ResultSet rs) throws SQLException {
        SaleInvoice model = new SaleInvoice();
        model.setID(rs.getString("MaHDBan"));
        model.setSaleDate(rs.getDate("NgayBan"));
        model.setPayType(rs.getString("HinhThucThanhToan"));
        model.setDiscount(rs.getInt("GiamGia"));
        model.setStatus(rs.getString("TrangThaiHDBan"));
        model.setEmployeeID(rs.getString("MaNV"));
        return model;
    }
}
