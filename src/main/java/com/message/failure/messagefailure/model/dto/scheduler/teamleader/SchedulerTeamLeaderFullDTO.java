package com.message.failure.messagefailure.model.dto.scheduler.teamleader;

import com.message.failure.messagefailure.model.dto.productline.ProductLineLargeDTO;
import com.message.failure.messagefailure.model.dto.user.UserLargeDTO;

import java.time.LocalDateTime;

public class SchedulerTeamLeaderFullDTO {
    private long id;
    private LocalDateTime dateTimeWork;
    private int duration;
    private ProductLineLargeDTO productLine;
    private UserLargeDTO teamLeader;

    public SchedulerTeamLeaderFullDTO() {
    }

    public SchedulerTeamLeaderFullDTO(long id, LocalDateTime dateTimeWork, int duration, ProductLineLargeDTO productLine, UserLargeDTO teamLeader) {
        this.id = id;
        this.dateTimeWork = dateTimeWork;
        this.duration = duration;
        this.productLine = productLine;
        this.teamLeader = teamLeader;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDateTimeWork() {
        return dateTimeWork;
    }

    public void setDateTimeWork(LocalDateTime dateTimeWork) {
        this.dateTimeWork = dateTimeWork;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ProductLineLargeDTO getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLineLargeDTO productLine) {
        this.productLine = productLine;
    }

    public UserLargeDTO getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(UserLargeDTO teamLeader) {
        this.teamLeader = teamLeader;
    }
}