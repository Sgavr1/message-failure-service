package com.message.failure.messagefailure.controller;

import com.message.failure.messagefailure.model.entity.Robot;
import com.message.failure.messagefailure.service.RobotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RobotController {
    private final RobotService service;

    public RobotController(RobotService service){
        this.service = service;
    }

    @GetMapping("/robots")
    public List<Robot> getRobots(){
        return service.getRobots();
    }
}