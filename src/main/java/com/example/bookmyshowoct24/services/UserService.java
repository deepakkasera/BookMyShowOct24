package com.example.bookmyshowoct24.services;

import com.example.bookmyshowoct24.dtos.ResponseStatus;
import com.example.bookmyshowoct24.models.User;
import com.example.bookmyshowoct24.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User signUp(String name, String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isPresent()) {
            //User with the given email is already present in the database.
            //Navigate them to the Login page.
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);

        user.setPassword(bCryptPasswordEncoder.encode(password));

        return userRepository.save(user);
    }

    public ResponseStatus login(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isEmpty()) {
            //Ask user to signup first.
        }

        User user = optionalUser.get();

        if (bCryptPasswordEncoder.matches(password, user.getPassword())) {
            return ResponseStatus.SUCCESS;
        }
        return ResponseStatus.FAILURE;
    }
}

/*

encoding + salting

=> BCryptPasswordEncoder.

 */
