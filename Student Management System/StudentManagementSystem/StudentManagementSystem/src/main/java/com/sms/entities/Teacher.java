package com.sms.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Teacher_info")
@Inheritance(strategy = InheritanceType.JOINED)
	public class Teacher {
	    // Attributes
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "teacher_id")
	private int id;
	@Column(length = 50) 
	private String name;
	@Column(unique = true)   
	private int age;
	@Column(length = 100)   
	private String subject;
	
	@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Student> students;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Teacher(int id, String name, int age, String subject, List<Student> students, User user) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.students = students;
		this.user = user;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
	
