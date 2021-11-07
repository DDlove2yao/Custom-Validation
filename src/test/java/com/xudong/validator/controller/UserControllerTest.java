package com.xudong.validator.controller;

import com.xudong.validator.model.User;
import com.xudong.validator.sevice.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(UserController.class)
@AutoConfigureJsonTesters
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Autowired
    private JacksonTester<User> userJacksonTester;

    @BeforeEach
    void setUp() {
    }

    @Test
    void should_throw_exception_when_set_invalid_user_email() throws Exception{

        User input = User.builder().email("12345").build();

        mockMvc.perform(MockMvcRequestBuilders.patch("/users").contentType(MediaType.APPLICATION_JSON).content(userJacksonTester.write(input).getJson()))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());

    }
}