package com.message.failure.messagefailure.model.dto.scheduler.teamleader;

import com.message.failure.messagefailure.model.dto.productline.ProductLineLargeDTO;
import com.message.failure.messagefailure.model.dto.user.UserLargeDTO;

import java.time.LocalDateTime;

public class SchedulerTeamLeaderUpdateDTO {
    private long id;
    private LocalDateTime dateTimeWork;
    private int duration;
    private long productLineId;
    private long teamLeaderId;
}
