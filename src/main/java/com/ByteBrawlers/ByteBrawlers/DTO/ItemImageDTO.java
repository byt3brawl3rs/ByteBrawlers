package com.ByteBrawlers.ByteBrawlers.DTO;

import com.ByteBrawlers.ByteBrawlers.Model.Item;

public class ItemImageDTO {
    private Item item;
    private String imagePath;
    private Integer imageId;

    public ItemImageDTO(Item item, String imagePath, Integer imageId) {
        this.item = item;
        this.imagePath = imagePath;
        this.imageId = imageId;
    }

    public ItemImageDTO() {
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
        return "ItemImageDTO{" +
                "imagePath='" + imagePath + '\'' +
                ", imageId=" + imageId +
                '}';
    }
}
