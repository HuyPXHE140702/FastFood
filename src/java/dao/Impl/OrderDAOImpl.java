/*
 * Copyright(C) 2005, FPT University
 * Java MVC:
 *  Fast Food Shop
 *
 * Record of change:
 * DATE            Version             AUTHOR                   DESCRIPTION
 * 2022-10-12      1.0                 HuyPXHE140702            First Implement
 */
package dao.impl;

import dao.OrderDAO;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Order;

/*
 * The class contains method for view order list, add or update an order, search and paging <br>
 * Using table Order, OrderDetail in database
 * The method wil throw an object of  <code>java.lang.Exception</code> class if there is any error occurring when finding, inserting, or updating data <br>
 * @author HuyPX
 */
public class OrderDAOImpl extends BaseDAOImpl implements OrderDAO {

    /**
     * Get a list of available Orders for Shipper role to view<br>
     * The result contain a list of <code>model.Order</code> objects<br>
     *
     *
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public List<Order> getOrderNotAcceptByShipperID() throws Exception {
        List<Order> orderList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "select * from Orders where ShipperID is null and status = 1";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                orderList.add(new Order(resultSet.getInt("OrderID"),
                        resultSet.getInt("account_id"),
                        resultSet.getString("Name"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Address"),
                        resultSet.getFloat("TotalPrice"),
                        resultSet.getInt("SellerID"),
                        resultSet.getInt("ShipperID"),
                        resultSet.getString("created_date"),
                        resultSet.getBoolean("status")));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return orderList;
    }

    /**
     * Get a list of accepted Order by ShipperID<br>
     * The result contain a list of <code>model.Order</code> objects<br>
     *
     *
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public List<Order> getOrderAcceptByShipperID() throws Exception {
        List<Order> orderList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "Select * From Orders where ShipperID is not null and status = 1";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                orderList.add(new Order(resultSet.getInt("OrderID"),
                        resultSet.getInt("account_id"),
                        resultSet.getString("Name"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Address"),
                        resultSet.getFloat("TotalPrice"),
                        resultSet.getInt("SellerID"),
                        resultSet.getInt("ShipperID"),
                        resultSet.getString("created_date"),
                        resultSet.getBoolean("status")));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return orderList;
    }

    /**
     * Get a list of Order when search by date to date<br>
     * The result contain a list of <code>model.Order</code> objects<br>
     *
     *
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param dateFrom get the start date to search
     * @param dateTo get the end date to search
     * @param codition get the condition of search
     * @param offset set offset for sql query
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public List<Order> getOrderByDateToDate(String dateFrom, String dateTo, String condition, int offset) throws Exception {
        List<Order> orderList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "SELECT * from Orders WHERE ShipperID is NULL " + condition
                    + " ORDER BY OrderID "
                    + "OFFSET " + offset + " ROWS FETCH NEXT 3 ROWS ONLY";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dateFrom);
            preparedStatement.setString(2, dateTo);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                orderList.add(new Order(resultSet.getInt("OrderID"),
                        resultSet.getInt("account_id"),
                        resultSet.getString("Name"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Address"),
                        resultSet.getFloat("TotalPrice"),
                        resultSet.getInt("SellerID"),
                        resultSet.getInt("ShipperID"),
                        resultSet.getString("created_date"),
                        resultSet.getBoolean("status")));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return orderList;
    }

    /**
     * Get a list of Order when search by date<br>
     * The result contain a list of <code>model.Order</code> objects<br>
     *
     *
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param date get the date to search
     * @param codition get the condition of search
     * @param offset set offset for sql query
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public List<Order> getOrderByDate(String date, String condition, int offset) throws Exception {
        List<Order> orderList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "SELECT * from Orders WHERE ShipperID is NULL " + condition
                    + " ORDER BY OrderID "
                    + "OFFSET " + offset + " ROWS FETCH NEXT 3 ROWS ONLY";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, date);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                orderList.add(new Order(resultSet.getInt("OrderID"),
                        resultSet.getInt("account_id"),
                        resultSet.getString("Name"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Address"),
                        resultSet.getFloat("TotalPrice"),
                        resultSet.getInt("SellerID"),
                        resultSet.getInt("ShipperID"),
                        resultSet.getString("created_date"),
                        resultSet.getBoolean("status")));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return orderList;
    }

    /**
     * Get a list of all Orders with paging<br>
     * The result contain a list of <code>model.Order</code> objects<br>
     *
     *
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param offset set offset for sql query
     * @param recordsPerPage set records size for 1 page
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public List<Order> viewAllOrders(int offset, int recordsPerPage) throws Exception {
        String sql = "SELECT * FROM Orders "
                + "WHERE ShipperID is NULL "
                + "ORDER BY OrderID "
                + "OFFSET " + offset + " ROWS FETCH NEXT " + recordsPerPage + " ROWS ONLY";
        List<Order> orderList = new ArrayList<Order>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                orderList.add(new Order(resultSet.getInt("OrderID"),
                        resultSet.getInt("account_id"),
                        resultSet.getString("Name"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Address"),
                        resultSet.getFloat("TotalPrice"),
                        resultSet.getInt("SellerID"),
                        resultSet.getInt("ShipperID"),
                        resultSet.getString("created_date"),
                        resultSet.getBoolean("status")));
            }
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return orderList;
    }

    /**
     * Get a number of records of Order table from Database<br>
     * The result is type of Integer<br>
     *
     *
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param noOfRecords return a number of records
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public int getNoOfRecords() throws Exception {
        int noOfRecords = 0;
        String sql = "SELECT COUNT(*) FROM Orders";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                noOfRecords = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return noOfRecords;
    }

    /**
     * Get a number of records of Order table with search condition from
     * Database<br>
     * The result is type of Integer<br>
     *
     *
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param noOfRecords return a number of records
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public int getNoOfRecordsBetweenDate(String condition, String dateFrom, String dateTo) throws Exception {
        int noOfRecords = 0;
        String sql = "SELECT COUNT(*) FROM Orders WHERE ShipperID is NULL " + condition;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dateFrom);
            preparedStatement.setString(2, dateTo);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                noOfRecords = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return noOfRecords;
    }

    @Override
    public int getNoOfRecordsOneDate(String condition, String date) throws Exception {
        int noOfRecords = 0;
        String sql = "SELECT COUNT(*) FROM Orders WHERE ShipperID is NULL " + condition;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, date);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                noOfRecords = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return noOfRecords;
    }

    @Override
    public List<Order> getOrderByDateNoOffset(String date, String condition) throws Exception {
        List<Order> orderList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "SELECT * from Orders WHERE ShipperID is NULL " + condition;
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, date);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                orderList.add(new Order(resultSet.getInt("OrderID"),
                        resultSet.getInt("account_id"),
                        resultSet.getString("Name"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Address"),
                        resultSet.getFloat("TotalPrice"),
                        resultSet.getInt("SellerID"),
                        resultSet.getInt("ShipperID"),
                        resultSet.getString("created_date"),
                        resultSet.getBoolean("status")));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return orderList;
    }

    @Override
    public List<Order> getOrderByDateToDateNoOffset(String dateFrom, String dateTo, String condition) throws Exception {
        List<Order> orderList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "SELECT * from Orders WHERE ShipperID is NULL " + condition;
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dateFrom);
            preparedStatement.setString(2, dateTo);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                orderList.add(new Order(resultSet.getInt("OrderID"),
                        resultSet.getInt("account_id"),
                        resultSet.getString("Name"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Address"),
                        resultSet.getFloat("TotalPrice"),
                        resultSet.getInt("SellerID"),
                        resultSet.getInt("ShipperID"),
                        resultSet.getString("created_date"),
                        resultSet.getBoolean("status")));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return orderList;
    }

    @Override
    public void closeConnection(Connection cnn) {
        super.closeConnection(cnn); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closePreparedStatement(PreparedStatement ps) {
        super.closePreparedStatement(ps); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeResultSet(ResultSet rs) {
        super.closeResultSet(rs); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Connection getConnection() throws Exception {
        return super.getConnection(); //To change body of generated methods, choose Tools | Templates.
    }

}
