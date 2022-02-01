package com.pie.trainingtask.customerapp.controller;

import com.pie.trainingtask.customerapp.dto.UserDto;
import com.pie.trainingtask.customerapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Autowired
    UserService userService;

    @Override
    public UserDto createUser(UserDto userDto) {
        return userService.saveUser(userDto);
    }
}
