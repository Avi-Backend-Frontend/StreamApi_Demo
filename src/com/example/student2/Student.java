package com.example.student2;

import java.util.List;

public class Student {
	
	private String name;
	private String address;
	private String fatherName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, String fatherName) {
		super();
		this.name = name;
		this.address = address;
		this.fatherName = fatherName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", fatherName=" + fatherName + "]";
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
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	

}
