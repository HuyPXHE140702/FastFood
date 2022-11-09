/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.BlogDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import model.Home;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BlogDAOImpl extends BaseDAOImpl implements BlogDAO {

    @Override
    public List<Home> getPost(int page, int pageSize) throws Exception {
        int from = page * pageSize - (pageSize - 1);
        int to = page * pageSize;
        ArrayList<Home> homes = new ArrayList<>();
        String sql = "select * from "
                + "( select *, ROW_NUMBER() over (order by createDate) as rownumber from Home) "
                + "as home where home.rownumber >= ? and home.rownumber <= ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, from);
            preparedStatement.setInt(2, to);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idPost = resultSet.getInt(1);
                String type = resultSet.getString(2);
                String title = resultSet.getString(3);
                String imgLink = resultSet.getString(4);
                String content = resultSet.getString(5); // get short content
                String createDate = formatDate("dd-MM-yyyy", resultSet.getString(7));
                int like = resultSet.getInt(8);
                int comment = resultSet.getInt(9);
                String titleGroup = formatDate("MMMM yyyy", resultSet.getString(7));
                //System.out.println(rs.getString(7));
                Home home
                        = new Home(idPost, type, title, imgLink, content, createDate, like, comment, titleGroup);
                homes.add(home);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return homes;
    }

    @Override
    public String formatDate(String pattern, String input) throws ParseException {
        Date date;
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = df.parse(input);
        } catch (ParseException ex) {
            throw ex;
        }
        return format.format(date);
    }

    public int getNumPage(int pageSize, String query) throws SQLException {
        int totalPage = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                totalPage = resultSet.getInt(1);
            }

            if (totalPage % pageSize == 0) { // calculator total page to show information
                totalPage = totalPage / pageSize;
            } else {
                totalPage = totalPage / pageSize + 1;
            }
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return totalPage;
    }

    @Override
    public int getTotalPage(int pageSize) throws Exception {
        String query = "select count(*) from Home";
        return getNumPage(pageSize, query);
    }

    @Override
    public Home getDetailsPost(int id) throws Exception {
        Home home = null;
        String sql = "select * from Home where id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idPost = resultSet.getInt(1);
                String type = resultSet.getString(2);
                String title = resultSet.getString(3);
                String imgLink = resultSet.getString(4);
                String content = resultSet.getString(6);
                String createDate = formatDate("dd-MM-yyyy", resultSet.getString(7));
                System.out.println(resultSet.getString(7));
                home = new Home(idPost, type, title, imgLink, content, createDate);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
        return home;
    }
}
