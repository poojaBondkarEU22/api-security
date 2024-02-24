package com.api.security.service;

import com.api.security.models.User;
import com.api.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log4j2
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> getUserDetailsByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
