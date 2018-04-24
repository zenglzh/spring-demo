/*
 * @(#)UserRestController.java  
 */
package com.jiuqi.jpa.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jiuqi.jpa.entity.User;
import com.jiuqi.jpa.service.UserService;

/**
 *<p>Title:</p>
 * @author: zenglizhi
 * @date: 2018/04/24
 * @version: v1.0
 */
@RestController
public class UserRestController {
	@Resource
	UserService userService;
	
	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
	public User findOneuser(@PathVariable("id") Long id) {
		return userService.findUserById(id);
	}

	@RequestMapping(value = "/api/user", method = RequestMethod.GET)
	public List<User> findAlluser() {
		return userService.getUserList();
	}

	@RequestMapping(value = "/api/user", method = RequestMethod.POST)
	public void createuser(@RequestBody User user) {
		userService.save(user);
	}

	@RequestMapping(value = "/api/user", method = RequestMethod.PUT)
	public void modifyuser(@RequestBody User user) {
		userService.save(user);
	}

	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.DELETE)
	public void modifyuser(@PathVariable("id") Long id) {
		userService.delete(id);
	}
}
