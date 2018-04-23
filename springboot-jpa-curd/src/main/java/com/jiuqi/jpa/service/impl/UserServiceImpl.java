/*
 * @(#)UserServiceImpl.java  
 */
package com.jiuqi.jpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiuqi.jpa.entity.User;
import com.jiuqi.jpa.repository.UserRepository;
import com.jiuqi.jpa.service.UserService;

/**
 *<p>Title:</p>
 * @author: zenglizhi
 * @date: 2018/04/19
 * @version: v1.0
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getUserList() {
		return userRepository.findAll();
	}

	@Override
	public User findUserById(long id) {
		Optional<User> ouser = userRepository.findById(id);
		return ouser.get();
	}

	@Override
	public void save(User user) {
		 userRepository.save(user);
	}

	@Override
	public void edit(User user) {
		userRepository.save(user);
	}

	@Override
	public void delete(long id) {
		userRepository.deleteById(id);
	}

}
