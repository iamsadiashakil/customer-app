package com.pie.trainingtask.customerapp.service.impl;

import com.pie.trainingtask.customerapp.dto.UserDto;
import com.pie.trainingtask.customerapp.entity.UserEntity;
import com.pie.trainingtask.customerapp.mapper.UserMapper;
import com.pie.trainingtask.customerapp.repository.UserRepository;
import com.pie.trainingtask.customerapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserMapper userMapper;

    //@Transactional(rollbackFor = Exception.class)
    @Override
    public UserDto saveUser(UserDto userDto) {
        userDto.setPassword(bCryptPasswordEncoder
                .encode(userDto.getPassword()));
        UserEntity userEntity = userMapper.map(userDto);

        return userMapper.map(userRepository.save(userEntity));
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUserName(userName);
        //if (ValueUtils.isEmpty(userEntity)) throwNotFound("No user found for email: " + userName);

        return new User(userEntity.getUserName(), userEntity.getPassword(), new ArrayList<>());
    }
}
