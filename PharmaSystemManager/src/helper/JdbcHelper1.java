/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class JdbcHelper1
{

    public static String drive = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dburl = "jdbc:sqlserver://localhost\\DESKTOP-GNLFKS4\\SQLEXPRESS:1433;databaseName=PharmaSystemManager";
    public static String user = "sa";
    public static String pass = "songlong";

    static
    {
        try
        {
            Class.forName(drive);
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement preparedStatement(String sql, Object... args) throws SQLException
    {
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement pstm = null;
        if (sql.trim().startsWith("{"))
        {
            pstm = conn.prepareCall(sql);
        }
        else
        {
            pstm = conn.prepareStatement(sql);
        }

        for (int i = 0; i < args.length; i++)
        {
            pstm.setObject(i + 1, args[i]);
        }
        return pstm;
    }

    public static void executeUpdate(String sql, Object... args)
    {
        try
        {
            PreparedStatement stmt = preparedStatement(sql, args);
            try
            {
                stmt.executeUpdate();
            } finally
            {
                stmt.getConnection().close();
            }
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet executeQuery(String sql, Object... args)
    {
        try
        {
            PreparedStatement stm = preparedStatement(sql, args);
            return stm.executeQuery();
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

}
