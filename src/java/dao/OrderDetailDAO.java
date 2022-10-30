/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Map;
import model.Cart;
import model.OrderDetail;

/*
* Copyright(C) 2005, FPT University
* Java MVC:
*  Fast Food Shop
*
* Record of change:
* DATE            Version             AUTHOR                   DESCRIPTION
* 2022-10-31      1.0                 NamVNHE140527            First Implement
 */
public interface OrderDetailDAO {

    public void saveCart(int orderId, Map<Integer, Cart> carts);

    public List<OrderDetail> getOrderDetailByAccountID(int id);

    public List<OrderDetail> getOrderDetailByOrderID(int id);
}
