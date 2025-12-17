package com.practice.chat.classes;

import java.time.LocalDateTime;

public class ChatMessage {
    private String from;
    private String content;
    private LocalDateTime timestamp;

    public ChatMessage(String from, String content, LocalDateTime timestamp) {
        this.from = from;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
