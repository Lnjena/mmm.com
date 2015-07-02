package com.mmm.partner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mmm.partner.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	 
}
