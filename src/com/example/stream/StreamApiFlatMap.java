package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiFlatMap {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

		list.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);

		// Creating a list of Prime Numbers
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

		// Creating a list of Odd Numbers
		List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

		// Creating a list of Even Numbers
		List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

		List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

		System.out.println("The Structure before flattening is : " + listOfListofInts);

		// Using flatMap for transformating and flattening.
		List<Integer> listofInts = listOfListofInts.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

		System.out.println("The Structure after flattening is : " + listofInts);

	}

}
