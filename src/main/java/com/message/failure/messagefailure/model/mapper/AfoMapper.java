package com.message.failure.messagefailure.model.mapper;

import com.message.failure.messagefailure.model.dto.afo.AfoCreateDTO;
import com.message.failure.messagefailure.model.dto.afo.AfoFullDTO;
import com.message.failure.messagefailure.model.dto.afo.AfoLargeDTO;
import com.message.failure.messagefailure.model.dto.afo.AfoUpdateDTO;
import com.message.failure.messagefailure.model.entity.Afo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AfoMapper {
    Afo get(AfoCreateDTO dto);
    Afo get(AfoUpdateDTO dto);

    AfoLargeDTO getLarge(Afo entity);
    AfoFullDTO getFull(Afo entity);
}