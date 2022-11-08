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

import dao.ShipperDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Shipper;

/*
 * The class contains method for view shipper list, add or update an shipper<br>
 * Using table Shipper, Account in database
 * The method wil throw an object of  <code>java.lang.Exception</code> class if there is any error occurring when finding, inserting, or updating data <br>
 * @author HuyPX
 */
public class ShipperDAOImpl extends BaseDAOImpl implements ShipperDAO {

    /**
     * Get a list of available Orders for Shipper role to view<br>
     * The result contain a list of <code>model.Shipper</code> objects<br>
     *
     * @param accountid get ID of account
     * @return Shipper object
     * @throws java.lang.Exception
     */
    @Override
    public Shipper getShipperByAccountID(int accountid) throws Exception {
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
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return null;
    }

    /**
     * Get a list of available Orders for Shipper role to view<br>
     * The result contain a list of <code>model.Shipper</code> objects<br>
     *
     * @param ReceiveMoney get the receive money of shipper
     * @param accountID get ID of account
     * @throws java.lang.Exception
     */
    @Override
    public void UpdateDeliveryMoney(float ReceiveMoney, int accountID) throws Exception {
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
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }

    }

    /**
     * Get a list of available Orders for Shipper role to view<br>
     * The result contain a list of <code>model.Shipper</code> objects<br>
     *
     * @param deliveryMoney get the delivery money of shipper
     * @throws java.lang.Exception
     */
    @Override
    public void UpdateReceive(float deliveryMoney) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "update Seller set ReceiveMoney = ReceiveMoney + " + deliveryMoney + " where AccountID = (select ID from Account where IsSaller = 1)";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
    }

    /**
     * Get a list of available Orders for Shipper role to view<br>
     * The result contain a list of <code>model.Shipper</code> objects<br>
     *
     * @param accountID get ID of account
     * @throws java.lang.Exception
     */
    @Override
    public void UpdateDeliveryEqualZero(int accountID) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "Update shipper set DeliveryMoney = 0 where ShipperID = (select ShipperID from Shipper where AccountID = ?)";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accountID);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
    }
}
