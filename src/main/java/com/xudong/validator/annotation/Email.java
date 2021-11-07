package com.xudong.validator.annotation;

import com.xudong.validator.validation.EmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * This annotation will validate the Email:
 * 1. it shouldn't be null
 * 2. it should follow email format
 */
@Documented
@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {

    boolean required() default true;

    String message() default "Invalid Email Address";

    String regexp() default "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
