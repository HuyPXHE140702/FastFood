/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Model for Food 
 * @author HuyPX
 */
public class Food {
    private int foodid;
    private String foodname;
    private int categoryid;
    private String image;
    private int quantity;
    private float unitprice;
    private String description;
    private boolean status;
    private String createdate;

    public Food() {
    }

    public Food(int foodid, String foodname, int categoryid, String image, int quantity, float unitprice, String description, boolean status, String createdate) {
        this.foodid = foodid;
        this.foodname = foodname;
        this.categoryid = categoryid;
        this.image = image;
        this.quantity = quantity;
        this.unitprice = unitprice;
        this.description = description;
        this.status = status;
        this.createdate = createdate;
    }

    public int getFoodid() {
        return foodid;
    }

    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(float unitprice) {
        this.unitprice = unitprice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "Food{" + "foodid=" + foodid + ", foodname=" + foodname + ", categoryid=" + categoryid + ", image=" + image + ", quantity=" + quantity + ", unitprice=" + unitprice + ", description=" + description + ", status=" + status + ", createdate=" + createdate + '}';
    }

   
    
}
