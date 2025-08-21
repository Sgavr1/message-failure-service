package com.message.failure.messagefailure.controller;

import com.message.failure.messagefailure.model.dto.robot.RobotCreateDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotFullDto;
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
        return service.getRobots();
    }
    @PostMapping("/robot")
    public RobotFullDto addRobot(@RequestBody RobotCreateDTO dto){
        return service.create(dto);
    }
    @PutMapping("/robot")
    public RobotFullDto updateRobot(@RequestBody RobotUpdateDTO dto){
        return service.update(dto);
    }
}