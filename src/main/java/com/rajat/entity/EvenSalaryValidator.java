package com.rajat.entity;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EvenSalaryValidator implements ConstraintValidator<EvenSalary, Double> {

	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value%2==0;
	}

	
	
}
