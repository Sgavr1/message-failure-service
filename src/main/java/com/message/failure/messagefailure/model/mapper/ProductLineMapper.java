package com.message.failure.messagefailure.model.mapper;

import com.message.failure.messagefailure.model.dto.productline.ProductLineCreateDTO;
import com.message.failure.messagefailure.model.dto.productline.ProductLineFullDTO;
import com.message.failure.messagefailure.model.dto.productline.ProductLineLargeDTO;
import com.message.failure.messagefailure.model.dto.productline.ProductLineUpdateDTO;
import com.message.failure.messagefailure.model.entity.ProductLine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductLineMapper {
    ProductLine get(ProductLineCreateDTO dto);
    ProductLine get(ProductLineUpdateDTO dto);

    ProductLineFullDTO getFull(ProductLine entity);
    ProductLineLargeDTO getLarge(ProductLine entity);
}
