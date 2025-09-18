package com.message.failure.messagefailure.model.mapper;

import com.message.failure.messagefailure.model.dto.breakdowntype.BreakdownTypeCreateDTO;
import com.message.failure.messagefailure.model.dto.breakdowntype.BreakdownTypeDTO;
import com.message.failure.messagefailure.model.dto.breakdowntype.BreakdownTypeUpdateDTO;
import com.message.failure.messagefailure.model.entity.BreakdownType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BreakdownMapper {
    BreakdownType get(BreakdownTypeCreateDTO dto);
    BreakdownType get(BreakdownTypeUpdateDTO dto);

    BreakdownTypeDTO get(BreakdownType entity);
}
