package com.techlab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlab.model.Student;
import com.techlab.service.StudentService;

@CrossOrigin(maxAge = 3600)
@RequestMapping("/api/v1")
@RestController
public class StudentRestController {
	@Autowired
	private StudentService service;

	@CrossOrigin
	@GetMapping("/students")
	public List<Student> getStudents() {
		service = StudentService.getInstance();
		return service.getStudents();
	}
}
