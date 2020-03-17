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
import model.Drug;

/**
 *
 * @author rondw
 */
public class DrugDAO {

    public void insert(Drug model) {
        String sql = "INSERT INTO Thuoc (MaThuoc, TenThuoc, TenKhoaHoc, NhietDoBaoQuan, QuyCachDongGoi, DonViTinh, NhaSX, MoTaThuoc, TrangThaiThuoc, MaLoaiThuoc) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getID(), model.getName(), model.getScienceName(), model.getStorageTemperatures(), model.getPacking(), model.getUnit(), model.getProducer(), model.getDescription(), model.getStatus(), model.getDrugCategoryID());
    }

    public void update(Drug model) {
        String sql = "UPDATE Thuoc SET TenThuoc = ?, TenKhoaHoc = ?, NhietDoBaoQuan = ?, QuyCachDongGoi = ?, DonViTinh = ?, NhaSX = ?, MoTaThuoc = ?, TrangThaiThuoc = ?, MaLoaiThuoc = ? WHERE MaThuoc = ?";
        JdbcHelper.executeUpdate(sql, model.getName(), model.getScienceName(), model.getStorageTemperatures(), model.getPacking(), model.getUnit(), model.getProducer(), model.getDescription(), model.getStatus(), model.getDrugCategoryID(), model.getID());
    }

    public void updateStatus(Drug model) {
        String sql = "UPDATE Thuoc SET TrangThaiThuoc = ? Where MaThuoc = ?";
        JdbcHelper.executeUpdate(sql, ShareHelper.getStatus(), model.getID());
    }

    public List<Drug> select() {
        String sql = "SELECT * FROM Thuoc";
        return select(sql);
    }

    public Drug findById(String MaThuoc) {
        String sql = "SELECT * FROM Thuoc WHERE MaThuoc = ?";
        List<Drug> list = select(sql, MaThuoc);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<Drug> findByDrugCategory(String DrugCategoryID) {
        String sql = "SELECT * FROM Thuoc WHERE MaLoaiThuoc = ?";
        List<Drug> list = select(sql, DrugCategoryID);
        return list;
    }

    private List<Drug> select(String sql, Object... args) {
        List<Drug> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Drug model = readFromResultSet(rs);
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

    private Drug readFromResultSet(ResultSet rs) throws SQLException {
        Drug model = new Drug();
        model.setID(rs.getString("MaNV"));
        model.setName(rs.getString("MatKhau"));
        model.setScienceName(rs.getString("VaiTro"));
        model.setStorageTemperatures(rs.getInt("HoVaTen"));
        model.setPacking(rs.getString("NgaySinh"));
        model.setUnit(rs.getString("NgayLamViec"));
        model.setProducer(rs.getString("SDTNV"));
        model.setDescription(rs.getString("EmailNV"));
        model.setStatus(rs.getString("DiaChiNV"));
        model.setDrugCategoryID(rs.getString("TrangThaiNV"));;
        return model;
    }
}
