package com.message.failure.messagefailure.repository;

import com.message.failure.messagefailure.model.entity.SchedulerTeamLeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulerTeamLeaderRepository extends JpaRepository<SchedulerTeamLeader, Long> {
}