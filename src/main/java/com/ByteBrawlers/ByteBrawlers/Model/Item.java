package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Item")
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "rating")
    private double rating;

    @OneToMany
    @JoinColumn()
    private List<Image> images;

    public Item() {
    }

    public Item(Integer id, String title, String description, double price, double rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.rating = rating;
    }

    public Integer getItemID() {
        return id;
    }

    public void setItemID(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
