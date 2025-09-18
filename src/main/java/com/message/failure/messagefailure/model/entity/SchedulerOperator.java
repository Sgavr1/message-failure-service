package com.message.failure.messagefailure.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "scheduler_work_afos_operators")
public class SchedulerOperator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "date_time_work")
    private LocalDateTime dateTimeWork;
    @Column(name = "duration")
    private int duration;
    @ManyToOne
    @JoinColumn(name = "afo_id")
    private Afo afo;
    @ManyToOne
    @JoinColumn(name = "operator_id")
    private User operator;

    public SchedulerOperator() {
    }

    public SchedulerOperator(long id, LocalDateTime dateTimeWork, int duration, Afo afo, User operator) {
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

    public Afo getAfo() {
        return afo;
    }

    public void setAfo(Afo afo) {
        this.afo = afo;
    }

    public User getOperator() {
        return operator;
    }

    public void setOperator(User operator) {
        this.operator = operator;
    }
}
