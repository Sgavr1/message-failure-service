package com.message.failure.messagefailure.model.dto.scheduler.operator;

import com.message.failure.messagefailure.model.dto.afo.AfoLargeDTO;
import com.message.failure.messagefailure.model.dto.user.UserLargeDTO;

import java.time.LocalDateTime;

public class SchedulerOperatorFullDTO {
    private long id;
    private LocalDateTime dateTimeWork;
    private int duration;
    private AfoLargeDTO afo;
    private UserLargeDTO operator;

    public SchedulerOperatorFullDTO() {
    }

    public SchedulerOperatorFullDTO(long id, LocalDateTime dateTimeWork, int duration, AfoLargeDTO afo, UserLargeDTO operator) {
        this.id = id;
        this.dateTimeWork = dateTimeWork;
        this.duration = duration;
        this.afo = afo;
        this.operator = operator;
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

    public AfoLargeDTO getAfo() {
        return afo;
    }

    public void setAfo(AfoLargeDTO afo) {
        this.afo = afo;
    }

    public UserLargeDTO getOperator() {
        return operator;
    }

    public void setOperator(UserLargeDTO operator) {
        this.operator = operator;
    }
}