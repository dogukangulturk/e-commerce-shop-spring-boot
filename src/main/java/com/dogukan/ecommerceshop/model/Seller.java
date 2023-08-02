package com.dogukan.ecommerceshop.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.PostLoad;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "sellers")
public class Seller {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String address;
    private String phone;
    private List<Product> products;
    private List<Order> previousSales;
    private double rating;

    @PostLoad
    public void calculateRating() {
        if (products != null && !products.isEmpty()) {
            double totalRating = 0.0;
            for (Product product : products) {
                totalRating += product.getRating();
            }
            rating = totalRating / products.size();
        } else {
            rating = 0.0;
        }
    }

    public Seller() {
    }

    public Seller(String username, String password, String name, String email, String address, String phone, List<Product> products, List<Order> previousSales, double rating) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.products = products;
        this.previousSales = previousSales;
        this.rating = rating;
    }

    public Seller(String id, String username, String password, String name, String email, String address, String phone, List<Product> products, List<Order> previousSales, double rating) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.products = products;
        this.previousSales = previousSales;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Order> getPreviousSales() {
        return previousSales;
    }

    public void setPreviousSales(List<Order> previousSales) {
        this.previousSales = previousSales;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
