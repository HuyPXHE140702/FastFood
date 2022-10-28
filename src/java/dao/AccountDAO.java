/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Account;

/**
 *
 * @author Admin
 */
public interface AccountDAO {

    public List<Account> getallAccount() throws Exception;

    public Account login(String username, String password) throws Exception;

    public void signup(String username, String password, String displayName, String address, String phone) throws Exception;

    public Account checkAccountExist(String username) throws Exception;

    public Account getAccountByID(int id) throws Exception;

    public Account deleteAccountByID(int id) throws Exception;

    public void addNewAccount(String username, String password, String displayName, String address, String phone, int isCustomer, int isShipper, int isSeller) throws Exception;

    public void editAccountById(String username, String password, String displayName, String address, String phone, int isCustomer, int isShipper, int isSeller, int id) throws Exception;

    public void editProfileById(String password, String displayName, String address, String phone, int id) throws Exception;

    public String getUsernameById(int id) throws Exception;

    public List<Account> getAccountByName(String name, String role, int offset) throws Exception;

    public List<Account> viewAllAccounts(int offset, int noOfRecords) throws Exception;

    public int getNoOfRecords() throws Exception;

    public int getNoOfRecordsPost(String condition) throws Exception;
    
    public Account deleteAcountByID(int accountID);
    
    public Account updateStatusis0(int id);

    public Account updateStatusis1(int id);
    public List<Account> getAccountByNamePaging(String name, String role) throws Exception;
}
