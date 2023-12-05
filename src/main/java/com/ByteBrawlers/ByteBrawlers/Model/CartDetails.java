package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CartDetails {

    @Id
    private Integer id;

    @OneToMany
    private List<Item> items;

    @Column
    private Integer quantity;

    public CartDetails() {

    }

    public CartDetails(Integer id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartDetails{" +
                "id=" + id +
                ", items=" + items +
                ", quantity=" + quantity +
                '}';
    }
}
