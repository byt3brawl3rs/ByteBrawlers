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
    @Column
    private Integer typeId;
    @Column
    private Integer colorId;
    @Column
    private Integer sizeId;
    @Column
    private Integer formFactorId;
    @Column(name = "price")
    private double price;
    @Column(name = "rating")
    private double rating;
    @OneToMany
    @JoinColumn()
    private List<Image> images;

    public Item() {
    }

    public Item(Integer id, String title, String description, Integer typeId, Integer colorId, Integer sizeId, Integer formFactorId, double price, double rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.typeId = typeId;
        this.colorId = colorId;
        this.sizeId = sizeId;
        this.formFactorId = formFactorId;
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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getFormFactorId() {
        return formFactorId;
    }

    public void setFormFactorId(Integer formFactorId) {
        this.formFactorId = formFactorId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", typeId=" + typeId +
                ", colorId=" + colorId +
                ", sizeId=" + sizeId +
                ", formFactorId=" + formFactorId +
                ", price=" + price +
                ", rating=" + rating +
                ", images=" + images +
                '}';
    }
}
