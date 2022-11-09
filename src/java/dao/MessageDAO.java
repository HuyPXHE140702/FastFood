/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Message;

/**
 *
 * @author Admin
 */
public interface MessageDAO {

    public boolean checkEmail(String email);

    public boolean checkNull(String name);

    public void insertDB(Message data) throws Exception;
    
}
