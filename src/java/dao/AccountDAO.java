package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;

public class AccountDAO {

    public List<Account> getallAccount() throws Exception {
        List<Account> list = new ArrayList<>();

        try {
            String sql = "select *from Account ";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11)));
            }

        } catch (Exception e) {
            throw e;
        } finally {

        }
        return list;
    }

    // getAccountById
    public Account login(String username, String password) {
        String sql = "select *from Account where Username = ? and Password = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11));
            }

        } catch (Exception e) {
        }
        return null;
    }

    public void signup(String username, String password, String displayName, String address, String phone) {
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
        try {
            //connect db by dbcontext
            Connection conn = new DBContext().getConnection();
            //use query 
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, displayName);
            ps.setString(4, address);
            ps.setString(5, phone);
            //execute query
            ps.executeUpdate();

        } catch (Exception e) {
        }

    }

    public Account checkAccountExist(String username) {
        String sql = "select *from Account where Username = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11));
            }

        } catch (Exception e) {
        }
        return null;
    }

    public Account getAccountByID(int id) {
        String sql = "select *from Account where ID = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account deleteAccountByID(int id) {
        String sql = "delete from Account where ID = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11));
            }
        } catch (Exception e) {
        }
        return null;
    }
     public void addNewAccount(String username, String password, String displayName, String address, String phone, int isCustomer, int isShipper, int isSeller) {
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
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, displayName);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setInt(6, isCustomer);
            ps.setInt(7, isShipper);
            ps.setInt(8, isSeller);
            ps.executeUpdate();

        } catch (Exception e) {
        }

    }

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
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, displayName);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setInt(6, isCustomer);
            ps.setInt(7, isShipper);
            ps.setInt(8, isSeller);
            ps.setInt(9, id);
            ps.executeUpdate();

        } catch (Exception e) {
        }

    }

    public void editProfileById(String password, String displayName, String address, String phone, int id) {
        String sql = "UPDATE [dbo].[Account]\n"
                + "   SET [Password] =?\n"
                + "      ,[Displayname] = ?\n"
                + "      ,[Address] =?\n"
                + "      ,[Phone] =?\n"
                + " WHERE  id=?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, password);
            ps.setString(2, displayName);
            ps.setString(3, address);
            ps.setString(4, phone);
            ps.setInt(5, id);
            ps.executeUpdate();

        } catch (Exception e) {
        }

    }

    public String getUsernameById(int id) {
        try {
            String sql = "select Username from Account where id = ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }

        } catch (Exception e) {
        }
        return null;
    }

    public List<Account> getAccountByName(String name, String role, int offset) throws Exception {
        List<Account> list = new ArrayList<>();
        try {
            //String extra = "";

            String sql = "SELECT * from Account WHERE Displayname like ? " + role
                    + "ORDER BY ID "
                    + "OFFSET " + offset + " ROWS FETCH NEXT 3 ROWS ONLY";

            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11)));
            }

        } catch (Exception e) {
            throw e;
        } finally {

        }
        return list;
    }

    public List<Account> viewAllAccounts(int offset, int noOfRecords) throws Exception {
        String sql = "SELECT * FROM Account "
                + "ORDER BY ID "
                + "OFFSET " + offset + " ROWS FETCH NEXT " + noOfRecords + " ROWS ONLY";
        List<Account> list = new ArrayList<Account>();
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11)));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
//            try {
//                if (ps != null) {
//                    ps.close();
//                }
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
        return list;
    }

    public int getNoOfRecords() throws Exception {
        int noOfRecords = 0;
        String sql = "SELECT COUNT(*) FROM Account";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                noOfRecords = rs.getInt(1);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return noOfRecords;
    }
    
    public int getNoOfRecordsPost(String condition) throws Exception {
        int noOfRecords = 0;
        String sql = "SELECT COUNT(*) FROM Account " + condition;
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                noOfRecords = rs.getInt(1);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return noOfRecords;
    }
}
