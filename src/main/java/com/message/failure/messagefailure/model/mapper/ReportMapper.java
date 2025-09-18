package com.message.failure.messagefailure.model.mapper;

import com.message.failure.messagefailure.model.dto.report.ReportCreateDTO;
import com.message.failure.messagefailure.model.dto.report.ReportFullDTO;
import com.message.failure.messagefailure.model.dto.report.ReportLargeDTO;
import com.message.failure.messagefailure.model.dto.report.ReportUpdateDTO;
import com.message.failure.messagefailure.model.entity.Report;
import org.mapstruct.Mapper;

@Mapper
public interface ReportMapper {
    Report get(ReportCreateDTO dto);
    Report get(ReportUpdateDTO dto);

    ReportFullDTO getFull(Report entity);
    ReportLargeDTO getLarge(Report entity);
}
