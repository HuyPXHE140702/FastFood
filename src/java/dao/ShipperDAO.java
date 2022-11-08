/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Shipper;

/**
 *
 * @author Admin
 */
public interface ShipperDAO {

    public Shipper getShipperByAccountID(int accountid) throws Exception;

    public void UpdateDeliveryMoney(float deliveryMoney, int accountid) throws Exception;

    public void UpdateReceive(float deliverymoney) throws Exception;

    public void UpdateDeliveryEqualZero(int accountid) throws Exception;
}
