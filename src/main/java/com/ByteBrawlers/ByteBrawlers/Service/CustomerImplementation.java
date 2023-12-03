package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.Utility.DTO.LoginDTO;
import com.ByteBrawlers.ByteBrawlers.Model.Customer;
import com.ByteBrawlers.ByteBrawlers.Repository.CustomerRepository;
import com.ByteBrawlers.ByteBrawlers.Utility.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerImplementation implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getCustomer(Integer id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerByUsername(String username) {
        return customerRepository.findCustomerByUsername(username);
    }

    @Override
    public LoginMessage loginCustomer(LoginDTO loginDTO) {
        Customer employee1 = customerRepository.findCustomerByUsername(loginDTO.getUsername());
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = (Objects.equals(password, encodedPassword));
            if (isPwdRight) {
                Customer customer = customerRepository.findCustomerByUsernameAndPassword(loginDTO.getUsername(), encodedPassword);
                if (customer.isPresent()) {
                    return new LoginMessage("Login successful", true);
                }
            }
        }
        return new LoginMessage("Email or Password is wrong", false);

    }
}
