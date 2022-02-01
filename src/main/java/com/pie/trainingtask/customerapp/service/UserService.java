package com.pie.trainingtask.customerapp.service;

import com.pie.trainingtask.customerapp.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {
    UserDto saveUser(UserDto userDto);
}
