/*
 * @(#)JpaApplication.java  
 */
package com.jiuqi.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>
 * Title:
 * </p>
 * 
 * @author: zenglizhi
 * @date: 2018/04/19
 * @version: v1.0
 */
@SpringBootApplication
public class JpaApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JpaApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

}
