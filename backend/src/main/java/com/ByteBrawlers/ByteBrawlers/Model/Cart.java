package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Customer customer;

    @OneToMany
    private List<CartDetails> cartDetails;

    public Cart() {
    }

    public Cart(Integer id, Customer customer, List<CartDetails> cartDetails) {
        this.id = id;
        this.customer = customer;
        this.cartDetails = cartDetails;
    }

    public List<CartDetails> getCartDetails() {
        return cartDetails;
    }

    public void setCartDetails(List<CartDetails> cartDetails) {
        this.cartDetails = cartDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", customer=" + customer +
                ", cartDetails=" + cartDetails +
                '}';
    }
}
