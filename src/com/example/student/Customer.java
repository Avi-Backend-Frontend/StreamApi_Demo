package com.example.student;

public class Customer {
	
	private int slNumber;
	private String name;
	private String book;
	private double price;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int slNumber, String name, String book, double price) {
		super();
		this.slNumber = slNumber;
		this.name = name;
		this.book = book;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Customer [slNumber=" + slNumber + ", name=" + name + ", book=" + book + ", price=" + price + "]";
	}
	public int getSlNumber() {
		return slNumber;
	}
	public void setSlNumber(int slNumber) {
		this.slNumber = slNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
		
	

}
