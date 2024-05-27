package com.example.testing_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(RepositoryProperty.TEST_PATH)
    public @ResponseBody String welcoming() {
        return RepositoryProperty.HELLO_WORLD;
    }
}
