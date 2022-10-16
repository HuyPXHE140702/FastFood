/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public interface BaseDAO {

    public Connection getConnection() throws Exception;

    public void closeResultSet(ResultSet rs);

    public void closePreparedStatement(PreparedStatement ps);

    public void closeConnection(Connection cnn);
}
