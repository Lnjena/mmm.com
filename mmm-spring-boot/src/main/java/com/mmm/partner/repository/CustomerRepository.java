package com.mmm.partner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mmm.partner.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{
	 
}
