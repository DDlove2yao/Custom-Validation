package com.xudong.validator.sevice;

import com.xudong.validator.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> userRepo = new ArrayList<>();

    public UserService() {
        this.userRepo.add(User.builder()
                .name("Tom")
                .age(20)
                .country("USA")
                .email("a2545469@163.com")
                .domain("")
                .build());
    }

    public User setUserEmail(User user) {
        User foundUser = userRepo.get(0);
        userRepo.remove(0);
        foundUser.setEmail(user.getEmail());
        userRepo.add(user);
        return foundUser;
    }

    public User getUser() {
        return this.userRepo.get(0);
    }

    public User save(User user) {
        userRepo.add(user);
        return userRepo.get(1);
    }
}
