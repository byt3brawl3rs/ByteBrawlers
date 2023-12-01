package com.ByteBrawlers.ByteBrawlers.Controller;

import com.ByteBrawlers.ByteBrawlers.Utility.DTO.LoginDTO;
import com.ByteBrawlers.ByteBrawlers.Model.Customer;
import com.ByteBrawlers.ByteBrawlers.Utility.LoginMessage;
import com.ByteBrawlers.ByteBrawlers.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Integer id) {
        Customer customerResponse = customerService.getCustomer(id);
        return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
    }

    @PostMapping
    public void createCustomer(@RequestBody Customer customer) {
        this.customerService.createCustomer(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer) {
        this.customerService.updateCustomer(customer);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable("id") Integer id) {
        this.customerService.deleteCustomer(id);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<?> customerLogin(@RequestBody LoginDTO loginDTO) {
        LoginMessage loginResponse = customerService.loginCustomer(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}

