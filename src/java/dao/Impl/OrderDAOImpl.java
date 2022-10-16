/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Impl;

import dao.BaseDAO;
import dao.OrderDAO;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Order;

/**
 *
 * @author HuyPX
 */
public class OrderDAOImpl extends BaseDAOImpl implements OrderDAO {

    @Override
    public List<Order> getOrderNotAcceptByShipperID() throws Exception {
        List<Order> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            String sql = "select * from Orders where ShipperID is null and status = 1";
            connection = new BaseDAOImpl().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Order(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getFloat(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getString(9),
                        resultSet.getBoolean(10)));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return list;
    }

    @Override
    public List<Order> getOrderAcceptByShipperID() throws Exception {
        List<Order> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            String sql = "Select * From Orders where ShipperID is not null and status = 1";
            connection = new BaseDAOImpl().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Order(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getFloat(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getString(9),
                        resultSet.getBoolean(10)));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return list;
    }

    @Override
    public List<Order> getOrderByDateToDate(String dateFrom, String dateTo, String condition,int offset) throws Exception {
        List<Order> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            String sql = "SELECT * from Orders WHERE ShipperID is NULL " + condition
                    + " ORDER BY OrderID "
                    + "OFFSET " + offset + " ROWS FETCH NEXT 3 ROWS ONLY";
            connection = new BaseDAOImpl().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dateFrom);
            preparedStatement.setString(2, dateTo);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Order(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getFloat(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getString(9),
                        resultSet.getBoolean(10)));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return list;
    }

    @Override
    public List<Order> getOrderByDate(String date, String condition, int offset) throws Exception {
        List<Order> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            String sql = "SELECT * from Orders WHERE ShipperID is NULL " + condition
                    + " ORDER BY OrderID "
                    + "OFFSET " + offset + " ROWS FETCH NEXT 3 ROWS ONLY";
            connection = new BaseDAOImpl().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, date);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Order(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getFloat(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getString(9),
                        resultSet.getBoolean(10)));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return list;
    }

    @Override
    public List<Order> viewAllOrders(int offset, int recordsPerPage) throws Exception {
        String sql = "SELECT * FROM Orders "
                + "WHERE ShipperID is NULL "
                + "ORDER BY OrderID "
                + "OFFSET " + offset + " ROWS FETCH NEXT " + recordsPerPage + " ROWS ONLY";
        List<Order> list = new ArrayList<Order>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = new BaseDAOImpl().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Order(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getFloat(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getString(9),
                        resultSet.getBoolean(10)));
            }
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return list;
    }

    @Override
    public int getNoOfRecords() throws Exception {
        int noOfRecords = 0;
        String sql = "SELECT COUNT(*) FROM Orders";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = new BaseDAOImpl().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                noOfRecords = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return noOfRecords;
    }
    
    @Override
    public int getNoOfRecordsPost(String condition) throws Exception {
        int noOfRecords = 0;
        String sql = "SELECT COUNT(*) FROM Orders" + condition;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = new BaseDAOImpl().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                noOfRecords = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return noOfRecords;
    }
}
