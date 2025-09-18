package com.message.failure.messagefailure.model.dto.report;

import java.time.LocalDateTime;

public class ReportCreateDTO {
    private LocalDateTime timeBegin;
    private LocalDateTime timeFinish;
    private String description;
    private long teamLeaderId;
    private long operatorId;
    private long breakdownTypeId;

    public ReportCreateDTO() {
    }

    public ReportCreateDTO(LocalDateTime timeBegin, LocalDateTime timeFinish, String description, long teamLeaderId, long operatorId, long breakdownTypeId) {
        this.timeBegin = timeBegin;
        this.timeFinish = timeFinish;
        this.description = description;
        this.teamLeaderId = teamLeaderId;
        this.operatorId = operatorId;
        this.breakdownTypeId = breakdownTypeId;
    }

    public LocalDateTime getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(LocalDateTime timeBegin) {
        this.timeBegin = timeBegin;
    }

    public LocalDateTime getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(LocalDateTime timeFinish) {
        this.timeFinish = timeFinish;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTeamLeaderId() {
        return teamLeaderId;
    }

    public void setTeamLeaderId(long teamLeaderId) {
        this.teamLeaderId = teamLeaderId;
    }

    public long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(long operatorId) {
        this.operatorId = operatorId;
    }

    public long getBreakdownTypeId() {
        return breakdownTypeId;
    }

    public void setBreakdownTypeId(long breakdownTypeId) {
        this.breakdownTypeId = breakdownTypeId;
    }
}