package com.rajat.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.entity.Employee;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@PostMapping("/validateEmployee")
	public String validateEmployee(@Valid @RequestBody Employee request) {
		System.out.println(request.getName());
		System.out.println(request.getSalary());
		return "validated";
	}
}
