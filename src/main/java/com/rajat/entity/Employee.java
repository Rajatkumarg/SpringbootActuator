package com.rajat.entity;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Component
@EmployeeValidator
public class Employee {
	@NotNull(message = "Name cannot be null")
    @Size(min = 2, message = "Name must be at least 2 characters long")
//	@UpperCase(message = "Name should be in capital")
    private String name;

    @NotNull(message = "Salary cannot be null")
    @Min(value = 1, message = "Salary must be positive")
    @Max(value = 50000, message = "Salary must be less than 50001")
//  @EvenSalary(message = "Salary should be even")
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
