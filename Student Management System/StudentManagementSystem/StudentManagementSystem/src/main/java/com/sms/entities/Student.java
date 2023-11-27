package com.sms.entities;

import javax.persistence.*;

@Entity
@Table(name = "Student_Info")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(length = 30)
private String name;
@Column(length = 100)
private String address;
@Column(length = 80,unique = true)
private String email;

@ManyToOne
@JoinColumn(name = "teacher_id")
private Teacher teacher;

@OneToOne
@JoinColumn(name = "user_id")
private User user;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Teacher getTeacher() {
	return teacher;
}

public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Student(int id, String name, String address, String email, Teacher teacher, User user) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.email = email;
	this.teacher = teacher;
	this.user = user;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}

