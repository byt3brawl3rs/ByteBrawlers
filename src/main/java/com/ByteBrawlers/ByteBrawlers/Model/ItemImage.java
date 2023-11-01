package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

@Entity(name = "ItemImage")
@Table(name = "item_image")
public class ItemImage {

    @ManyToOne(fetch = FetchType.LAZY)
    private Item item;
    @Column(name = "image_path")
    private String imagePath;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer imageId;

    public ItemImage(String imagePath, Integer imageId) {
        this.imagePath = imagePath;
        this.imageId = imageId;
    }

    public ItemImage() {

    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "ItemImage{" +
                "imagePath='" + imagePath + '\'' +
                ", imageId=" + imageId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemImage)) return false;
        return imageId != null && imageId.equals(((ItemImage) o).getImageId());
    }
}
