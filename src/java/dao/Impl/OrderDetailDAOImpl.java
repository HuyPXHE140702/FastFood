/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Impl;

import dao.OrderDetailDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import model.Cart;
import model.OrderDetail;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class OrderDetailDAOImpl extends dao.Impl.BaseDAOImpl implements OrderDetailDAO {

    /**
     * save order bill into orderDetail table
     * @param orderId
     * @param carts
     */
    @Override
    public void saveCart(int orderId, Map<Integer, Cart> carts) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "INSERT INTO [dbo].[OrderDetail]\n"
                    + "           ([OrderID]\n"
                    + "           ,[NameFood]\n"
                    + "           ,[ImageFood]\n"
                    + "           ,[PriceFood]\n"
                    + "           ,[Quantity])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?)";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);

            for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
                Integer foodid = entry.getKey();
                Cart cart = entry.getValue();
                preparedStatement.setInt(1, orderId);
                preparedStatement.setString(2, cart.getProduct().getFoodname());
                preparedStatement.setString(3, cart.getProduct().getImage());
                preparedStatement.setFloat(4, cart.getProduct().getUnitprice());
                preparedStatement.setInt(5, cart.getQuantity());
                preparedStatement.executeUpdate();
                
            }
        } catch (Exception ex) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }

    }

    @Override
    public List<OrderDetail> getOrderDetailByAccountID(int id) {
        List<OrderDetail> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "SELECT * FROM OrderDetail WHERE OrderID IN (SELECT OrderID FROM Orders WHERE account_id = " + id + " AND created_date = CAST(GETDATE() AS DATE))";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new OrderDetail(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getFloat(5),
                        resultSet.getInt(6)));
            }
        } catch (Exception ex) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return list;
    }

    @Override
    public List<OrderDetail> getOrderDetailByOrderID(int id) {
        List<OrderDetail> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from OrderDetail where  OrderID = " + id;
             connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new OrderDetail(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getFloat(5),
                        resultSet.getInt(6)));
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return list;
    }

}
