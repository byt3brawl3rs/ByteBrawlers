package com.ByteBrawlers.ByteBrawlers.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Reviews {

    @Id
    private Integer id;

    @OneToMany
    private List<String> reviews;

    public Reviews() {

    }

    public Reviews(Integer id, List<String> reviews) {
        this.id = id;
        this.reviews = reviews;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", reviews=" + reviews +
                '}';
    }
}
