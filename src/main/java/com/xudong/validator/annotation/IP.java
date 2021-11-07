package com.xudong.validator.annotation;

import com.xudong.validator.validation.IPValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * The annotation will validate the IP address.
 * 1. The IP shouldn't be null.
 * 2. The IP address should follow regex rules.
 */
@Documented
@Constraint(validatedBy = IPValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IP {
    String message() default "Invalid IP address";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
