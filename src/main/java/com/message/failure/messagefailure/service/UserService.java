package com.message.failure.messagefailure.service;

import com.message.failure.messagefailure.model.mapper.UserMapper;
import com.message.failure.messagefailure.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    public UserService(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
