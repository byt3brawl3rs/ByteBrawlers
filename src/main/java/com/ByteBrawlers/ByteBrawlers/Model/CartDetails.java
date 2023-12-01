package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CartDetails {

    @Id
    private Integer id;

    @OneToMany
    private List<Item> items;

    public CartDetails() {

    }

    public CartDetails(Integer id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CartDetails{" +
                "id=" + id +
                ", items=" + items +
                '}';
    }
}
