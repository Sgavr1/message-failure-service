package com.message.failure.messagefailure.repository;

import com.message.failure.messagefailure.model.entity.Robot;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RobotRepository {
    List<Robot> getRobots();
    Robot create(Robot robot);
    Robot update(Robot robot);
}
