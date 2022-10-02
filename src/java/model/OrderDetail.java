/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Model for OrderDetail 
 * @author HuyPX
 */

public class OrderDetail {
    private int id;
    private int orderid;
    private String namefood;
    private String imagefood;
    private float pricefood;
    private int quantity;

    public OrderDetail() {
    }

    public OrderDetail(int id, int orderid, String namefood, String imagefood, float pricefood, int quantity) {
        this.id = id;
        this.orderid = orderid;
        this.namefood = namefood;
        this.imagefood = imagefood;
        this.pricefood = pricefood;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getNamefood() {
        return namefood;
    }

    public void setNamefood(String namefood) {
        this.namefood = namefood;
    }

    public String getImagefood() {
        return imagefood;
    }

    public void setImagefood(String imagefood) {
        this.imagefood = imagefood;
    }

    public float getPricefood() {
        return pricefood;
    }

    public void setPricefood(float pricefood) {
        this.pricefood = pricefood;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "id=" + id + ", orderid=" + orderid + ", namefood=" + namefood + ", imagefood=" + imagefood + ", pricefood=" + pricefood + ", quantity=" + quantity + '}';
    }
}
