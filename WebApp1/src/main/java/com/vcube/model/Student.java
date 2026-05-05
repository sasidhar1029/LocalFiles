package com.vcube.model;

public class Student {
	private String fullname;
	private String username;
	private String password;
	private String repassword;

	public Student() {

	}

	public Student(String fullname, String username, String password, String repassword) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.repassword = repassword;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", username=" + username + ", password=" + password + ", repassword="
				+ repassword + "]";
	}

}
