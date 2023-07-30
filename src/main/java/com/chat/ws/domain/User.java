package com.chat.ws.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public record User (String id, String name, String picture) {
}
