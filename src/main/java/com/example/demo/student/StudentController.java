package com.example.demo.student;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/students")
@AllArgsConstructor
public class StudentController {

	private final StudentService studentService;
	@GetMapping
	public List<Student> getAllStudents(){

		return studentService.getAllStudents();
	}
	@PostMapping
	public void addStudent(@RequestBody Student student){
		studentService.addStudent(student);
	}
}

