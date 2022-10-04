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

}
