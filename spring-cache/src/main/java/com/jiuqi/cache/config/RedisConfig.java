/*
 * @(#)RedisConfig.java  
 */
package com.jiuqi.cache.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext.SerializationPair;

import com.google.common.cache.Cache;

/**
 * <p>
 * Title:
 * </p>
 * 
 * @author: zenglizhi
 * @date: 2018/04/20
 * @version: v1.0
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
	
	@Autowired
	private RedisConnectionFactory connectionFactory;
	
	@Bean
	public RedisCacheManager redisCacheManager(){
		RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig();
		redisCacheConfiguration = redisCacheConfiguration.serializeValuesWith(SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
		return RedisCacheManager.builder(connectionFactory).cacheDefaults(redisCacheConfiguration).build();
	}
	
	@Bean
	@Primary
	public CaffeineCacheManager caffeineCacheManager(){
		return new CaffeineCacheManager();
	}
	
	@Bean("userCache")
	public Cache userCache(@Autowired CacheManager cacheManager){
		return cacheManager.getCache("user");
	}
	
	@Bean("userRedisCache")
	public Cache userRedisCache(@Autowired @Qualifier("redisCacheManager") CacheManager cacheManager){
		return cacheManager.getCache("user");
	}
}
