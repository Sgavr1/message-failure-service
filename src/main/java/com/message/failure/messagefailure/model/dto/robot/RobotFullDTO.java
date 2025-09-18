package com.message.failure.messagefailure.model.dto.robot;

import com.message.failure.messagefailure.model.dto.afo.AfoLargeDTO;

public class RobotFullDTO {
    private long id;
    private String name;
    private String state;
    private AfoLargeDTO afo;

    public RobotFullDTO() {
    }

    public RobotFullDTO(long id, String name, String state, AfoLargeDTO afo) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.afo = afo;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public AfoLargeDTO getAfo() {
        return afo;
    }

    public void setAfo(AfoLargeDTO afo) {
        this.afo = afo;
    }
}
