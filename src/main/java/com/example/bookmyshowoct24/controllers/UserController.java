package com.example.bookmyshowoct24.controllers;

import com.example.bookmyshowoct24.dtos.LoginRequestDto;
import com.example.bookmyshowoct24.dtos.ResponseStatus;
import com.example.bookmyshowoct24.dtos.UserSignUpRequestDto;
import com.example.bookmyshowoct24.dtos.UserSignUpResponseDto;
import com.example.bookmyshowoct24.models.User;
import com.example.bookmyshowoct24.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public UserSignUpResponseDto signUp(@RequestBody UserSignUpRequestDto requestDto) {
        User user = userService.signUp(
                requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword()
        );

        UserSignUpResponseDto responseDto = new UserSignUpResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setName(user.getName());
        responseDto.setEmail(user.getEmail());
        return responseDto;
    }

    @GetMapping("/login")
    public ResponseStatus login(@RequestBody LoginRequestDto requestDto) {
        return userService.login(requestDto.getEmail(),
                requestDto.getPassword());
    }

}
