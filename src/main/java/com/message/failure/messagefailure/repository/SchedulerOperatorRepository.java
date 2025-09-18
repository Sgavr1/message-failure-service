package com.message.failure.messagefailure.repository;

import com.message.failure.messagefailure.model.entity.SchedulerOperator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulerOperatorRepository extends JpaRepository<SchedulerOperator, Long> {
}
