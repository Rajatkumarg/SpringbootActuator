package com.rajat.entity;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = UpperCaseValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UpperCase {

    String message() default "Field must be in uppercase";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}