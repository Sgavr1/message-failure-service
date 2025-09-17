package com.message.failure.messagefailure.controller;

import com.message.failure.messagefailure.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }
}