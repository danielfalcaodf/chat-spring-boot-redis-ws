package com.chat.ws.dtos;

import com.chat.ws.events.EventType;

public record Event<T>(EventType type, T payload) {
}
