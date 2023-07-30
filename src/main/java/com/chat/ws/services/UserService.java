package com.chat.ws.services;

import com.chat.ws.domain.User;
import com.chat.ws.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findChatUsers(){
        return userRepository.findAll();
    }
}
