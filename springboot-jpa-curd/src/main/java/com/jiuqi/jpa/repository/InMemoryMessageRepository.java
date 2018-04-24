/*
 * @(#)InMemoryMessageRepository.java  
 */
package com.jiuqi.jpa.repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import com.jiuqi.jpa.model.Message;

/**
 *<p>Title:</p>
 * @author: zenglizhi
 * @date: 2018/04/23
 * @version: v1.0
 */
public class InMemoryMessageRepository implements MessageRepository {
	private static AtomicLong counter = new AtomicLong();

	private final ConcurrentMap<Long, Message> messages = new ConcurrentHashMap<>();
	@Override
	public Iterable<Message> findAll() {
		return messages.values();
	}

	@Override
	public Message save(Message message) {
		Long id = message.getId();
		if (id == null) {
			id = counter.incrementAndGet();
			message.setId(id);
		}
		this.messages.put(id, message);
		return message;
	}

	@Override
	public Message findMessage(Long id) {
		return this.messages.get(id);
	}

	@Override
	public void deleteMessage(Long id) {
		this.messages.remove(id);
	}


}
