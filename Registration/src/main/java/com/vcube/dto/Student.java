package com.vcube.dto;

public class Student {

    private String fullname;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private String course;
    private String joined;
    private String status;

    public Student() {}

    public Student(String fullname, String username, String password) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
    }

    public String getFullname() { return fullname; }
    public void setFullname(String fullname) { this.fullname = fullname; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getJoined() { return joined; }
    public void setJoined(String joined) { this.joined = joined; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
