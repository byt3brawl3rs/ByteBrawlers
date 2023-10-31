package com.ByteBrawlers.ByteBrawlers.Service;

import Exceptions.CustomerNotFoundException;
import com.ByteBrawlers.ByteBrawlers.DTO.LoginDTO;
import com.ByteBrawlers.ByteBrawlers.Model.Customer;
import com.ByteBrawlers.ByteBrawlers.Repository.CustomerRepository;
import com.ByteBrawlers.ByteBrawlers.DTO.CustomerDTO;
import com.ByteBrawlers.ByteBrawlers.Util.LoginMessage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerServiceImplementation implements CustomerService {

    private final RestTemplate restTemplate;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ModelMapper mapper;

    public CustomerServiceImplementation(@Value("http://localhost:8080/customer") String customerBaseURL, RestTemplateBuilder builder,
                                         CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        this.restTemplate = builder.rootUri(customerBaseURL).build();
    }

    @Override
    public String createCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Creating customer...";
    }

    @Override
    public String updateCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Updating customer... ";
    }

    @Override
    public String deleteCustomer(int customerId) {
        if (getCustomer(customerId) == null) {
            new CustomerNotFoundException();
        }
        customerRepository.deleteById(customerId);
        return "Deleting customer... ";
    }

    @Override
    public CustomerDTO getCustomer(int customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        return mapper.map(customer, CustomerDTO.class);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public LoginMessage loginCustomer(LoginDTO loginDTO) {
        Customer employee1 = customerRepository.findByUsername(loginDTO.getUsername());
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = (Objects.equals(password, encodedPassword));
            if (isPwdRight) {
                Optional<Customer> employee = customerRepository.findOneByUsernameAndPassword(loginDTO.getUsername(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginMessage("Login successful", true);
                }
            }
        }
        return new LoginMessage("Email or Password is wrong", false);

    }
}
