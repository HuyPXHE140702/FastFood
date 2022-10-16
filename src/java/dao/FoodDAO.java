/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Food;

/**
 *
 * @author Admin
 */
public interface FoodDAO {
    
    public List<Food> getallFood() throws Exception;
    
    public List<Food> getFoodbyDateCreated(String dateCreated) throws Exception;
    
    public Food getFoodById(int foodid) throws Exception;
    
    public List<Food> getProductwithpagging(int index) throws Exception;
}
