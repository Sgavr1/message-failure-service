package com.message.failure.messagefailure.model.dto.afo;

public class AfoCreateDTO {
    private String name;
    private long productLineId;

    public AfoCreateDTO() {
    }

    public AfoCreateDTO(String name, long productLineId) {
        this.name = name;
        this.productLineId = productLineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(long productLineId) {
        this.productLineId = productLineId;
    }
}
