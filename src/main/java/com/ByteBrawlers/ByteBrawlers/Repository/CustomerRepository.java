package com.ByteBrawlers.ByteBrawlers.Repository;

import com.ByteBrawlers.ByteBrawlers.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
