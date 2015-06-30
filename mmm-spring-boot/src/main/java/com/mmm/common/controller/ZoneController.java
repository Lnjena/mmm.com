package com.mmm.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mmm.common.domain.Zone;
import com.mmm.common.repository.ZoneRepository;

@RestController
public class ZoneController implements ICRUDController<Zone, String> {

	@Autowired
	private ZoneRepository zoneRepository;
	
	public void create(Zone domain) {
		// TODO Auto-generated method stub
	}

	
	public Zone findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Zone> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void update(Zone domain, String id) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
