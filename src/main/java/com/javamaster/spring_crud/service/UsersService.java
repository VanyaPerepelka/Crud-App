package com.javamaster.spring_crud.service;

import com.javamaster.spring_crud.dto.UsersDto;
import com.javamaster.spring_crud.exception.ValidationException;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

public interface UsersService {

    UsersDto saveUser(UsersDto usersDto) throws ValidationException;

    void deleteUser(Integer userId);

    UsersDto findByLogin(String login);

    @UniqueElements
    List<UsersDto> findAll();
}
