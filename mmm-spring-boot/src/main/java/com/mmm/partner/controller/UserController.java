package com.mmm.partner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmm.common.controller.ICRUDController;
import com.mmm.partner.domain.User;
import com.mmm.partner.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController implements ICRUDController<User, String> {

	@Autowired
	private UserRepository userRepository;

	public void create(@RequestBody User user) {
		userRepository.save(user);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(@PathVariable String id) {
		return userRepository.findOne(id);
	}

	public void update(@RequestBody User user, @PathVariable String id) {
		user.setUserId(id);
		userRepository.save(user);
	}

	public void delete(@PathVariable String id) {
		userRepository.delete(id);
	}
}
