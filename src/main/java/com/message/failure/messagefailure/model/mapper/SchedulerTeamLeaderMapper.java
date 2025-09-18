package com.message.failure.messagefailure.model.mapper;

import com.message.failure.messagefailure.model.dto.scheduler.teamleader.SchedulerTeamLeaderCreateDTO;
import com.message.failure.messagefailure.model.dto.scheduler.teamleader.SchedulerTeamLeaderFullDTO;
import com.message.failure.messagefailure.model.dto.scheduler.teamleader.SchedulerTeamLeaderLargeDTO;
import com.message.failure.messagefailure.model.dto.scheduler.teamleader.SchedulerTeamLeaderUpdateDTO;
import com.message.failure.messagefailure.model.entity.SchedulerTeamLeader;
import org.mapstruct.Mapper;

@Mapper
public interface SchedulerTeamLeaderMapper {
    SchedulerTeamLeader get(SchedulerTeamLeaderCreateDTO dto);
    SchedulerTeamLeader get(SchedulerTeamLeaderUpdateDTO dto);

    SchedulerTeamLeaderFullDTO getFull(SchedulerTeamLeader entity);
    SchedulerTeamLeaderLargeDTO getLarge(SchedulerTeamLeader entity);
}
