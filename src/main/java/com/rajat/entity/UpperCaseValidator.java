package com.rajat.entity;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UpperCaseValidator implements ConstraintValidator<UpperCase, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		String uppercase = value.toUpperCase();
		return value.equals(uppercase);
	}

	

    
}
