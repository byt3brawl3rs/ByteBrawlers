package com.ByteBrawlers.ByteBrawlers.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String username;

    //@Column
    //@Nullable
    //private Date dateOfBirth;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, String password, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerID(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //public Date getDateOfBirth() {
    //    return dateOfBirth;
    //}

    //public void setDateOfBirth(Date dateOfBirth) {
    //    this.dateOfBirth = dateOfBirth;
    //}

    public String toString() {
        return String.format("Customer ID: %d\nFirst Name: %s\nLast Name: %s\nEmail: %s\n Password: %s\nUsername: %s",
                customerId, firstName, lastName, email, password, username);
    }

}
