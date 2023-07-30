package com.chat.ws.dtos;

import com.chat.ws.domain.User;

public record ChatMessage(User from, User to, String text) {
}
