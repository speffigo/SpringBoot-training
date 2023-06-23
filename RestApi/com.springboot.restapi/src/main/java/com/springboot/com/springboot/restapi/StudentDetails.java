package com.springboot.com.springboot.restapi;

public class StudentDetails {

	private int id;
	private String name;
	private String college_name;

	public StudentDetails(int id, String name, String college_name) {
		super();
		this.id = id;
		this.name = name;
		this.college_name = college_name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCollege_name() {
		return college_name;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", college_name=" + college_name + "]";
	}

}
