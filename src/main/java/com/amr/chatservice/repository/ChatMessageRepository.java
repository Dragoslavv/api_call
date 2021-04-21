package com.amr.chatservice.repository;

import com.amr.chatservice.model.ChatMessage;
import com.amr.chatservice.model.MessageStatus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChatMessageRepository
        extends CrudRepository<ChatMessage, Long> {

    long countBySenderIdAndRecipientIdAndStatus(
            String senderId, String recipientId, MessageStatus status);

    List<ChatMessage> findByChatId(String chatId);
}