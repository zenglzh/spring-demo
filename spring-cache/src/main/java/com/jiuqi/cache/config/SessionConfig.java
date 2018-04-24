/*
 * @(#)SessionConfig.java  
 */
package com.jiuqi.cache.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 *<p>Title:</p>
 * @author: zenglizhi
 * @date: 2018/04/20
 * @version: v1.0
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class SessionConfig {

}
