package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiListOfInteger {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(24);
		list1.add(32);
		list1.add(52);
		list1.add(8);
		
		System.out.println("********square **********");
		list1.stream().map(l->l*l).forEach(h->System.out.println(h));
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream() .mapToInt(x -> x).summaryStatistics(); 
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());
		System.out.println("Count of all number :  "+stats.getCount());
		System.out.println("*****divided by 3***************");
		list1.stream().filter(num -> num % 3 == 0).forEach(System.out::println); 
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println("*************skip****************");
		list.stream().skip(2).forEach(e->System.out.println(e));
		
		
	}

}
