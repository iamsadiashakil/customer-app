package com.pie.trainingtask.customerapp.mapper;

import com.pie.trainingtask.customerapp.dto.UserDto;
import com.pie.trainingtask.customerapp.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto map(UserEntity entity);

    UserEntity map(UserDto userDto);

    List<UserEntity> map(List<UserDto> userDtos);
}
