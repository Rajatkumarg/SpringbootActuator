package com.rajat.entity;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmployeeValidatorClass implements ConstraintValidator<EmployeeValidator, Employee>{

	@Override
	public boolean isValid(Employee employee, ConstraintValidatorContext context) {
		if (employee.getName() != null && !employee.getName().equals(employee.getName().toUpperCase())) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Name should be in capital")
                   .addPropertyNode("name")
                   .addConstraintViolation();
            return false;
        }
		
		if (employee.getSalary() != null && employee.getSalary() %2!=0) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Salary should be even")
                   .addPropertyNode("salary")
                   .addConstraintViolation();
            return false;
        }
		
		return true;
		
	}

}
