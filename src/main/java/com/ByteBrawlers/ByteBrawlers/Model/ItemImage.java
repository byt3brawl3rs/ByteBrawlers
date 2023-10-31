package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

@Entity
@Table
public class ItemImage {
    @Column
    private int itemId;
    @Column
    private String imagePath;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    public ItemImage(int itemId, String imagePath, int imageId) {
        this.itemId = itemId;
        this.imagePath = imagePath;
        this.imageId = imageId;
    }

    ItemImage() {

    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "ItemImage{" +
                "itemId=" + itemId +
                ", imagePath='" + imagePath + '\'' +
                ", imageId=" + imageId +
                '}';
    }
}
