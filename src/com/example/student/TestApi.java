package com.example.student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestApi {

	public static void main(String[] args) {
		List<Integer> listint = Arrays.asList(20,10,21,5,9);
		
		Optional<Integer> max = listint.stream().reduce((a1,a2) -> a1>a2 ?a1:a2);
		System.out.println(max.get());
		
		Optional<Integer> sum = listint.stream().reduce((a1,a2) -> a1+a2 );
		System.out.println(sum.get());
		
		Optional<Integer> min = listint.stream().reduce((a1,a2) -> a1<a2 ?a1:a2);
		System.out.println(min);
		
		List<String> list = Arrays.asList("Rakesh","Bapi","Laxmi","Saroj","Laxmi");
		
		Map<Object, List<String>> li = list.stream().collect(Collectors.groupingBy(i->i));
		System.out.println(li);
		
		Map<String, Long> li2 = list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(li2);
		
//		Map<String, Long> li3 = list.stream().collect(Collectors)
		
		
	}

}
