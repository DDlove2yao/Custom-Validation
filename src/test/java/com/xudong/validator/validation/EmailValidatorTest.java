package com.xudong.validator.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintValidatorContext;

class EmailValidatorTest {

    private final EmailValidator emailValidator = new EmailValidator();
    private  ConstraintValidatorContext constraintValidatorContext;

    @Test
    void should_return_false_given_invalid_email_address() {
        String email = "123456";
        Assertions.assertFalse(emailValidator.isValid(email, constraintValidatorContext));

    }

    @Test
    void should_return_true_given_valid_email_address() {
        String email = "ddlove2yao@github.com";
        Assertions.assertTrue(emailValidator.isValid(email, constraintValidatorContext));
    }
}