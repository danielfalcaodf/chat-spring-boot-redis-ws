package com.chat.ws.providers;

import java.util.Map;

public interface TokenProvider {
    Map<String, String> decode(String token);
}
