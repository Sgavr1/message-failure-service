package com.message.failure.messagefailure.model.dto.breakdowntype;

import com.message.failure.messagefailure.model.dto.afo.AfoLargeDTO;

public class BreakdownTypeDTO {
    private long id;
    private String name;
    private AfoLargeDTO afo;

    public BreakdownTypeDTO() {
    }

    public BreakdownTypeDTO(long id, String name, AfoLargeDTO afo) {
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

    public AfoLargeDTO getAfo() {
        return afo;
    }

    public void setAfo(AfoLargeDTO afo) {
        this.afo = afo;
    }
}