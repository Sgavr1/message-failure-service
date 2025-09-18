package com.message.failure.messagefailure.service;

import com.message.failure.messagefailure.model.dto.user.UserCreateDTO;
import com.message.failure.messagefailure.model.dto.user.UserFullDTO;
import com.message.failure.messagefailure.model.dto.user.UserLargeDTO;
import com.message.failure.messagefailure.model.dto.user.UserUpdateDTO;
import com.message.failure.messagefailure.model.mapper.UserMapper;
import com.message.failure.messagefailure.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    public List<UserFullDTO> getFullInfoUsers() {
        return repository.findAll().stream().map(mapper::getFull).toList();
    }

    public List<UserFullDTO> getFullInfoOperators() {
        return repository.getOperators().stream().map(mapper::getFull).toList();
    }

    public List<UserFullDTO> getFullInfoTeamLeaders() {
        return repository.getTeamLeaders().stream().map(mapper::getFull).toList();
    }

    public UserFullDTO getUser(long id) {
        return mapper.getFull(repository.findById(id).get());
    }

    public UserFullDTO createUser(UserCreateDTO dto){
        return mapper.getFull(repository.save(mapper.get(dto)));
    }

    public UserFullDTO updateUser(UserUpdateDTO dto) {
        return mapper.getFull(repository.save(mapper.get(dto)));
    }

    public UserFullDTO authorized(String login, String password) {
        return mapper.getFull(repository.authorized(login,password).get());
    }
}