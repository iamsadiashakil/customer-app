package com.pie.trainingtask.customerapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
