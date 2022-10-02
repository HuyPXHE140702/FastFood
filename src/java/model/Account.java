/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Model for Account 
 * @author HuyPX
 */
public class Account {
    private int id;
    private String username;
    private String password;
    private String displayName;
    private String address;
    private String phone;
    private int isAdmin;
    private int isCustomer;
    private int isShipper;
    private int isSeller;
    private int status;

    public Account() {
    }

    public Account(int id, String username, String password, String displayName, String address, String phone, int isAdmin, int isCustomer, int isShipper, int isSeller, int status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayName = displayName;
        this.address = address;
        this.phone = phone;
        this.isAdmin = isAdmin;
        this.isCustomer = isCustomer;
        this.isShipper = isShipper;
        this.isSeller = isSeller;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getIsCustomer() {
        return isCustomer;
    }

    public void setIsCustomer(int isCustomer) {
        this.isCustomer = isCustomer;
    }

    public int getIsShipper() {
        return isShipper;
    }

    public void setIsShipper(int isShipper) {
        this.isShipper = isShipper;
    }

    public int getIsSeller() {
        return isSeller;
    }

    public void setIsSeller(int isSeller) {
        this.isSeller = isSeller;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", username=" + username + ", password=" + password + ", displayName=" + displayName + ", address=" + address + ", phone=" + phone + ", isAdmin=" + isAdmin + ", isCustomer=" + isCustomer + ", isShipper=" + isShipper + ", isSeller=" + isSeller + ", status=" + status + '}';
    }

    
    
   
    

    
}
