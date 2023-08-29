package com.example.student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalStream {

	public static void main(String[] args) {

		List<Integer> listint = Arrays.asList(10,20,50,40,41,3,8);
		
		System.out.println("**************************************");
		Optional<Integer> max = listint.stream().reduce((a1,a2) ->a1>a2 ? a1:a2);
		System.out.println(max);
		
		System.out.println("***************************************");
		Optional<Integer> min = listint.stream().reduce((a1,a2) -> a1<a2 ? a1:a2);
		System.out.println(min);
		
		System.out.println("*****************************************");
		Optional<Integer> sum = listint.stream().reduce((a1,a2) -> a1+a2);
		System.out.println(sum);
		
		
		
		
	}

}
