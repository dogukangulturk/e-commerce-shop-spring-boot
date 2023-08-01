package com.dogukan.ecommerceshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "customers")
public class Customer {

        @Id
        private String id;
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private List<Order> previousOrders;
        private List<Review> productReviews;
        private List<FavoriteList> favoriteLists;

    public Customer(String id, String firstName, String lastName, String email, String address, String phone,
                    List<Order> previousOrders, List<Review> productReviews, List<FavoriteList> favoriteLists) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.previousOrders = previousOrders;
        this.productReviews = productReviews;
        this.favoriteLists = favoriteLists;
    }

    public Customer(String firstName, String lastName, String email, String address, String phone,
                    List<Order> previousOrders, List<Review> productReviews, List<FavoriteList> favoriteLists) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.previousOrders = previousOrders;
        this.productReviews = productReviews;
        this.favoriteLists = favoriteLists;
    }

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Order> getPreviousOrders() {
        return previousOrders;
    }

    public void setPreviousOrders(List<Order> previousOrders) {
        this.previousOrders = previousOrders;
    }

    public List<Review> getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(List<Review> productReviews) {
        this.productReviews = productReviews;
    }

    public List<FavoriteList> getFavoriteLists() {
        return favoriteLists;
    }

    public void setFavoriteLists(List<FavoriteList> favoriteLists) {
        this.favoriteLists = favoriteLists;
    }
}
