
package com.jiuqi.jpa.repository;

import com.jiuqi.jpa.model.Message;

public interface MessageRepository {

	Iterable<Message> findAll();

	Message save(Message message);

	Message findMessage(Long id);

	void deleteMessage(Long id);

}
