/*
 * @(#)JpaApplication.java  
 */
package com.jiuqi.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;

import com.jiuqi.jpa.model.Message;
import com.jiuqi.jpa.repository.InMemoryMessageRepository;
import com.jiuqi.jpa.repository.MessageRepository;

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
	@Bean
	public MessageRepository messageRepository() {
		return new InMemoryMessageRepository();
	}
	@Bean
	public Converter<String, Message> messageConverter() {
		return new Converter<String, Message>() {
			@Override
			public Message convert(String id) {
				return messageRepository().findMessage(Long.valueOf(id));
			}
		};
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JpaApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

}
