/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ShipperDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Shipper;

/**
 *
 * @author Admin
 */
public class ShipperDAOImpl extends BaseDAOImpl implements ShipperDAO {

    @Override
    public Shipper getShipperByAccountID(int accountid) {
//        List<Shipper> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from Shipper where ShipperID = (select ShipperID from Shipper where AccountID = ?)";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accountid);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Shipper(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getFloat(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8));
            }
        } catch (Exception e) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return null;
    }

    @Override
    public void UpdateDeliveryMoney(float ReceiveMoney, int accountID) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "Update shipper set DeliveryMoney = ?  where ShipperID = (select ShipperID from Shipper where AccountID = ?)";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setFloat(1, ReceiveMoney);
            preparedStatement.setInt(2, accountID);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }

    }
}
