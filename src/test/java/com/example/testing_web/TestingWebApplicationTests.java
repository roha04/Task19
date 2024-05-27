package com.example.testing_web;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TestingWebApplicationTests {
	@Autowired private MockMvc mockMvc;

	@Test
	//** for test type address http://localhost:8080/test */
	void shouldReturnDefaultMessage()  throws Exception {
		this.mockMvc.perform(get(RepositoryProperty.TEST_PATH)).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(RepositoryProperty.HELLO_WORLD)));
	}

}
