package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {

    public Connection conn = null;

    public ConnectDB(String URL, String userName, String password) {
        try {
            //URL: connection string: address,port, database of server
            //call drivers
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //connection'
            conn = DriverManager.getConnection(URL, userName, password);
            System.out.println("connected");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ConnectDB() {
        this("jdbc:sqlserver://localhost:1433;databaseName=SWP_Project", "sa", "123");
    }

    public ResultSet getData(String sql) {
        ResultSet rs = null;
        try {
            Statement state = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    public static void main(String[] args) {
        try {
            System.out.println(new ConnectDB().getData(null));
        } catch (Exception e) {
        }
    }

}
