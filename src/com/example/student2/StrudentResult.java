package com.example.student2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StrudentResult {
	public static void main(String[] args) {
		List<Student> filteredList = new ArrayList<>();
		List<Student> studentsList = Arrays.asList(new Student("Raj", "Nabara", "Raghu"),
				new Student("Hari", "Singla", "Chinu"), new Student("Sanoj", "Nabara", "Puna"),
				new Student("hari", "Ramu", "raghu"), new Student("Gautam", null, "Raja"));
		for(Student student : studentsList)
			System.out.println(student);
		for (int i = 0; i <= 4; i++) {
			String address = studentsList.get(i).getAddress();
			Optional<String> optional = Optional.of(address);
			if (optional.equals("Nabara")) {
				filteredList.add(studentsList
						.get(i));
			}
		}
		System.out.println("");
		for(Student student : filteredList) {
//		Optional<Student> optional = Optional.ofNullable(student);
			System.out.println(student);
		}

		
	}
}