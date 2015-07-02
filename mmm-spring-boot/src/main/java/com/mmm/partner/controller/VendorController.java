package com.mmm.partner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmm.common.controller.ICRUDController;
import com.mmm.partner.domain.Vendor;
import com.mmm.partner.repository.VendorRepository;

@RestController
@RequestMapping(value = "/vendor")
public class VendorController implements ICRUDController<Vendor, String> {

	@Autowired
	private VendorRepository vendorRepository;

	public void create(@RequestBody Vendor vendor) {
		vendorRepository.save(vendor);
	}

	public List<Vendor> findAll() {
		return vendorRepository.findAll();
	}

	public Vendor findById(@PathVariable String id) {
		return vendorRepository.findOne(id);
	}

	public void update(@RequestBody Vendor vendor, @PathVariable String id) {
		vendor.setVendorId(id);
		vendorRepository.save(vendor);
	}

	public void delete(@PathVariable String id) {
		vendorRepository.delete(id);
	}
}
