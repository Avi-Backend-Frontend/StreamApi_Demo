package com.example.fruit.superthis;

public class ChildClass extends SuperClass {

	public ChildClass() {
		this(5);
		System.out.println("No Args Constructor");
	}

	public ChildClass(int x) {
		this("String");
		System.out.println("Integer Constructor");
	}

	public ChildClass(String s) {
		super();
		System.out.println("String Constructor");
	}
}
