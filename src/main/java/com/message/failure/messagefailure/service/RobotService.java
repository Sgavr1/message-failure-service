package com.message.failure.messagefailure.service;


import com.message.failure.messagefailure.model.dto.robot.RobotCreateDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotFullDto;
import com.message.failure.messagefailure.model.dto.robot.RobotUpdateDTO;
import com.message.failure.messagefailure.model.entity.Robot;
import com.message.failure.messagefailure.model.mapper.RobotMapper;
import com.message.failure.messagefailure.repository.RobotRepository;
import com.message.failure.messagefailure.repository.implemets.RobotRepositoryImplements;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RobotService {
    private final RobotRepository repository;
    private final RobotMapper mapper;

    public RobotService(RobotMapper mapper){
        this.mapper = mapper;
        repository = new RobotRepositoryImplements();
    }

    public List<Robot> getRobots(){
        return repository.getRobots();
    }

    public RobotFullDto create(RobotCreateDTO robot){
        return mapper.getFullDto(repository.create(mapper.getEntity(robot)));
    }

    public RobotFullDto update(RobotUpdateDTO robot){
        return mapper.getFullDto(repository.update(mapper.getEntity(robot)));
    }
}
