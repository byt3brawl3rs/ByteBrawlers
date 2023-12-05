package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.Utility.DTO.LoginDTO;
import com.ByteBrawlers.ByteBrawlers.Model.Customer;
import com.ByteBrawlers.ByteBrawlers.Utility.LoginMessage;

import java.util.List;

public interface CustomerService {

    public LoginMessage loginCustomer(LoginDTO loginDTO);

    public void createCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public void deleteCustomer(Integer id);

    public Customer getCustomer(Integer id);

    public List<Customer> getAllCustomers();

    public Customer getCustomerByUsername(String username);

}
