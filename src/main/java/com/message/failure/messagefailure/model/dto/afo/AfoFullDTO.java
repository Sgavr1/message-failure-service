package com.message.failure.messagefailure.model.dto.afo;

import com.message.failure.messagefailure.model.dto.productline.ProductLineLargeDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotLargeDTO;

import java.util.List;

public class AfoFullDTO {
    private long id;
    private String name;
    private String status;
    private ProductLineLargeDTO productLine;
    private List<RobotLargeDTO> robots;

    public AfoFullDTO() {
    }

    public AfoFullDTO(long id, String name, String status, ProductLineLargeDTO productLine, List<RobotLargeDTO> robots) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.productLine = productLine;
        this.robots = robots;
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

    public ProductLineLargeDTO getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLineLargeDTO productLine) {
        this.productLine = productLine;
    }

    public List<RobotLargeDTO> getRobots() {
        return robots;
    }

    public void setRobots(List<RobotLargeDTO> robots) {
        this.robots = robots;
    }
}