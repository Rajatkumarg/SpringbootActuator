package com.rajat.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = EmployeeValidatorClass.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeValidator {

	String message() default "Invalid employee data";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
	
}