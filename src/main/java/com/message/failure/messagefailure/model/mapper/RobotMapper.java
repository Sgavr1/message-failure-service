package com.message.failure.messagefailure.model.mapper;

import com.message.failure.messagefailure.model.dto.robot.RobotCreateDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotFullDto;
import com.message.failure.messagefailure.model.dto.robot.RobotLargeDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotUpdateDTO;
import com.message.failure.messagefailure.model.entity.Robot;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RobotMapper {
    Robot getEntity(RobotCreateDTO dto);
    Robot getEntity(RobotUpdateDTO dto);

    RobotFullDto getFullDto(Robot entity);
    RobotLargeDTO getLargeDto(Robot entity);
}
