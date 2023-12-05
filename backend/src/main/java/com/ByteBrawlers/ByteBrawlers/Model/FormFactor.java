package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class FormFactor {
    @Id
    private Integer id;

    @Column
    private String formFactor;

    public FormFactor() {
    }

    public FormFactor(Integer id, String formFactor) {
        this.id = id;
        this.formFactor = formFactor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "FormFactor{" +
                "id=" + id +
                ", formFactor='" + formFactor + '\'' +
                '}';
    }
}
