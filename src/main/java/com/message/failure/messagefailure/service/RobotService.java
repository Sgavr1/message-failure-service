package com.message.failure.messagefailure.service;


import com.message.failure.messagefailure.model.entity.Robot;
import com.message.failure.messagefailure.repository.RobotRepository;
import com.message.failure.messagefailure.repository.implemets.RobotRepositoryImplements;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RobotService {
    private final RobotRepository repository;

    public RobotService(){
        repository = new RobotRepositoryImplements();
    }

    public List<Robot> getRobots(){
        return repository.getRobots();
    }

    public Robot addRobot(Robot robot){
        return repository.create(robot);
    }

    public Robot update(Robot robot){
        return repository.update(robot);
    }
}
