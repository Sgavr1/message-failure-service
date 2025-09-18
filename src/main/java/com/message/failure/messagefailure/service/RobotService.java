package com.message.failure.messagefailure.service;


import com.message.failure.messagefailure.model.mapper.RobotMapper;
import com.message.failure.messagefailure.repository.RobotRepository;
import org.springframework.stereotype.Service;

@Service
public class RobotService {
    private final RobotRepository repository;
    private final RobotMapper mapper;

    public RobotService(RobotRepository repository, RobotMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
