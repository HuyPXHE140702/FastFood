/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.ParseException;
import java.util.List;
import model.Home;

/**
 *
 * @author Admin
 */
public interface BlogDAO {

    public List<Home> getPost(int page, int pageSize) throws Exception;

    public int getTotalPage(int pageSize) throws Exception;

    public String formatDate(String pattern, String input) throws ParseException;

    public Home getDetailsPost(int parseInt) throws Exception;

}
