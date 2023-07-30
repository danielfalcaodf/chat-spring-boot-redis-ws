package com.chat.ws.pubsub;

import com.chat.ws.providers.TokenProvider;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class PublisherTest {
    @Autowired
    private Publisher publisher;

    // @Test
    // void publishChatMessage() {
    // try {
    // publisher.publishChatMessage("123", "124", "Teste");
    // } catch (JsonProcessingException e) {
    // throw new RuntimeException(e);
    // }
    // }
}