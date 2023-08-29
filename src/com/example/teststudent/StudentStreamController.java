package com.example.teststudent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStreamController {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student(1, "Sandeep", Arrays.asList(123,145,652)),
				new Student(2, "Sanat", Arrays.asList(456,523,963)),new Student(3, "Santanu", Arrays.asList(987,365,845)));
	
	List<Integer> list = studentList.stream().flatMap(o->o.getPhoneNumber().stream()).collect(Collectors.toList());
	System.out.println(list);
	
	List<Integer> list1 = studentList.stream().flatMap(o->o
			.getPhoneNumber().stream()
			).collect(Collectors.toList());
	
	
	
	
	
	
	
	
	}

}
