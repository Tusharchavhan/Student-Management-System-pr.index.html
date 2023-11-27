package com.sms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;




@Entity
@Table(name = "Registration")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer userId;
@Column(length = 30)
private String userName;
@Column(length = 30)
private String password;
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User(Integer userId, String userName, String password) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.password = password;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

}
