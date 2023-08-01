package com.dogukan.ecommerceshop.repository;

import com.dogukan.ecommerceshop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}