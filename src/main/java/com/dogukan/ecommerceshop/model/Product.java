package com.dogukan.ecommerceshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private double rating;
    private List<String> categoryIds;
    private List<Review> productReviews;

    public Product() {
    }

    public Product(String name, String description, double price, double rating, List<String> categoryIds, List<Review> productReviews) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.categoryIds = categoryIds;
        this.productReviews = productReviews;
    }

    public Product(String id, String name, String description, double price, double rating, List<String> categoryIds, List<Review> productReviews) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.categoryIds = categoryIds;
        this.productReviews = productReviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<String> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public List<Review> getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(List<Review> productReviews) {
        this.productReviews = productReviews;
    }
}
