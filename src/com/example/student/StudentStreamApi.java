package com.example.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStreamApi {
	public static void main(String[] args) {
		
		Student student = new Student(21, "Fulla", 467, "Remu");
		Student student2 = new Student(3, "Champa", 345, "Nabara");
		Student student3 = new Student(7, "Manasi", 399, "Dundakut");
		Student student4 = new Student(2, "Sumati", 540, "Dundakut");
		Student student5= new Student(17, "Tikili", 505, "Nabara");
		
		List<Student> list = new ArrayList<>();
		list.add(student);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		
		List<Student> ascendingOrder = list.stream().sorted((a1,a2) -> (int) (a1.getMark() - a2.getMark())).collect(Collectors.toList()); 
		System.out.println(ascendingOrder);
//		List<E>
		
	}
	
	

}
