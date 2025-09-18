package com.message.failure.messagefailure.model.dto.breakdowntype;

public class BreakdownTypeUpdateDTO {
    private long id;
    private String name;
    private long afoId;

    public BreakdownTypeUpdateDTO() {
    }

    public BreakdownTypeUpdateDTO(long id, String name, long afoId) {
        this.id = id;
        this.name = name;
        this.afoId = afoId;
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

    public long getAfoId() {
        return afoId;
    }

    public void setAfoId(long afoId) {
        this.afoId = afoId;
    }
}