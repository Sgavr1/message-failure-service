package com.message.failure.messagefailure.controller;

import com.message.failure.messagefailure.service.ProductLineService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductLineController {
    private final ProductLineService service;

    public ProductLineController(ProductLineService service) {
        this.service = service;
    }
}
