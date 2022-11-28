package com.sprintreview.h2.repository;

import com.sprintreview.h2.model.UserDto;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<UserDto, Long> {
}
