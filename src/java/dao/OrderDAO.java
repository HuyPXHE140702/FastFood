/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Order;

/**
 *
 * @author Admin
 */
public interface OrderDAO {

    public List<Order> getOrderNotAcceptByShipperID() throws Exception;

    public List<Order> getOrderAcceptByShipperID() throws Exception;

    public List<Order> getOrderByDateToDate(String dateFrom, String dateTo, String condition, int offset) throws Exception;

    public List<Order> getOrderByDate(String date, String condition, int offset) throws Exception;

    public List<Order> viewAllOrders(int offset, int recordsPerPage) throws Exception;

    public int getNoOfRecords() throws Exception;

    public int getNoOfRecordsPost(String condition) throws Exception;
    
    public int createReturnId(Order order);

}
