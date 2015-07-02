package com.mmm.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmm.common.domain.Zone;
import com.mmm.common.repository.ZoneRepository;

@RestController
@RequestMapping(value = "/zone")
public class ZoneController implements ICRUDController<Zone, String> {

	@Autowired
	private ZoneRepository zoneRepository;

	@RequestMapping
	public void create(@RequestBody Zone zone) {
		zoneRepository.save(zone);
	}

	public Zone findById(@PathVariable String id) {
		return zoneRepository.findOne(id);
	}

	public List<Zone> findAll() {
		return zoneRepository.findAll();
	}

	public void update(@RequestBody Zone zone, @PathVariable String id) {
		zone.setZoneId(id);
		zoneRepository.save(zone);
	}

	public void delete(@PathVariable String id) {
		zoneRepository.delete(id);
	}
}
