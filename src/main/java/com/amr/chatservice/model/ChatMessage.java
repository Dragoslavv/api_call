package com.amr.chatservice.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ChatMessage {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(nullable = false)
   private String chatId;
   @Column(nullable = false)
   private String senderId;
   @Column(nullable = false)
   private String recipientId;
   @Column(nullable = false)
   private String senderName;
   @Column(nullable = false)
   private String recipientName;
   @Column(nullable = false)
   private String content;
   @CreationTimestamp
   private Date timestamp;
   @Column(nullable = false)
   private MessageStatus status;
}
