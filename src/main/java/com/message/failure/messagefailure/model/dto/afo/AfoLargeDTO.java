package com.message.failure.messagefailure.model.dto.afo;

public class AfoLargeDTO {
    private long id;
    private String name;
    private String status;

    public AfoLargeDTO() {
    }

    public AfoLargeDTO(long id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
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
}
