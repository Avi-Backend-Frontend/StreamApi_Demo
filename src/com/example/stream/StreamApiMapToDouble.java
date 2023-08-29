package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class StreamApiMapToDouble {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("CSE", "JAVA", "gfg", "C++", "C");

		list.stream().mapToDouble(str -> str.length() * str.length()).forEach(System.out::println);
	}

}
