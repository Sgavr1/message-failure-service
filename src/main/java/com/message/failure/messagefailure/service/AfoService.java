package com.message.failure.messagefailure.service;

import com.message.failure.messagefailure.model.mapper.AfoMapper;
import com.message.failure.messagefailure.repository.AfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AfoService {
    private final AfoRepository repository;
    private final AfoMapper mapper;
}