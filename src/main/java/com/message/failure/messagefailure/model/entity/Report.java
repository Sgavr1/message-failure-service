package com.message.failure.messagefailure.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "time_begin")
    private LocalDateTime timeBegin;
    @Column(name = "time_finish")
    private LocalDateTime timeFinish;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "team_leader_id")
    private User teamLeader;
    @ManyToOne
    @JoinColumn(name = "operator_id")
    private User operator;
    @ManyToOne
    @JoinColumn(name = "breakdown_type_id")
    private BreakdownType breakdownType;

    public Report() {
    }

    public Report(long id, LocalDateTime timeBegin, LocalDateTime timeFinish, String description, User teamLeader, User operator, BreakdownType breakdownType) {
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

    public User getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(User teamLeader) {
        this.teamLeader = teamLeader;
    }

    public User getOperator() {
        return operator;
    }

    public void setOperator(User operator) {
        this.operator = operator;
    }

    public BreakdownType getBreakdownType() {
        return breakdownType;
    }

    public void setBreakdownType(BreakdownType breakdownType) {
        this.breakdownType = breakdownType;
    }
}