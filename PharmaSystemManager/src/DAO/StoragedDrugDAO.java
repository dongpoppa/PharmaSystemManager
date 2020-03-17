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
import model.StoragedDrug;

/**
 *
 * @author rondw
 */
public class StoragedDrugDAO {

    public void insert(StoragedDrug model) {
        String sql = "INSERT INTO ThuocTrongKho (MaLoHang, NgaySX, NgayHetHan, SoLuong, NgayNhapHang, GiaBan, GiaNhap, MaThuoc, MaDaiLy) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getBatchNo(), model.getMFG(), model.getEXP(), model.getQuantity(), model.getPurchaseDate(), model.getSaleMoney(), model.getPurchaseMoney(), model.getDrugID(), model.getBranchID());
    }

    public void update(StoragedDrug model) {
        String sql = "UPDATE ThuocTrongKho SET MaLoHang = ?, NgaySX = ?, NgayHetHan = ?, SoLuong = ?, NgayNhapHang = ?, GiaNhap = ?, MaThuoc = ?, MaDaiLy = ? WHERE ID = ?";
        JdbcHelper.executeUpdate(sql, model.getBatchNo(), model.getMFG(), model.getEXP(), model.getQuantity(), model.getPurchaseDate(), model.getSaleMoney(), model.getPurchaseMoney(), model.getDrugID(), model.getBranchID(), model.getID());
    }

    public List<StoragedDrug> select() {
        String sql = "SELECT * FROM ThuocTrongKho";
        return select(sql);
    }

    public StoragedDrug findById(String ID) {
        String sql = "SELECT * FROM ThuocTrongKho WHERE ID = ?";
        List<StoragedDrug> list = select(sql, ID);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<StoragedDrug> findByBranch(String maDaiLy) {
        String sql = "SELECT * FROM ThuocTrongKho WHERE MaDaiLy = ?";
        List<StoragedDrug> list = select(sql, maDaiLy);
        return list;
    }

    private List<StoragedDrug> select(String sql, Object... args) {
        List<StoragedDrug> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    StoragedDrug model = readFromResultSet(rs);
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

    private StoragedDrug readFromResultSet(ResultSet rs) throws SQLException {
        StoragedDrug model = new StoragedDrug();
        model.setID(rs.getInt("MaLoHang"));
        model.setMFG(rs.getDate("NgaySX"));
        model.setEXP(rs.getDate("NgayHetHan"));
        model.setQuantity(rs.getInt("SoLuong"));
        model.setPurchaseDate(rs.getDate("NgayNhapHang"));
        model.setSaleMoney(rs.getDouble("GiaBan"));
        model.setPurchaseMoney(rs.getDouble("GiaNhap"));
        model.setDrugID(rs.getString("MaThuoc"));
        model.setBranchID(rs.getString("MaDaiLy"));
        return model;
    }
}
