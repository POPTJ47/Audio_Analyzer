/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Piraveen Mahesan
 */
public class DBConnection {
    
     private Connection conn = null;
    private String query = null;
    private ResultSet rs;
    private String url = ("jdbc:sqlserver://localhost:1433;databaseName=testdb;integratedSecurity=true;");
    private String usrName = "";
    private String pwd = "";

    public DBConnection() {
        try {
            conn = DriverManager.getConnection(url, usrName, pwd);
            conn.setAutoCommit(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getconn() {
        return conn;
    }
    
    public ResultSet execute(String query) throws SQLException {
        PreparedStatement stm = conn.prepareStatement(query);
        return stm.executeQuery();

    }
    
    public ResultSet execute(PreparedStatement statement) throws SQLException {

        return statement.executeQuery();

    }


    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
