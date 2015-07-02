package com.mmm.partner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmm.common.controller.ICRUDController;
import com.mmm.partner.domain.Supplier;
import com.mmm.partner.repository.SupplierRepository;

@RestController
@RequestMapping(value = "/supplier")
public class SupplierController implements ICRUDController<Supplier, String> {

	@Autowired
	private SupplierRepository supplierRepository;

	public void create(@RequestBody Supplier supplier) {
		supplierRepository.save(supplier);
	}

	public List<Supplier> findAll() {
		return supplierRepository.findAll();
	}

	public Supplier findById(@PathVariable String id) {
		return supplierRepository.findOne(id);
	}

	public void update(@RequestBody Supplier supplier, @PathVariable String id) {
		supplier.setSupplierId(id);
		supplierRepository.save(supplier);
	}

	public void delete(@PathVariable String id) {
		supplierRepository.delete(id);
	}
}
