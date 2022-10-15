/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;
import model.Order;

/**
 *
 * @author HuyPX
 */
public class OrderDAO {

    public List<Order> getOrderNotAcceptByShipperID() {
        List<Order> list = new ArrayList<>();
        try {
            String sql = "select * from Orders where ShipperID is null and status = 1";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getFloat(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getBoolean(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> getOrderAcceptByShipperID() {
        List<Order> list = new ArrayList<>();
        try {
            String sql = "Select * From Orders where ShipperID is not null and status = 1";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getFloat(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getBoolean(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> getOrderByDateToDate(String dateFrom, String dateTo, String condition) throws Exception {
        List<Order> list = new ArrayList<>();
        try {
            String sql = "SELECT * from Orders WHERE ShipperID is NULL " + condition;
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dateFrom);
            ps.setString(2, dateTo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getFloat(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getBoolean(10)));
            }
        } catch (Exception e) {
            throw e;
        }
        return list;
    }

    public List<Order> getOrderByDate(String date, String condition) throws Exception {
        List<Order> list = new ArrayList<>();
        try {
            String sql = "SELECT * from Orders WHERE ShipperID is NULL " + condition;
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, date);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getFloat(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getBoolean(10)));
            }
        } catch (Exception e) {
            throw e;
        }
        return list;
    }

    public List<Order> viewAllOrders(int offset, int noOfRecords) throws Exception {
        String sql = "SELECT * FROM Orders "
                + "WHERE ShipperID is NULL "
                + "ORDER BY OrderID "
                + "OFFSET " + offset + " ROWS FETCH NEXT " + noOfRecords + " ROWS ONLY";
        List<Order> list = new ArrayList<Order>();
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getFloat(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getBoolean(10)));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
        return list;
    }

    public int getNoOfRecords() throws Exception {
        int noOfRecords = 0;
        String sql = "SELECT COUNT(*) FROM Orders";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                noOfRecords = rs.getInt(1);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return noOfRecords;
    }

}
