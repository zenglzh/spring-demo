/*
 * @(#)UserService.java  
 */
package com.jiuqi.jpa.service;

import java.util.List;

import com.jiuqi.jpa.entity.User;

/**
 * <p>
 * Title:
 * </p>
 * 
 * @author: zenglizhi
 * @date: 2018/04/19
 * @version: v1.0
 */
public interface UserService {
	
	public List<User> getUserList();

	public User findUserById(long id);

	public void save(User user);

	public void edit(User user);

	public void delete(long id);

}
