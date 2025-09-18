package com.message.failure.messagefailure.repository;

import com.message.failure.messagefailure.model.entity.BreakdownType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreakdownTypeRepository extends JpaRepository<BreakdownType, Long> {
}
