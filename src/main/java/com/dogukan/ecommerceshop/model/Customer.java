package com.dogukan.ecommerceshop.model;

import jakarta.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Document(collection = "customers")
public class Customer {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private MultipartFile profilePhoto;
    private List<Order> previousOrders;
    private List<Review> productReviews;
    private List<FavoriteList> favoriteLists;

    public Customer(String id, String username, String password, String firstName, String lastName, String email, String address, String phone,
                    MultipartFile profilePhoto, List<Order> previousOrders, List<Review> productReviews, List<FavoriteList> favoriteLists) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.profilePhoto = profilePhoto;
        this.previousOrders = previousOrders;
        this.productReviews = productReviews;
        this.favoriteLists = favoriteLists;
    }

    public Customer(String username, String password, String firstName, String lastName, String email, String address, String phone,
                    MultipartFile profilePhoto, List<Order> previousOrders, List<Review> productReviews, List<FavoriteList> favoriteLists) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.profilePhoto = profilePhoto;
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

    public MultipartFile getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(MultipartFile profilePhoto) {
        this.profilePhoto = profilePhoto;
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
