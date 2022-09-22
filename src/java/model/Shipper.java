/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author admin
 */
public class Shipper {
    private int shipperid;
    private int sellerid;
    private String shippername;
    private String phone;
    private String address;
    private float deliverymoney;
    private int accountid;
    private int status;
    public Shipper() {
    }


    public Shipper(int shipperid, int sellerid, String shippername, String phone, String address, float deliverymoney, int accountid, int status) {
        this.shipperid = shipperid;
        this.sellerid = sellerid;
        this.shippername = shippername;
        this.phone = phone;
        this.address = address;
        this.deliverymoney = deliverymoney;
        this.accountid = accountid;
        this.status = status;
    }
    
    public int getShipperid() {
        return shipperid;
    }
    
    public void setShipperid(int shipperid) {
        this.shipperid = shipperid;
    }
    
    public int getSellerid() {
        return sellerid;
    }
    
    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }
    
    public String getShippername() {
        return shippername;
    }
    
    public void setShippername(String shippername) {
        this.shippername = shippername;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public float getDeliverymoney() {
        return deliverymoney;
    }
    
    public void setDeliverymoney(float deliverymoney) {
        this.deliverymoney = deliverymoney;
    }
    
    public int getAccountid() {
        return accountid;
    }
    
    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Shipper{" + "shipperid=" + shipperid + ", sellerid=" + sellerid + ", shippername=" + shippername + ", phone=" + phone + ", address=" + address + ", deliverymoney=" + deliverymoney + ", accountid=" + accountid + ", status=" + status + '}';
    }     
}