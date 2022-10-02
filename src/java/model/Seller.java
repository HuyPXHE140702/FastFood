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
    private String sellername;
    private String address;
    private String phone;
    private float receivemoney;
    private int accountid;
    private int status;

    public Seller() {
    }

    public Seller(int sellerid, String sellername, String address, String phone, float receivemoney, int accountid, int status) {
        this.sellerid = sellerid;
        this.sellername = sellername;
        this.address = address;
        this.phone = phone;
        this.receivemoney = receivemoney;
        this.accountid = accountid;
        this.status = status;
    }

    public int getSellerid() {
        return sellerid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getReceivemoney() {
        return receivemoney;
    }

    public void setReceivemoney(float receivemoney) {
        this.receivemoney = receivemoney;
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
        return "Seller{" + "sellerid=" + sellerid + ", sellername=" + sellername + ", address=" + address + ", phone=" + phone + ", receivemoney=" + receivemoney + ", accountid=" + accountid + ", status=" + status + '}';
    }

   
    

  

}
