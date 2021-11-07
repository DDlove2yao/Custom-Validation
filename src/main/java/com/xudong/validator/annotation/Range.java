package com.xudong.validator.annotation;

import com.xudong.validator.validation.RangeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = RangeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {

    String message() default "Not in the given range";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
