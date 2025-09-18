package com.message.failure.messagefailure.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "scheduler_work_line_products_team_leaders")
public class SchedulerTeamLeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "date_time_work")
    private LocalDateTime dateTimeWork;
    @Column(name = "duration")
    private int duration;
    @ManyToOne
    @JoinColumn(name = "line_product_id")
    private ProductLine productLine;
    @ManyToOne
    @JoinColumn(name = "team_leader_id")
    private User teamLeader;

    public SchedulerTeamLeader() {
    }

    public SchedulerTeamLeader(long id, LocalDateTime dateTimeWork, int duration, ProductLine productLine, User teamLeader) {
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

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }

    public User getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(User teamLeader) {
        this.teamLeader = teamLeader;
    }
}
