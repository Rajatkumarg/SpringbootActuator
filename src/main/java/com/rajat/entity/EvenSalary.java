package com.rajat.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Constraint(validatedBy = EvenSalaryValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EvenSalary {

    String message() default "salary should be even";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

