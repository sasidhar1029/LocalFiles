package com.vcube.model;

public class Student {
	private String username;
	private String fullname;
	private String password;
	public Student() {
		
	}
	public Student(String username, String fullname, String password) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.password = password;
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
	@Override
	public String toString() {
		return "Student [username=" + username + ", fullname=" + fullname + ", password=" + password + "]";
	}
	
	
}
