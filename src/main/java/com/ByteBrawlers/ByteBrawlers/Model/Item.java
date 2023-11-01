package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Item")
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer itemID;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "rating")
    private double rating;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemImage> images = new ArrayList<>();

    public Item() {
    }


    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
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

    public List<ItemImage> getImages() {
        return images;
    }

    public void setImages(List<ItemImage> images) {
        this.images = images;
    }

    public void addImage(ItemImage image) {
        images.add(image);
        image.setItem(this);
    }

    public void removeImage(ItemImage image) {
        images.remove(image);
        image.setItem(null);
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", images=" + images +
                '}';
    }
}
