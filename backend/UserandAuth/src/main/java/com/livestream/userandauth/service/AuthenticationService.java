package com.livestream.userandauth.service;

import com.livestream.userandauth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor

public class AuthenticationService {
    private final UserRepository userRepository;

}
