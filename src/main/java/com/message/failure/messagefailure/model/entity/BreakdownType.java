package com.message.failure.messagefailure.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "breakdown_types")
public class BreakdownType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "afo_id")
    private Afo afo;

    public BreakdownType() {
    }

    public BreakdownType(long id, String name, Afo afo) {
        this.id = id;
        this.name = name;
        this.afo = afo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Afo getAfo() {
        return afo;
    }

    public void setAfo(Afo afo) {
        this.afo = afo;
    }
}