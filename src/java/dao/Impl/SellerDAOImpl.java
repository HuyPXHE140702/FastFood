/*
 * Copyright(C) 2005, FPT University
 * Java MVC:
 *  Fast Food Shop
 *
 * Record of change:
 * DATE            Version             AUTHOR                   DESCRIPTION
 * 2022-10-27      1.0                 VinhNVHE140897            Seller Implement
 */
package dao.Impl;

import dao.SellerDAO;
import dao.BaseDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Seller;

public class SellerDAOImpl extends BaseDAOImpl implements SellerDAO {

  @Override
  public Seller insertSellerByAccountId(int id) throws Exception {
    String sql = "INSERT INTO Seller (SallerName,Phone,[Address],ReceiveMoney,AccountID,[Status])\n"
        + "SELECT a.Displayname,a.Phone,a.[Address],0,a.ID,1\n"
        + "FROM Account as a\n"
        + "WHERE a.ID = ?  ;";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    BaseDAO baseDAO = new BaseDAOImpl();
    try {
      connection = baseDAO.getConnection();
      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, id);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        return new Seller(resultSet.getInt(1),
            resultSet.getInt(2),
            resultSet.getString(3),
            resultSet.getString(4),
            resultSet.getString(5),
            resultSet.getFloat(6),
            resultSet.getInt(7));
      }

    } catch (Exception e) {
      throw e;
    } finally {
      baseDAO.closeResultSet(resultSet);
      baseDAO.closePreparedStatement(preparedStatement);
      baseDAO.closeConnection(connection);
    }

    return null;
  }
  @Override
  public Seller checkSellerExist(int id)throws Exception {
    String sql = "select *from Seller where AccountID = ?";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    BaseDAO baseDAO = new BaseDAOImpl();
    try {
      connection = baseDAO.getConnection();
      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, id);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        return new Seller(resultSet.getInt(1),
        resultSet.getInt(2),
        resultSet.getString(3),
        resultSet.getString(4),
        resultSet.getString(5),
        resultSet.getFloat(6),
        resultSet.getInt(7));
      }

    } catch (Exception e) {
      throw e;
    } finally {
      baseDAO.closeResultSet(resultSet);
      baseDAO.closePreparedStatement(preparedStatement);
      baseDAO.closeConnection(connection);
    }
    return null;
  }


  @Override
  public Seller deleteSellerByAccountid(int id) throws Exception {
    String sql = "delete from Seller where AccountID = ?";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    BaseDAO baseDAO = new BaseDAOImpl();
    try {
      connection = baseDAO.getConnection();
      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, id);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        return new Seller(resultSet.getInt(1),
        resultSet.getInt(2),
        resultSet.getString(3),
        resultSet.getString(4),
        resultSet.getString(5),
        resultSet.getFloat(6),
        resultSet.getInt(7));
      }

    } catch (Exception e) {
      throw e;
    } finally {
      baseDAO.closeResultSet(resultSet);
      baseDAO.closePreparedStatement(preparedStatement);
      baseDAO.closeConnection(connection);
    }
    return null;
  }
}
