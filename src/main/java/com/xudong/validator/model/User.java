package com.xudong.validator.model;

import com.xudong.validator.annotation.Email;
import com.xudong.validator.annotation.IP;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String name;

    private Integer age;

    private String country;

    @Email
    private String email;

    @IP
    private String domain;
}
