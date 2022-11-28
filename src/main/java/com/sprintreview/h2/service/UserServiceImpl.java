package com.sprintreview.h2.service;

import com.sprintreview.h2.model.UserDto;
import com.sprintreview.h2.repository.UserRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepositoryDao userRepositoryDao;

    @Override
    public List<UserDto> getAllUser() {
        return userRepositoryDao.getAllUser();
    }

    @Override
    public UserDto findUserById(Long idUser) {
        return userRepositoryDao.findUserById(idUser);
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        return userRepositoryDao.createUser(userDto);
    }

    @Override
    public boolean updateUser(Long idUser, UserDto userDto) {
        return userRepositoryDao.updateUser(idUser, userDto);
    }

    @Override
    public boolean deleteUser(Long idUser) {
        return userRepositoryDao.deleteUser(idUser);
    }
}
