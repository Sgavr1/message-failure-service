package com.message.failure.messagefailure.model.dto.scheduler.operator;

import java.time.LocalDateTime;

public class SchedulerOperatorLargeDTO {
    private long id;
    private LocalDateTime dateTimeWork;
    private int duration;

    public SchedulerOperatorLargeDTO() {
    }

    public SchedulerOperatorLargeDTO(long id, LocalDateTime dateTimeWork, int duration) {
        this.id = id;
        this.dateTimeWork = dateTimeWork;
        this.duration = duration;
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
}
