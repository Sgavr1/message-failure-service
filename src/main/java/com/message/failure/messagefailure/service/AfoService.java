package com.message.failure.messagefailure.service;

import com.message.failure.messagefailure.model.mapper.AfoMapper;
import com.message.failure.messagefailure.repository.AFORepository;
import org.springframework.stereotype.Service;

@Service
public class AfoService {
    private final AFORepository repository;
    private final AfoMapper mapper;

    public AfoService(AFORepository repository, AfoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}