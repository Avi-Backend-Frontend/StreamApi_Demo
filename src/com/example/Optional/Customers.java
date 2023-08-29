package com.example.Optional;

import java.util.List;

public class Customers {
	
	private int id;
	private String name;
	private String email;
	private List<String> mobNumber;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(int id, String name, String email, List<String> mobNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobNumber = mobNumber;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", mobNumber=" + mobNumber + "]";
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(List<String> mobNumber) {
		this.mobNumber = mobNumber;
	}
	
	

}
