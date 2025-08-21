package com.message.failure.messagefailure.model.dto.robot;

public class RobotCreateDTO {
    private String name;
    private String state;
    private int productLineId;
    private int afoId;

    public RobotCreateDTO() {
    }

    public RobotCreateDTO(String name, String state, int productLineId, int afoId) {
        this.name = name;
        this.state = state;
        this.productLineId = productLineId;
        this.afoId = afoId;
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

    public int getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(int productLineId) {
        this.productLineId = productLineId;
    }

    public int getAfoId() {
        return afoId;
    }

    public void setAfoId(int afoId) {
        this.afoId = afoId;
    }
}
