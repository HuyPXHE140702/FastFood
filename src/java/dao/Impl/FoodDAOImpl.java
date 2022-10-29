/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Impl;

import dao.FoodDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Food;

/**
 *
 * @author DangTM
 */
public class FoodDAOImpl extends BaseDAOImpl implements FoodDAO {

    @Override
    public List<Food> getAllFood() throws Exception {
        List<Food> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "select * from Foods";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Food(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getFloat(6),
                        resultSet.getString(7),
                        resultSet.getBoolean(8),
                        resultSet.getString(9)));
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

    @Override
    public List<Food> getFoodbyDateCreated(String dateCreated) throws Exception {
        List<Food> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "select *from Foods where DateCreated = ?";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dateCreated);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Food(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getFloat(6),
                        resultSet.getString(7),
                        resultSet.getBoolean(8),
                        resultSet.getString(9)));
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

    @Override
    public Food getFoodById(int foodid) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "select *from Foods where FoodID = ?";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, foodid);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Food food = new Food(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getFloat(6),
                        resultSet.getString(7),
                        resultSet.getBoolean(8),
                        resultSet.getString(9));
                return food;
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
    public List<Food> getProductwithPagging(int index) throws Exception {
        List<Food> list = new ArrayList<Food>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "select * from Foods order by CategoryID offset ? row fetch next 9 rows only";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (index - 1) * 9);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int FoodID = resultSet.getInt(1);
                String FoodName = resultSet.getString(2);
                int CategoryID = resultSet.getInt(3);
                String Image = resultSet.getString(4);
                int Quantity = resultSet.getInt(5);
                float UnitPrice = resultSet.getFloat(6);
                String Description = resultSet.getString(7);
                boolean Status = resultSet.getBoolean(8);
                String DateCreated = resultSet.getString(9);
                Food food = new Food(FoodID, FoodName, CategoryID, Image, Quantity, UnitPrice, Description, Status, DateCreated);
                list.add(food);
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

    @Override 
    public List<Food> getProductWithPaggingByName(int index, String name) throws Exception {
       
        List<Food> list = new ArrayList<Food>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from Foods where FoodName like '%"+name+"%' order by FoodName offset ? row fetch next 9 rows only";
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (index - 1) * 6);
            resultSet = preparedStatement.executeQuery();

           
            while (resultSet.next()) {
                int FoodID = resultSet.getInt(1);
                String FoodName = resultSet.getString(2);
                int CategoryID = resultSet.getInt(3);
                String Image = resultSet.getString(4);
                int Quantity = resultSet.getInt(5);
                float UnitPrice = resultSet.getFloat(6);
                String Description = resultSet.getString(7);
                boolean Status = resultSet.getBoolean(8);
                String DateCreated = resultSet.getString(9);
                Food food = new Food(FoodID, FoodName, CategoryID, Image, Quantity, UnitPrice, Description, Status, DateCreated);
                list.add(food);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return list;
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

}
