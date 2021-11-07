package com.xudong.validator.validation;

import com.xudong.validator.annotation.Email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {

    private String regexp;
    private boolean required;

    @Override
    public void initialize(Email constraintAnnotation) {
        this.required = constraintAnnotation.required();
        this.regexp = constraintAnnotation.regexp();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(required){
            return s != null && s.matches(regexp);
        }
        return false;
    }
}
