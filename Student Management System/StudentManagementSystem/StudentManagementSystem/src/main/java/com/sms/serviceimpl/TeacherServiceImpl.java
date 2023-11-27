package com.sms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entities.Teacher;
import com.sms.repository.TeacherRepository;
import com.sms.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public Teacher createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		
		return teacherRepository.findAll();
	}

	@Override
	public Teacher updateTeacherById(int id, Teacher teacher) {
		Teacher t=teacherRepository.findById(id).get();
		t.setName(teacher.getName());
		t.setAge(teacher.getAge());
		t.setSubject(teacher.getSubject());
		return teacherRepository.save(t);
	
	}

	@Override
	public Teacher getTeacherById(int id) {
	
		return teacherRepository.findById(id).get();
	}

	@Override
	public void deleteTeacherById(int id) {
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
		
		 teacherRepository.deleteById(id);;
	
	}
}