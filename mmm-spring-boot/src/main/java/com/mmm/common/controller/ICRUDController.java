package com.mmm.common.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ICRUDController<T, K> {

	@RequestMapping(method=RequestMethod.POST)
	public void create(T domain);
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public T findById(K id);
	
	@RequestMapping(method=RequestMethod.GET)
	public List<T> findAll();

	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public void update(T domain, K id);

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void delete(K id);
}
