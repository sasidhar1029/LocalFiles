package com.vcube.model;

public class Expert {
	private int id;
	private String name;
	private String sector;
	private String shortBio;
	private String linkedin;
	private String email;

// constructors, getters and setters
	public Expert() {
	}

	public Expert(int id, String name, String sector, String shortBio, String linkedin, String email) {
		this.id = id;
		this.name = name;
		this.sector = sector;
		this.shortBio = shortBio;
		this.linkedin = linkedin;
		this.email = email;
	}

// getters and setters omitted for brevity (include in your code)
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

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getShortBio() {
		return shortBio;
	}

	public void setShortBio(String shortBio) {
		this.shortBio = shortBio;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}