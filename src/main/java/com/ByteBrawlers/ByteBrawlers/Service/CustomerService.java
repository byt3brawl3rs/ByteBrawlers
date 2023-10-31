package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.DTO.LoginDTO;
import com.ByteBrawlers.ByteBrawlers.Model.Customer;
import com.ByteBrawlers.ByteBrawlers.DTO.CustomerDTO;
import com.ByteBrawlers.ByteBrawlers.Util.LoginMessage;

import java.util.List;

public interface CustomerService {

    public LoginMessage loginCustomer(LoginDTO loginDTO);

    public String createCustomer(Customer customer);

    public String updateCustomer(Customer customer);

    public String deleteCustomer(int customerId);

    public CustomerDTO getCustomer(int customerId);

    public List<Customer> getAllCustomers();

}
