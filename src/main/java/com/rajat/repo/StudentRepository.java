package com.rajat.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajat.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

}
