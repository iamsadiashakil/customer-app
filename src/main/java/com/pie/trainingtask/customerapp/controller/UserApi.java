package com.pie.trainingtask.customerapp.controller;

import com.pie.trainingtask.customerapp.dto.UserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/user-service")
public interface UserApi {

    @PostMapping(path = "/users", consumes = {MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE})
    UserDto createUser(@RequestBody UserDto userDto);
}
