package com.sms.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entities.Student;

import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudentById(int id, Student student) {
		Student s=studentRepository.findById(id).get();
		s.setName(student.getName());
		s.setAddress(student.getAddress());
		s.setEmail(student.getEmail());
		return studentRepository.save(s);
	
	}

	@Override
	public Student getStudentById(int id) {
	
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(int id) {
//		Student stud=null;
//		Optional<Student> s=studentRepository.findById(id);
//		if(s.isPresent())
//			stud=s.get();
//		
////		else
////		{
////			throw new ResourseNotFoundException("id not found");
////		}
//		return stud;
		
		 studentRepository.deleteById(id);;
	
	}

}
