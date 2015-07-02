package com.mmm.partner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mmm.partner.domain.Vendor;

public interface VendorRepository extends MongoRepository<Vendor, String>{
	 
}
