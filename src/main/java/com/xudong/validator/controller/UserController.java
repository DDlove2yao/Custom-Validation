package com.xudong.validator.controller;

import com.xudong.validator.model.User;
import com.xudong.validator.sevice.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
@Validated
public class UserController {

    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PatchMapping()
    public User setUserEmail(@Valid @RequestBody User user) {
        return userService.setUserEmail(user);
    }

    @GetMapping
    public User getUser() {
        return userService.getUser();
    }

    @PostMapping()
    public User save(@RequestBody @Valid User user) {
        return userService.save(user);
    }
}
