package com.sprintreview.h2.repository;

import com.sprintreview.h2.model.UserDto;

import java.util.List;

public interface UserRepositoryDao {
    List<UserDto> getAllUser();
    UserDto findUserById(Long idUser);
    UserDto createUser(UserDto userDto);
    boolean updateUser(Long idUser, UserDto userDto);
    boolean deleteUser(Long idUser);
}
