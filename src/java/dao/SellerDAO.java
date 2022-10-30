/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Seller;

/**
 *
 * @author Vinh
 */
public interface SellerDAO {
  
  
  public Seller insertSellerByAccountId(int id)  throws Exception;

  public Seller deleteSellerByAccountid(int id)  throws Exception;

  public Seller checkSellerExist(int id)throws Exception;
}
