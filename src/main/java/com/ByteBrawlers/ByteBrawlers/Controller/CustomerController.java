package com.ByteBrawlers.ByteBrawlers.Controller;

import com.ByteBrawlers.ByteBrawlers.DTO.LoginDTO;
import com.ByteBrawlers.ByteBrawlers.Model.Customer;
import com.ByteBrawlers.ByteBrawlers.DTO.CustomerDTO;
import com.ByteBrawlers.ByteBrawlers.Util.LoginMessage;
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
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("{customerId}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") int customerId) {
        CustomerDTO customerResponse = customerService.getCustomer(customerId);
        return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {
        this.customerService.createCustomer(customer);
        return "Creating customer...";
    }

    @PutMapping
    public String updateCustomer(@RequestBody Customer customer) {
        this.customerService.updateCustomer(customer);
        return "Updating customer...";
    }

    @DeleteMapping("{customerId}")
    public String deleteCustomer(@PathVariable("customerId") int customerId) {
        this.customerService.deleteCustomer(customerId);
        return "Deleting customer...";
    }

    @PostMapping(value = "/login")
    public ResponseEntity<?> customerLogin(@RequestBody LoginDTO loginDTO) {
        LoginMessage loginResponse = customerService.loginCustomer(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}

