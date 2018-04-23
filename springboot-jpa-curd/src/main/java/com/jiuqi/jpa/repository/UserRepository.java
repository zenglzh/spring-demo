/*
 * @(#)UserRepository.java  
 */
package com.jiuqi.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiuqi.jpa.entity.User;

/**
 * <p>
 * Title:
 * </p>
 * 
 * @author: zenglizhi
 * @date: 2018/04/20
 * @version: v1.0
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
