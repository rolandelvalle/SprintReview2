package com.sprintreview.h2.repository;

import com.sprintreview.h2.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepositoryDao{

    @Autowired
    private UserCrudRepository userCrudRepository;

    @Override
    public List<UserDto> getAllUser() {
        List<UserDto> userFounded = new ArrayList<>();
        userCrudRepository.findAll().forEach(user -> userFounded.add(user));
        return userFounded;
    }

    @Override
    public UserDto findUserById(Long idUser) {
        return userCrudRepository.findById(idUser).get();
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        return userCrudRepository.save(userDto);
    }

    @Override
    public boolean updateUser(Long idUser, UserDto userDto) {
        UserDto userFound = findUserById(idUser);
        if(userFound != null){
            userFound.setName(userDto.getName());
            userFound.setLastName(userDto.getLastName());
            userFound.setAge(userDto.getAge());
            userFound.setEmail(userDto.getEmail());
            userFound.setDateBirth(userDto.getDateBirth());
            userCrudRepository.save(userFound);
            return true;
        }else{
        return false;
        }
    }

    @Override
    public boolean deleteUser(Long idUser) {
        UserDto userFound = findUserById(idUser);
        if (userFound != null){
            userCrudRepository.delete(userFound);
            return true;
        }else{
            return false;
        }
    }
}
