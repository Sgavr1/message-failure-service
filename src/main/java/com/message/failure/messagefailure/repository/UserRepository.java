package com.message.failure.messagefailure.repository;

import com.message.failure.messagefailure.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT u FROM User u WHERE u.login = :login AND password = :password")
    Optional<User> authorized(String login, String password);

    @Query(value = "SELECT u FROM User u WHERE u.role = 'TL'")
    List<User> getTeamLeaders();

    @Query(value = "SELECT u FROM User u WHERE u.role = 'OP'")
    List<User> getOperators();
}