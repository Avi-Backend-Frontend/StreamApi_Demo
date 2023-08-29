//package com.example.Optional;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class CustomerResult {
//
//	public static void main(String[] args) {
//
//		Customer cus = new Customer(109, "Rama", "rama123@gamil.com",Arrays.asList("2020202020","1010101010"));
//		Customer cus1 = new Customer(102, "Hari", "haria123@gamil.com",Arrays.asList("2020202020","1010101010"));
//		Customer cus2 = new Customer(108, "Madhu", "madhu143@gamil.com",Arrays.asList("2020202020","1010101010"));
//		Customer cus3 = new Customer(106, "Jadu", "jadu1234@gamil.com",Arrays.asList("2020202020","1010101010"));
//		Customer cus4 = new Customer(103, "Gopal", "gopal10@gamil.com",Arrays.asList("2020202020","1010101010"));
//		
//		List<Customer> list = new ArrayList<>();
//		list.add(cus);
//		list.add(cus1);
//		list.add(cus2);
//		list.add(cus3);
//		list.add(cus4);
//		System.out.println(list);
//		System.out.println("******************************************");
//		Map<Integer,List<Customer>> okk = list.stream().collect(Collectors.groupingBy(student->student.getId()));
//		System.out.println(okk);
//		
//		
//		
//	}
//
//}
