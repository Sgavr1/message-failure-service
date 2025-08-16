package com.message.failure.messagefailure.repository.implemets;

import com.message.failure.messagefailure.data.Factory;
import com.message.failure.messagefailure.model.entity.Robot;
import com.message.failure.messagefailure.repository.RobotRepository;

import java.util.List;

public class RobotRepositoryImplements implements RobotRepository {

    @Override
    public List<Robot> getRobots() {
        return Factory.robots;
    }

    @Override
    public Robot create(Robot robot) {
        robot.setId(Factory.robots.size() + 1);
        Factory.robots.add(robot);
        return robot;
    }

    @Override
    public Robot update(Robot robot) {
        Robot r = Factory.robots.stream().filter(robot1 -> robot1.getId()==robot.getId()).findFirst().get();

        r.setName(robot.getName());
        r.setAfoId(robot.getAfoId());
        r.setState(robot.getState());
        r.setProductLineId(robot.getProductLineId());

        return r;
    }
}