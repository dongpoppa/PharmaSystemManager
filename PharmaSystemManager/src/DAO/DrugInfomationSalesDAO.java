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
import model.DrugInfomation;

/**
 *
 * @author longd
 */
public class DrugInfomationSalesDAO {

    public List<DrugInfomation> select() {
        String sql = "SELECT * FROM THUOC\n"
                + "JOIN THUOCTRONGKHO ON THUOC.TENTHUOC = THUOC.MATHUOC\n where madaily='" +ShareHelper.Branch
                + "' group by mathuoc";
        return select(sql);
    }
    
    public List<DrugInfomation> findByID(String drugInfo) {
        String sql = "SELECT * FROM THUOC\n"
                + "JOIN THUOCTRONGKHO ON THUOCTRONGKHO.MATHUOC = THUOC.MATHUOC\n"
                + "WHERE madaily='%" +ShareHelper.Branch.getBranchID()+"%' and THUOC.TENTHUOC LIKE '%" + drugInfo + "%' OR THUOCTRONGKHO.MATHUOC LIKE '%"+drugInfo+"%' or TENKHOAHOC LIKE '%" +drugInfo+"%' or nhasx like '%" +drugInfo+"%' ";
        return select(sql);
    }
    
    public DrugInfomation findById(String ID) {
        String sql = "SELECT * FROM THUOC\n"
                + "JOIN THUOCTRONGKHO ON THUOCTRONGKHO.MATHUOC = THUOC.MATHUOC\n"
                + "WHERE madaily like '%" +ShareHelper.Branch.getBranchID()+"%' AND thuoctrongkho.maTHUOC= '"+ID+"'";
        System.out.println(sql);
        List<DrugInfomation> list = select(sql);
        return list.size() > 0 ? list.get(0) : null;
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
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    
     public void updateQuantity(DrugInfomation model) {
        String sql = "UPDATE Thuoctrongkho SET soluongton=? WHERE MaThuoc = ?";
        JdbcHelper.executeUpdate(sql, model.getQuantity(), model.getDrugID());
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
        model.setManufactured(rs.getString("NhaSX"));
        model.setUnit(rs.getString("donvitinh"));
        model.setQuantity(rs.getInt("Soluongton"));
        model.setDrugNumber(rs.getInt("IDTHUOC"));
        return model;
    }
}
