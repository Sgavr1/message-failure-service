package com.message.failure.messagefailure.model.dto.scheduler.teamleader;

import java.time.LocalDateTime;

public class SchedulerTeamLeaderCreateDTO {
    private LocalDateTime dateTimeWork;
    private int duration;
    private long productLineId;
    private long teamLeaderId;

    public SchedulerTeamLeaderCreateDTO() {
    }

    public SchedulerTeamLeaderCreateDTO(LocalDateTime dateTimeWork, int duration, long productLineId, long teamLeaderId) {
        this.dateTimeWork = dateTimeWork;
        this.duration = duration;
        this.productLineId = productLineId;
        this.teamLeaderId = teamLeaderId;
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

    public long getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(long productLineId) {
        this.productLineId = productLineId;
    }

    public long getTeamLeaderId() {
        return teamLeaderId;
    }

    public void setTeamLeaderId(long teamLeaderId) {
        this.teamLeaderId = teamLeaderId;
    }
}
