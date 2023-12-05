package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Size {
    @Id
    private Integer id;

    @Column
    private String size;

    public Size() {
    }

    public Size(Integer id, String size) {
        this.id = id;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Size{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }
}
