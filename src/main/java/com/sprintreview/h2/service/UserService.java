package com.sprintreview.h2.service;

import com.sprintreview.h2.model.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUser();
    UserDto findUserById(Long idUser);
    UserDto createUser(UserDto userDto);
    boolean updateUser(Long idUser, UserDto userDto);
    boolean deleteUser(Long idUser);
}
