package com.mmm.partner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mmm.partner.domain.Customer;
//@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long>{
	 
}
