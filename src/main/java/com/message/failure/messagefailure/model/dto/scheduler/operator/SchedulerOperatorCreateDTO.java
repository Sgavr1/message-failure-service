package com.message.failure.messagefailure.model.dto.scheduler.operator;

import java.time.LocalDateTime;

public class SchedulerOperatorCreateDTO {
    private LocalDateTime dateTimeWork;
    private int duration;
    private long afoId;
    private long operatorId;

    public SchedulerOperatorCreateDTO() {
    }

    public SchedulerOperatorCreateDTO(LocalDateTime dateTimeWork, int duration, long afoId, long operatorId) {
        this.dateTimeWork = dateTimeWork;
        this.duration = duration;
        this.afoId = afoId;
        this.operatorId = operatorId;
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

    public long getAfoId() {
        return afoId;
    }

    public void setAfoId(long afoId) {
        this.afoId = afoId;
    }

    public long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(long operatorId) {
        this.operatorId = operatorId;
    }
}
