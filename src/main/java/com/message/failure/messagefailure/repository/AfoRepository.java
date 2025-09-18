package com.message.failure.messagefailure.repository;

import com.message.failure.messagefailure.model.entity.Afo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfoRepository extends JpaRepository<Afo, Long> {
}