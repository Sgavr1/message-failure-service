package com.message.failure.messagefailure.model.dto.breakdowntype;

public class BreakdownTypeCreateDTO {
    private String name;
    private long afoId;

    public BreakdownTypeCreateDTO() {
    }

    public BreakdownTypeCreateDTO(String name, long afoId) {
        this.name = name;
        this.afoId = afoId;
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