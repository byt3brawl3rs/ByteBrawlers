package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.Model.Customer;
import com.ByteBrawlers.ByteBrawlers.Response.CustomerResponse;

import java.util.List;

public interface CustomerService {
    public String createCustomer(Customer customer);

    public String updateCustomer(Customer customer);

    public String deleteCustomer(int customerId);

    public CustomerResponse getCustomer(int customerId);

    public List<Customer> getAllCustomers();

}
