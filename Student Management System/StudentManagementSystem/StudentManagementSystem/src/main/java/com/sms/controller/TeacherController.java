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


import com.sms.entities.Teacher;
import com.sms.service.TeacherService;


@RestController
@RequestMapping("/teacher")
@CrossOrigin(origins = "http://localhost:4200")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("/createTeacher")
	ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher)
	{
		return new ResponseEntity<Teacher>(teacherService.createTeacher(teacher),
				HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllTeachers")
	List<Teacher> getAllTeachers()
	{
		return teacherService.getAllTeachers();
	}
	
	@PutMapping("/updateTeacher/{id}")
	ResponseEntity<Teacher> updateTeacherById(@PathVariable("id") int id,@RequestBody Teacher teacher)
	{
		return new ResponseEntity<Teacher>(teacherService.updateTeacherById(id, teacher),HttpStatus.OK);
	}
	
	@GetMapping("/getTeacherById/{id}")
	ResponseEntity<Teacher> getTeacherById(@PathVariable int id)
	{
		return new ResponseEntity<Teacher>(teacherService.getTeacherById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteTeacher/{id}")
	void deleteTeacherById(@PathVariable("id") int id) 
	{
		teacherService.deleteTeacherById(id);
	}
}
