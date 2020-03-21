/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DrugInfomation;

/**
 *
 * @author longd
 */
public class DrugInfomationDAO {

    public List<DrugInfomation> select() {
        String sql = "SELECT THUOCTRONGKHO.MATHUOC, TENTHUOC, MALOHANG, GIANHAP, GIABAN, NGAYNHAPHANG, NGAYHETHAN FROM THUOC\n"
                + "JOIN THUOCTRONGKHO ON THUOCTRONGKHO.MATHUOC = THUOC.MATHUOC\n"
                + "ORDER BY NGAYHETHAN ASC";
        return select(sql);
    }
    
    public List<DrugInfomation> findByID(String drugName) {
        String sql = "SELECT THUOCTRONGKHO.MATHUOC, TENTHUOC, MALOHANG, GIANHAP, GIABAN, NGAYNHAPHANG, NGAYHETHAN FROM THUOC\n"
                + "JOIN THUOCTRONGKHO ON THUOCTRONGKHO.MATHUOC = THUOC.MATHUOC\n"
                + "WHERE THUOCTRONGKHO.MATHUOC LIKE '%" + drugName + "%'\n"
                + "ORDER BY NGAYHETHAN ASC";
        return select(sql);
    }

    private List<DrugInfomation> select(String sql, Object... args) {
        List<DrugInfomation> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    DrugInfomation model = readFromResultSet(rs);
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

    private DrugInfomation readFromResultSet(ResultSet rs) throws SQLException {
        DrugInfomation model = new DrugInfomation();
        model.setDrugID(rs.getString("MATHUOC"));
        model.setDrugName(rs.getString("TENTHUOC"));
        model.setBatchNo(rs.getString("MALOHANG"));
        model.setPurchasePrice(rs.getDouble("GIANHAP"));
        model.setSalePrice(rs.getDouble("GIABAN"));
        model.setImportDate(rs.getDate("NGAYNHAPHANG"));
        model.setExpirationDate(rs.getDate("NGAYHETHAN"));
        return model;
    }
}
