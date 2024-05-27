package com.example.testing_web;

import com.example.testing_web.service.WelcomingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WelcomingController.class)
public class WebMockTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WelcomingService service;

    @Test
    void greetingShouldReturnMessageFromService() throws Exception {
        when(service.welcome()).thenReturn("Welcome, Mock");
        this.mockMvc.perform(get("/welcoming")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Welcome, Mock")));
    }
}
