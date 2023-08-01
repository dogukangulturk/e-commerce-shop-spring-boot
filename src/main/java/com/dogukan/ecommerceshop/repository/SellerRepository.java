package com.dogukan.ecommerceshop.repository;

import com.dogukan.ecommerceshop.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends MongoRepository<Seller, String> {
}
