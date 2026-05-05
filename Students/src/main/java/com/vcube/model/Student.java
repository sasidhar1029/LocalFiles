package com.vcube.model;

public class Student {
	private String username;
	private String fullname;
	private String password;
	
	public Student() {}
	public Student(String un, String fn, String pwd) {
		this.username = un;
		this.fullname = fn;
		this.password = pwd;
	}
	public String toString() {
		return username + ":" + fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
