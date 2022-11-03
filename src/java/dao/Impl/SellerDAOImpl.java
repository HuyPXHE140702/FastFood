/*
 * Copyright(C) 2005, FPT University
 * Java MVC:
 *  Fast Food Shop
 *
 * Record of change:
 * DATE            Version             AUTHOR                   DESCRIPTION
 * 2022-10-27      1.0                 VinhNVHE140897            Seller Implement
 */
package dao.impl;

import dao.SellerDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Seller;

public class SellerDAOImpl extends BaseDAOImpl implements SellerDAO {

  /**
   * Get a number of records of Account table from Database<br>
   * The result is type of Integer<br>
   *
   * @param baseDAO           handle connection from Database
   * @param preparedStatement execute query to Database
   * @param resultSet         get data from Database
   * @param accountID         get id of delete account
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException      if an I/O error occurs
   * @throws SQLException     if an SQL error occurs
   */
  @Override
  public Seller insertSellerByAccountId(int id) throws Exception {
    String sql = "INSERT INTO Seller (SallerName,Phone,[Address],ReceiveMoney,AccountID,[Status])\n"
        + "SELECT a.Displayname,a.Phone,a.[Address],0,a.ID,1\n"
        + "FROM Account as a\n"
        + "WHERE a.ID = ? ";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
      connection = getConnection();
      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, id);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        return new Seller(resultSet.getInt("SallerID"),
            resultSet.getString("SallerName"),
            resultSet.getString("Address"),
            resultSet.getString("Phone"),
            resultSet.getFloat("ReceiveMoney"),
            resultSet.getInt("AccountID"),
            resultSet.getInt("Status"));
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
   * Get a number of records of Account table from Database<br>
   * The result is type of Integer<br>
   *
   * @param baseDAO           handle connection from Database
   * @param preparedStatement execute query to Database
   * @param resultSet         get data from Database
   * @param accountID         get id of delete account
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException      if an I/O error occurs
   * @throws SQLException     if an SQL error occurs
   */
  @Override
  public Seller checkSellerExist(int id) throws Exception {
    String sql = "select *from Seller where AccountID = ?";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    try {
      connection = getConnection();
      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, id);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        return new Seller(resultSet.getInt("SallerID"),
            resultSet.getString("SallerName"),
            resultSet.getString("Address"),
            resultSet.getString("Phone"),
            resultSet.getFloat("ReceiveMoney"),
            resultSet.getInt("AccountID"),
            resultSet.getInt("Status"));
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
   * Get a number of records of Account table from Database<br>
   * The result is type of Integer<br>
   *
   * @param baseDAO           handle connection from Database
   * @param preparedStatement execute query to Database
   * @param resultSet         get data from Database
   * @param accountID         get id of delete account
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException      if an I/O error occurs
   * @throws SQLException     if an SQL error occurs
   */
  @Override
  public Seller deleteSellerByAccountid(int id) throws Exception {
    String sql = "delete from Seller where AccountID = ?";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    try {
      connection = getConnection();
      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, id);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        return new Seller(resultSet.getInt("SallerID"),
            resultSet.getString("SallerName"),
            resultSet.getString("Address"),
            resultSet.getString("Phone"),
            resultSet.getFloat("ReceiveMoney"),
            resultSet.getInt("AccountID"),
            resultSet.getInt("Status"));
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

  @Override
  public void closeConnection(Connection cnn) {
    super.closeConnection(cnn); // To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void closePreparedStatement(PreparedStatement ps) {
    super.closePreparedStatement(ps); // To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void closeResultSet(ResultSet rs) {
    super.closeResultSet(rs); // To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Connection getConnection() throws Exception {
    return super.getConnection(); // To change body of generated methods, choose Tools | Templates.
  }
}
