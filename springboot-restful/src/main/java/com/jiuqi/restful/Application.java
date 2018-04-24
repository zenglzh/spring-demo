/*
 * @(#)Application.java  
 */
package com.jiuqi.restful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *<p>Title:</p>
 * @author: zenglizhi
 * @date: 2018/04/23
 * @version: v1.0
 */
@SpringBootApplication
@MapperScan("com.jiuqi.restful.dao")
public class Application {
	public static void main(String[] args) {
		  SpringApplication.run(Application.class,args);
	}

}
