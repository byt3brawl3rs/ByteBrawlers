package com.ByteBrawlers.ByteBrawlers.Repository;

import com.ByteBrawlers.ByteBrawlers.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findCustomerByUsernameAndPassword(String username, String password);

    Customer findCustomerByUsername(String username);

}
