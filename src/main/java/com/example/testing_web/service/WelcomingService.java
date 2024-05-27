package com.example.testing_web.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomingService {
    public String welcome() {
        return "Welcome, World";
    }
}
