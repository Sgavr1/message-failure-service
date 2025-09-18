package com.message.failure.messagefailure.model.dto.report;

import com.message.failure.messagefailure.model.dto.breakdowntype.BreakdownTypeDTO;

import java.time.LocalDateTime;

public class ReportLargeDTO {
    private long id;
    private LocalDateTime timeBegin;
    private LocalDateTime timeFinish;
    private String description;
    private BreakdownTypeDTO breakdownType;

    public ReportLargeDTO() {
    }

    public ReportLargeDTO(long id, LocalDateTime timeBegin, LocalDateTime timeFinish, String description, BreakdownTypeDTO breakdownType) {
        this.id = id;
        this.timeBegin = timeBegin;
        this.timeFinish = timeFinish;
        this.description = description;
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

    public BreakdownTypeDTO getBreakdownType() {
        return breakdownType;
    }

    public void setBreakdownType(BreakdownTypeDTO breakdownType) {
        this.breakdownType = breakdownType;
    }
}
