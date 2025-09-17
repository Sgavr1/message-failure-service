package com.message.failure.messagefailure.service;

import com.message.failure.messagefailure.model.mapper.ProductLineMapper;
import com.message.failure.messagefailure.repository.ProductLineRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductLineService {
    private final ProductLineRepository repository;
    private final ProductLineMapper mapper;

    public ProductLineService(ProductLineRepository repository, ProductLineMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}