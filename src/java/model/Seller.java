/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Model for Seller 
 * @author HuyPX
 */

public class Seller {
    private int sellerid;
    private int shipperid;
    private String sellername;
    private String phone;
    private String address;
    private float receivemoney;
    private int status;

    public Seller() {
    }

    public Seller(int sellerid, int shipperid, String sellername, String phone, String address, float receivemoney, int status) {
        this.sellerid = sellerid;
        this.shipperid = shipperid;
        this.sellername = sellername;
        this.phone = phone;
        this.address = address;
        this.receivemoney = receivemoney;
        this.status = status;
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

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
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

    public float getReceivemoney() {
        return receivemoney;
    }

    public void setReceivemoney(float receivemoney) {
        this.receivemoney = receivemoney;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Seller{" + "sellerid=" + sellerid + ", shipperid=" + shipperid + ", sellername=" + sellername + ", phone=" + phone + ", address=" + address + ", receivemoney=" + receivemoney + ", status=" + status + '}';
    }


}