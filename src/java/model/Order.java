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


public class Order {
    private int orderid;
    private int acount_id;
    private String name;
    private String phone;
    private String address;
    private float totalprice;
    private int sellerid;
    private int shipperid;
    private String created_date;
    private boolean status;

    public Order() {
    }

    public Order(int shipperid) {
        this.shipperid = shipperid;
    }

    public Order(int orderid, int acount_id, String name, String phone, String address, float totalprice, int sellerid, int shipperid, String created_date, boolean status) {
        this.orderid = orderid;
        this.acount_id = acount_id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.totalprice = totalprice;
        this.sellerid = sellerid;
        this.shipperid = shipperid;
        this.created_date = created_date;
        this.status = status;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getAcount_id() {
        return acount_id;
    }

    public void setAcount_id(int acount_id) {
        this.acount_id = acount_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public int getSellerid() {
        return sellerid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }

    public int getShipperid() {
        return shipperid;
    }

    public void setShipperid(int shipperid) {
        this.shipperid = shipperid;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "orderid=" + orderid + ", acount_id=" + acount_id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", totalprice=" + totalprice + ", sellerid=" + sellerid + ", shipperid=" + shipperid + ", created_date=" + created_date + ", status=" + status + '}';
    }  
}