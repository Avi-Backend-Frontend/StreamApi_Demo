package com.example.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.Optional.Customers;


public class GroupingBy {

	public static void main(String[] args) {
		Customer cu = new Customer(103, "Laxmi", "math", 10);
		Customer cu1 = new Customer(105, "Alok", "eng", 20);
		Customer cu2 = new Customer(108, "Bapi", "bio", 30);
		Customer cu3 = new Customer(110, "Rakesh", "math", 25);
		Customer cu4 = new Customer(115, "Gautam", "bio", 5);
		Customer cu5 = new Customer(118, "Natu", "math", 18);
		Customer cu6 = new Customer(120, "Sipun", "eng", 15);
		Customer cu7 = new Customer(121, "Asit", "mil", 55);
		
		List<Customer> list = Arrays.asList(cu,cu1,cu2,cu3,cu4,cu5,cu6,cu7);
		
		Map<Customer, Long> ok = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(ok);
		
		System.out.println("******************************************");
		Map<Object, List<Customer>> okk = list.stream().collect(Collectors.groupingBy(student->student.getPrice()));
		System.out.println(okk);
		
		System.out.println("***************************************");
		Map<String, Double> resultMap = list.stream().collect(Collectors
				.groupingBy(Customer::getBook,Collectors.summingDouble(Customer::getPrice)));
		System.out.println(resultMap);
		
		Map<Object, Set<Customer>> map = list.stream().collect(Collectors.groupingBy(s->s.getSlNumber(),Collectors.toSet()));
		System.out.println(map);
		
		Map<Object, List<String>> map1 = list.stream().collect(Collectors.groupingBy(e->e.getSlNumber(),Collectors.mapping(Customer::getName,Collectors.toList())));
		System.out.println(map1);
	}

}
