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

    public List<Food> getAllFood() throws Exception;

    public List<Food> getFoodbyDateCreated(String dateCreated) throws Exception;

    public Food getFoodById(int foodid) throws Exception;

    public List<Food> getProductwithPagging(int index) throws Exception;

    public List<Food> getProductWithPaggingByName(int index, String Name) throws Exception;

    public void addFood(String FoodName, int CategoryID, String Image, int Quantity, float UnitPrice, String Description, boolean Status, String dateCreated);
    
    public void deleteFoodById(int id) throws Exception;
}
