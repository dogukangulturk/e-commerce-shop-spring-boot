package com.dogukan.ecommerceshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "favoritelists")
public class FavoriteList {
    @Id
    private String id;
    private String customerId;
    private String listName;
    private List<String> productIds;
}