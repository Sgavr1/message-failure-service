package com.message.failure.messagefailure.model.mapper;

import com.message.failure.messagefailure.model.dto.user.UserCreateDTO;
import com.message.failure.messagefailure.model.dto.user.UserFullDTO;
import com.message.failure.messagefailure.model.dto.user.UserLargeDTO;
import com.message.failure.messagefailure.model.dto.user.UserUpdateDTO;
import com.message.failure.messagefailure.model.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User get(UserCreateDTO dto);
    User get(UserUpdateDTO dto);

    UserFullDTO getFull(User entity);
    UserLargeDTO getLarge(User entity);
}
