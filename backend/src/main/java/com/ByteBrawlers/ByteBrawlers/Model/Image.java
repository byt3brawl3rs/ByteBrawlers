package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

@Entity(name = "Image")
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "path")
    private String path;

    @Column(name = "item_id")
    private Integer itemId;

    public Image(Integer id, String path, Integer itemId) {
        this.id = id;
        this.path = path;
        this.itemId = itemId;
    }

    public Image() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getImagePath() {
        return path;
    }

    public void setImagePath(String path) {
        this.path = path;
    }

    public Integer getImageId() {
        return id;
    }

    public void setImageId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", itemId=" + itemId +
                '}';
    }
}
