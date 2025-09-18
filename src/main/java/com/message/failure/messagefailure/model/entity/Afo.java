package com.message.failure.messagefailure.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "afos")
public class Afo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private String status;
    @ManyToOne
    @JoinColumn(name = "line_product_id")
    private ProductLine productLine;
    @OneToMany(mappedBy = "afo")
    private List<Robot> robots;

    public Afo() {
    }

    public Afo(long id, String name, String status, ProductLine productLine) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.productLine = productLine;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }
}