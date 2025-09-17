package com.message.failure.messagefailure.controller;

import com.message.failure.messagefailure.service.AfoService;
import org.springframework.stereotype.Controller;

@Controller
public class AfoController {
    private final AfoService service;

    public AfoController(AfoService service) {
        this.service = service;
    }
}