package com.example.testing_web;

import com.example.testing_web.service.WelcomingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomingController {
    private final WelcomingService service;

    public WelcomingController(WelcomingService service) {
        this.service = service;
    }

    @RequestMapping("/welcoming")
    public @ResponseBody String welcoming() {
        return service.welcome();
    }
}
