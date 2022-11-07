/*
 * Copyright(C) 2005, FPT University
 * Java MVC:
 *  Fast Food Shop
 *
 * Record of change:
 * DATE            Version             AUTHOR                   DESCRIPTION
 * 2022-10-20      1.0                 NamVNHE140527            First Implement
 */
package dao.impl;

import dao.OrderDetailDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import model.Cart;
import model.OrderDetail;
import java.util.List;
import java.util.ArrayList;

public class OrderDetailDAOImpl extends dao.impl.BaseDAOImpl implements OrderDetailDAO {

    /**
     * save order bill into orderDetail table
     *
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

    /**
     * get list of order by from a account by accountId
     *
     * @param id
     * @return
     */
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
                        resultSet.getInt("ID"),
                        resultSet.getInt("OrderID"),
                        resultSet.getString("NameFood"),
                        resultSet.getString("ImageFood"),
                        resultSet.getFloat("PriceFood"),
                        resultSet.getInt("Quantity")));
            }
        } catch (Exception ex) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return list;
    }

    /**
     * get list of a order by orderId
     *
     * @param id
     * @return
     */
    @Override
    public List<OrderDetail> getOrderDetailByOrderID(int id) {
        List<OrderDetail> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from OrderDetail where OrderID = " + id;
             connection = getConnection();

            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new OrderDetail(
                        resultSet.getInt("ID"),
                        resultSet.getInt("OrderID"),
                        resultSet.getString("NameFood"),
                        resultSet.getString("ImageFood"),
                        resultSet.getFloat("PriceFood"),
                        resultSet.getInt("Quantity")));
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
