package com.message.failure.messagefailure.model.dto.afo;

public class AfoUpdateDTO {
    private long id;
    private String name;
    private String status;
    private long productLineId;

    public AfoUpdateDTO() {
    }

    public AfoUpdateDTO(long id, String name, String status, long productLineId) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.productLineId = productLineId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(long productLineId) {
        this.productLineId = productLineId;
    }
}
