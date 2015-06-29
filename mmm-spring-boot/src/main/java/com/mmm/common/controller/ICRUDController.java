package com.mmm.common.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ICRUDController<T, K> {

	@RequestMapping(method=RequestMethod.POST)
	public void create(T domain);

	//public T findById(K id);
	@RequestMapping(method=RequestMethod.GET)
	public List<T> findAll();

	/*public void update(T domain, K id);

	public void delete(K id);
*/}
