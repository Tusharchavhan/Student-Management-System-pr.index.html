package com.sms.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entities.Student;

import com.sms.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/createStudent")
	ResponseEntity<Student> createStudent(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(studentService.createStudent(student),
				HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllStudents")
	List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@PutMapping("/updateStudent/{id}")
	ResponseEntity<Student> updateStudentById(@PathVariable("id") int id,@RequestBody Student student)
	{
		return new ResponseEntity<Student>(studentService.updateStudentById(id, student),HttpStatus.OK);
	}
	
	@GetMapping("/getStudentById/{id}")
	ResponseEntity<Student> getStudentById(@PathVariable int id)
	{
		return new ResponseEntity<Student>(studentService.getStudentById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	void deleteStudentById(@PathVariable("id") int id) 
	{
		studentService.deleteStudentById(id);
	}
}
