package com.mmm.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mmm.product.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
