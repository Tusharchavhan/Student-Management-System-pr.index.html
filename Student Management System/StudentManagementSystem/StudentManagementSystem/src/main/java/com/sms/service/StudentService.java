package com.sms.service;

import java.util.List;

import com.sms.entities.Student;


public interface StudentService {
Student createStudent(Student student);
List<Student> getAllStudents();
Student updateStudentById(int id,Student student);
Student getStudentById(int id);
void deleteStudentById(int id);
}
