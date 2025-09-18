package com.message.failure.messagefailure.model.dto.productline;

import com.message.failure.messagefailure.model.dto.afo.AfoLargeDTO;

import java.util.List;

public class ProductLineFullDTO {
    private long id;
    private String name;
    private String status;
    private List<AfoLargeDTO> afos;

    public ProductLineFullDTO() {
    }

    public ProductLineFullDTO(long id, String name, String status, List<AfoLargeDTO> afos) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.afos = afos;
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

    public List<AfoLargeDTO> getAfos() {
        return afos;
    }

    public void setAfos(List<AfoLargeDTO> afos) {
        this.afos = afos;
    }
}
