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

import dao.AccountDAO;
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

        try {
            String sql = "select *from Account ";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status")
                ));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return list;
    }

    // getAccountById
    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Account login(String username, String password) {
        String sql = "select *from Account where Username = ? and Password = ? and status = 1";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status")
                );
            }

        } catch (Exception e) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return null;
    }

    /**
     *
     * @param username
     * @param password
     * @param displayName
     * @param address
     * @param phone
     * @throws Exception
     */
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

        try {
            //connect db by dbcontext
            connection = getConnection();
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
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }

    }

    /**
     *
     * @param username
     * @return
     */
    @Override
    public Account checkAccountExist(String username) {
        String sql = "select *from Account where Username = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status"));
            }

        } catch (Exception e) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return null;
    }

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Account getAccountByID(int id) throws Exception {
        String sql = "select *from Account where ID = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status"));
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
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Account deleteAccountByID(int id) throws Exception {
        String sql = "delete from Account where ID = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status"));
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
     *
     * @param username
     * @param password
     * @param displayName
     * @param address
     * @param phone
     * @param isCustomer
     * @param isShipper
     * @param isSeller
     * @throws Exception
     */
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
        //create dao

        try {
            connection = getConnection();
            //connect sql querry
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
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }

    }

    /**
     *
     * @param username
     * @param password
     * @param displayName
     * @param address
     * @param phone
     * @param isCustomer
     * @param isShipper
     * @param isSeller
     * @param id
     */
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

        try {
            connection = getConnection();
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
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }

    }

    /**
     *
     * @param password
     * @param displayName
     * @param address
     * @param phone
     * @param id
     */
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

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, password);
            preparedStatement.setString(2, displayName);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, phone);
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
    }

    /**
     *
     * @param password
     * @param id
     * @throws Exception
     */
    @Override
    public void changePasswordById(String password, int id) throws Exception {
        String sql = "UPDATE [dbo].[Account]\n"
                + "   SET [Password] =?\n"
                + " WHERE  id=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, password);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
    }

    public static void main(String[] args) throws Exception {
        AccountDAO accountDAO = new AccountDAOImpl();
        accountDAO.changePasswordById("nambitest", 14);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public String getUsernameById(int id) {
        String sql = "select Username from Account where id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("Username");
            }

        } catch (Exception e) {

        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
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
        List<Account> accountList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "SELECT * from Account WHERE Displayname like ? " + role
                    + "ORDER BY ID "
                    + "OFFSET " + offset + " ROWS FETCH NEXT 3 ROWS ONLY";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + name + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                accountList.add(new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status")));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return accountList;
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
        List<Account> accountList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                accountList.add(new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status")));
            }
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return accountList;
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
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
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

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accountID);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
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
     * @param baseDAO handle connection from Database
     * @param preparedStatement execute query to Database
     * @param resultSet get data from Database
     * @param accountID get id of delete account
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    public void updateStatusis1(int id) {
        String sql = "update Account \n"
                + "set [status] =1\n"
                + "where Account.ID=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }

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
    @Override
    public void updateStatusis0(int id) {
        String sql = "update Account \n"
                + "set [status] =0\n"
                + "where Account.ID=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
    }

    /**
     *
     * @param name
     * @param role
     * @return
     * @throws Exception
     */
    @Override
    public List<Account> getAccountByNamePaging(String name, String role) throws Exception {
        List<Account> accountList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "SELECT * from Account WHERE Displayname like ? " + role;
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + name + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                accountList.add(new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status")));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return accountList;
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

    public Account checkActice(String username, String password) {
        String sql = "select *from Account where Username = ? and Password = ? and status =0";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt("ID"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Displayname"),
                        resultSet.getString("Address"),
                        resultSet.getString("Phone"),
                        resultSet.getInt("isAdmin"),
                        resultSet.getInt("isCustomer"),
                        resultSet.getInt("IsShipper"),
                        resultSet.getInt("IsSaller"),
                        resultSet.getInt("status")
                );
            }

        } catch (Exception e) {
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return null;
    }
}
