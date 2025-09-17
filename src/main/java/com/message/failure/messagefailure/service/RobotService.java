package com.message.failure.messagefailure.service;


import com.message.failure.messagefailure.model.dto.robot.RobotCreateDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotFullDto;
import com.message.failure.messagefailure.model.dto.robot.RobotUpdateDTO;
import com.message.failure.messagefailure.model.entity.Robot;
import com.message.failure.messagefailure.model.mapper.RobotMapper;
import com.message.failure.messagefailure.repository.RobotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RobotService {
    private final RobotRepository repository;
    private final RobotMapper mapper;

    public RobotService(RobotRepository repository, RobotMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
