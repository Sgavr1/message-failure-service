package com.message.failure.messagefailure.model.mapper;

import com.message.failure.messagefailure.model.dto.scheduler.operator.SchedulerOperatorCreateDTO;
import com.message.failure.messagefailure.model.dto.scheduler.operator.SchedulerOperatorFullDTO;
import com.message.failure.messagefailure.model.dto.scheduler.operator.SchedulerOperatorLargeDTO;
import com.message.failure.messagefailure.model.dto.scheduler.operator.SchedulerOperatorUpdateDTO;
import com.message.failure.messagefailure.model.entity.SchedulerOperator;
import org.mapstruct.Mapper;

@Mapper
public interface SchedulerOperatorMapper {
    SchedulerOperator get(SchedulerOperatorCreateDTO dto);
    SchedulerOperator get(SchedulerOperatorUpdateDTO dto);

    SchedulerOperatorFullDTO getFull(SchedulerOperator entity);
    SchedulerOperatorLargeDTO getLarge(SchedulerOperator entity);
}
