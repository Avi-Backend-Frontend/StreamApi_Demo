package com.example.teststudent;

import java.util.List;

public class Student {
	
	private int rollNumber;
	private String name;
	private List<Integer> phoneNumber;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String name, List<Integer> phoneNumber) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
