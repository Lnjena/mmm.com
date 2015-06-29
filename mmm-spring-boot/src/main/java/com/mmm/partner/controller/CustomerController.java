package com.mmm.partner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmm.common.controller.ICRUDController;
import com.mmm.partner.domain.Customer;
import com.mmm.partner.repository.CustomerRepository;

@RestController
@RequestMapping(value="/customer")
public class CustomerController implements ICRUDController<Customer, String> {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void create(@RequestBody Customer customer){
		customerRepository.save(customer);
	}

	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
