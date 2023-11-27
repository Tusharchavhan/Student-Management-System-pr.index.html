package com.sms.service;

import java.util.List;


import com.sms.entities.Teacher;


public interface TeacherService {
Teacher createTeacher(Teacher teacher);
List<Teacher> getAllTeachers();
Teacher updateTeacherById(int id,Teacher teacher);
Teacher getTeacherById(int id);
void deleteTeacherById(int id);
}
