package com.message.failure.messagefailure.controller;

import com.message.failure.messagefailure.model.dto.robot.RobotCreateDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotFullDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotUpdateDTO;
import com.message.failure.messagefailure.model.entity.Robot;
import com.message.failure.messagefailure.service.RobotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RobotController {
    private final RobotService service;

    public RobotController(RobotService service){
        this.service = service;
    }

    @GetMapping("/robots")
    public List<Robot> getRobots(){
        return null;
    }
    @PostMapping("/robot")
    public RobotFullDTO addRobot(@RequestBody RobotCreateDTO dto){
        return null;
    }
    @PutMapping("/robot")
    public RobotFullDTO updateRobot(@RequestBody RobotUpdateDTO dto){
        return null;
    }
}