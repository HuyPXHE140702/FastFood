/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.MessageDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Message;

/**
 *
 * @author Admin
 */
public class MessageDAOImpl extends BaseDAOImpl implements MessageDAO {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z0-9]{2,})$", Pattern.CASE_INSENSITIVE);

    @Override
    public boolean checkEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);

        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkNull(String name) {
        if (name.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void insertDB(Message data) throws Exception {
        String query = "INSERT INTO Message(name,email,message) values(?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, data.getName());
            preparedStatement.setString(2, data.getEmail());
            preparedStatement.setString(3, data.getMessage());

            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(preparedStatement);
            closeConnection(connection);
        }
    }
}
