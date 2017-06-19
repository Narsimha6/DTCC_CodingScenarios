package com.dtcc.emagazine.service;

import java.util.List;

import com.dtcc.emagazine.model.Customer;
 
 
public interface UserService {
     
    Customer findById(long id);
     
    Customer findByName(String name);
     
    void saveUser(Customer customer);
     
    void updateUser(Customer customer);
     
    List<Customer> findAllUsers();
     
    void deleteAllUsers();
    
    boolean isUserExist(Customer customer);
     
}