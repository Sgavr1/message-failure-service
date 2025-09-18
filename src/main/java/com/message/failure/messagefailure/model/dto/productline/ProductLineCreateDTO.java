package com.message.failure.messagefailure.model.dto.productline;

public class ProductLineCreateDTO {
    private String name;

    public ProductLineCreateDTO() {
    }

    public ProductLineCreateDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}