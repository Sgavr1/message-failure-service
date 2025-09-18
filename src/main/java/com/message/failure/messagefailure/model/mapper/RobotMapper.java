package com.message.failure.messagefailure.model.mapper;

import com.message.failure.messagefailure.model.dto.robot.RobotCreateDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotFullDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotLargeDTO;
import com.message.failure.messagefailure.model.dto.robot.RobotUpdateDTO;
import com.message.failure.messagefailure.model.entity.Robot;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RobotMapper {
    Robot get(RobotCreateDTO dto);
    Robot get(RobotUpdateDTO dto);

    RobotFullDTO getFull(Robot entity);
    RobotLargeDTO getLarge(Robot entity);
}
