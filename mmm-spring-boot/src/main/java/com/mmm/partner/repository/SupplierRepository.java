package com.mmm.partner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mmm.partner.domain.Supplier;

public interface SupplierRepository extends MongoRepository<Supplier, String>{
	 
}
