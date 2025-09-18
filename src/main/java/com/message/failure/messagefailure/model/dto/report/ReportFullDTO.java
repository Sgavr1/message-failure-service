package com.message.failure.messagefailure.model.dto.report;

import com.message.failure.messagefailure.model.dto.breakdowntype.BreakdownTypeDTO;
import com.message.failure.messagefailure.model.dto.user.UserLargeDTO;

import java.time.LocalDateTime;

public class ReportFullDTO {
    private long id;
    private LocalDateTime timeBegin;
    private LocalDateTime timeFinish;
    private String description;
    private UserLargeDTO teamLeader;
    private UserLargeDTO operator;
    private BreakdownTypeDTO breakdownType;

    public ReportFullDTO() {
    }

    public ReportFullDTO(long id, LocalDateTime timeBegin, LocalDateTime timeFinish, String description, UserLargeDTO teamLeader, UserLargeDTO operator, BreakdownTypeDTO breakdownType) {
        this.id = id;
        this.timeBegin = timeBegin;
        this.timeFinish = timeFinish;
        this.description = description;
        this.teamLeader = teamLeader;
        this.operator = operator;
        this.breakdownType = breakdownType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public UserLargeDTO getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(UserLargeDTO teamLeader) {
        this.teamLeader = teamLeader;
    }

    public UserLargeDTO getOperator() {
        return operator;
    }

    public void setOperator(UserLargeDTO operator) {
        this.operator = operator;
    }

    public BreakdownTypeDTO getBreakdownType() {
        return breakdownType;
    }

    public void setBreakdownType(BreakdownTypeDTO breakdownType) {
        this.breakdownType = breakdownType;
    }
}