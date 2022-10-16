/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import model.Food;

/**
 *
 * @author DangTM
 */
public class FoodDAO extends ConnectDB {

    public List<Food> getallFood() {
        List<Food> list = new ArrayList<>();

        try {
            String sql = "select * from Foods";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getFloat(6),
                        rs.getString(7),
                        rs.getBoolean(8),
                        rs.getString(9)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<Food> getFoodbyDateCreated(String dateCreated) {
        List<Food> list = new ArrayList<>();

        try {
            String sql = "select *from Foods where DateCreated = ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dateCreated);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getFloat(6),
                        rs.getString(7),
                        rs.getBoolean(8),
                        rs.getString(9)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public Food getFoodById(int foodid) {
        try {
            String sql = "select *from Foods where FoodID = ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, foodid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Food food = new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getFloat(6),
                        rs.getString(7),
                        rs.getBoolean(8),
                        rs.getString(9));
                return food;
            }

        } catch (Exception e) {
        }
        return null;
    }

    public List<Food> getProductwithpagging(int index) {
        List<Food> list = new ArrayList<Food>();
        try {
            String sql = "select * from Foods order by CategoryID offset ? row fetch next 9 rows only";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 9);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int FoodID = rs.getInt(1);
                String FoodName = rs.getString(2);
                int CategoryID = rs.getInt(3);
                String Image = rs.getString(4);
                int Quantity = rs.getInt(5);
                float UnitPrice = rs.getFloat(6);
                String Description = rs.getString(7);
                boolean Status = rs.getBoolean(8);
                String DateCreated = rs.getString(9);
                Food food = new Food(FoodID, FoodName, CategoryID, Image, Quantity, UnitPrice, Description, Status, DateCreated);
                list.add(food);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
