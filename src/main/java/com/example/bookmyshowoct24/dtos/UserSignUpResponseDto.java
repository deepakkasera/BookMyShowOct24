package com.example.bookmyshowoct24.dtos;

import com.example.bookmyshowoct24.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignUpResponseDto {
    private String email;
    private String name;
    private ResponseStatus responseStatus;
}
