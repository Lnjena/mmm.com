package com.mmm.common.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mmm.common.domain.Zone;


public interface ZoneRepository extends MongoRepository<Zone, String> {

}
