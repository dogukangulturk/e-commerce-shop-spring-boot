package com.dogukan.ecommerceshop.repository;

import com.dogukan.ecommerceshop.model.FavoriteList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteListRepository extends MongoRepository<FavoriteList, String> {
}