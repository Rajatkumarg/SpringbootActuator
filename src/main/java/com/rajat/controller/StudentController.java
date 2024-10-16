package com.rajat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.entity.Student;
import com.rajat.repo.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentRepository repo;

	@PutMapping("/put")
	public void updateUsingPut(@RequestBody Student student) {
		repo.save(student);
	}
	
	@PatchMapping("/patch")
	public void updateUsingPatch(@RequestBody Student student) {
		repo.save(student);
	}
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
		repo.save(student);
	}
}
