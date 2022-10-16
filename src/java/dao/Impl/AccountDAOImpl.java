/*
 * Copyright(C) 2005, FPT University
 * Java MVC:
 *  Fast Food Shop
 *
 * Record of change:
 * DATE            Version             AUTHOR                   DESCRIPTION
 * 2022-10-12      1.0                 HuyPXHE140702            First Implement
 */
package dao.Impl;

import dao.AccountDAO;
import dao.BaseDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;

/*
 * The class contains method for view account list, add or update an account, search and paging, login, signup <br>
 * Using table Account in database
 * The method wil throw an object of  <code>java.lang.Exception</code> class if there is any error occurring when finding, inserting, or updating data <br>
 * @author HuyPX
 */
public class AccountDAOImpl extends BaseDAOImpl implements AccountDAO {

    /**
     * Get a list of Account for Admin role to view<br>
     * The result contain a list of <code>model.Account </code> objects<br>
     *
     * @param baseDAO handle connection from Database
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public List<Account> getallAccount() throws Exception {
        List<Account> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            String sql = "select *from Account ";
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Account(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getInt(11)));
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

    // getAccountById
    @Override
    public Account login(String username, String password) {
        String sql = "select *from Account where Username = ? and Password = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getInt(11));
            }

        } catch (Exception e) {
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return null;
    }

    @Override
    public void signup(String username, String password, String displayName, String address, String phone) throws Exception {
        String sql = "INSERT INTO [dbo].[Account]\n"
                + "           ([Username]\n"
                + "           ,[Password]\n"
                + "           ,[Displayname]\n"
                + "           ,[Address]\n"
                + "           ,[Phone]\n"
                + "           ,[isAdmin]\n"
                + "           ,[isCustomer]\n"
                + "           ,[IsShipper]\n"
                + "           ,[IsSaller]\n"
                + "           ,[status])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,0,1,0,0,0)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            //connect db by dbcontext
            connection = baseDAO.getConnection();
            //use query 
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, displayName);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, phone);
            //execute query
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }

    }

    @Override
    public Account checkAccountExist(String username) {
        String sql = "select *from Account where Username = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getInt(11));
            }

        } catch (Exception e) {
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return null;
    }

    @Override
    public Account getAccountByID(int id) throws Exception {
        String sql = "select *from Account where ID = ?";
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
                return new Account(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getInt(11));
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
    public Account deleteAccountByID(int id) throws Exception {
        String sql = "delete from Account where ID = ?";
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
                return new Account(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getInt(11));
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
    public void addNewAccount(String username, String password, String displayName, String address, String phone, int isCustomer, int isShipper, int isSeller) throws Exception {
        String sql = "INSERT INTO [dbo].[Account]\n"
                + "           ([Username]\n"
                + "           ,[Password]\n"
                + "           ,[Displayname]\n"
                + "           ,[Address]\n"
                + "           ,[Phone]\n"
                + "           ,[isAdmin]\n"
                + "           ,[isCustomer]\n"
                + "           ,[IsShipper]\n"
                + "           ,[IsSaller]\n"
                + "           ,[status])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,0,?,?,?,0)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, displayName);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, phone);
            preparedStatement.setInt(6, isCustomer);
            preparedStatement.setInt(7, isShipper);
            preparedStatement.setInt(8, isSeller);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }

    }

    @Override
    public void editAccountById(String username, String password, String displayName, String address, String phone, int isCustomer, int isShipper, int isSeller, int id) {
        String sql = "UPDATE [dbo].[Account]\n"
                + "   SET [Username] = ?\n"
                + "      ,[Password] =?\n"
                + "      ,[Displayname] = ?\n"
                + "      ,[Address] =?\n"
                + "      ,[Phone] =?\n"
                + "      ,[isAdmin] = 0\n"
                + "      ,[isCustomer] = ?\n"
                + "      ,[IsShipper] = ?\n"
                + "      ,[IsSaller] = ?\n"
                + "      ,[status] = 0\n"
                + " WHERE  id=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, displayName);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, phone);
            preparedStatement.setInt(6, isCustomer);
            preparedStatement.setInt(7, isShipper);
            preparedStatement.setInt(8, isSeller);
            preparedStatement.setInt(9, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }

    }

    @Override
    public void editProfileById(String password, String displayName, String address, String phone, int id) {
        String sql = "UPDATE [dbo].[Account]\n"
                + "   SET [Password] =?\n"
                + "      ,[Displayname] = ?\n"
                + "      ,[Address] =?\n"
                + "      ,[Phone] =?\n"
                + " WHERE  id=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, password);
            preparedStatement.setString(2, displayName);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, phone);
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
    }

    @Override
    public String getUsernameById(int id) {
        String sql = "select Username from Account where id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString(1);
            }

        } catch (Exception e) {

        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return null;
    }

    /**
     * Get a list of Account by Name contain<br>
     * The result contain a list of <code>model.Account</code> objects<br>
     *
     * @param baseDAO handle connection from Database
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param name get the search text
     * @param role get search role types
     * @param offset set the offset for the sql query
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public List<Account> getAccountByName(String name, String role, int offset) throws Exception {
        List<Account> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            //String extra = "";

            String sql = "SELECT * from Account WHERE Displayname like ? " + role
                    + "ORDER BY ID "
                    + "OFFSET " + offset + " ROWS FETCH NEXT 3 ROWS ONLY";
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + name + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Account(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getInt(11)));
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

    /**
     * Get a list of all Account with paging<br>
     * The result contain a list of <code>model.Account</code> objects<br>
     *
     * @param baseDAO handle connection from Database
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param offset set the offset for the sql query
     * @param noOfRecords set number of records for 1 page
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public List<Account> viewAllAccounts(int offset, int noOfRecords) throws Exception {
        String sql = "SELECT * FROM Account "
                + "ORDER BY ID "
                + "OFFSET " + offset + " ROWS FETCH NEXT " + noOfRecords + " ROWS ONLY";
        List<Account> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Account(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getInt(11)));
            }
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return list;
    }

    /**
     * Get a number of records of Account table from Database<br>
     * The result is type of Integer<br>
     *
     * @param baseDAO handle connection from Database
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
        String sql = "SELECT COUNT(*) FROM Account";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = baseDAO.getConnection();
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

    /**
     * Get a number of records of Account table with search condition from
     * Database<br>
     * The result is type of Integer<br>
     *
     * @param baseDAO handle connection from Database
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param noOfRecords return a number of records
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public int getNoOfRecordsPost(String condition) throws Exception {
        int noOfRecords = 0;
        String sql = "SELECT COUNT(*) FROM Account " + condition;
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
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return noOfRecords;
    }

    /**
     * Get a number of records of Account table from Database<br>
     * The result is type of Integer<br>
     *
     * @param baseDAO handle connection from Database
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param accountID get id of delete account
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    public Account deleteAcountByID(int accountID) {
        String sql = "delete from Account where ID = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        BaseDAO baseDAO = new BaseDAOImpl();
        try {
            connection = baseDAO.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accountID);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getInt(11));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            baseDAO.closeResultSet(resultSet);
            baseDAO.closePreparedStatement(preparedStatement);
            baseDAO.closeConnection(connection);
        }
        return null;
    }
}
