package com.example.Optional;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class OptionalStringApi {

	public static void main(String[] args) {

		Customers customer = new Customers(12, "jadu", "test@123",Arrays.asList("1020301020","1231231230"));
		
		Optional<Object> optional = Optional.ofNullable(customer.getEmail());
		System.out.println(optional);
		
		
		Optional<Object> optional1 = Optional.of(customer.getId());
		System.out.println(optional1);
		
		
		Optional<Object> optional2 = Optional.ofNullable(customer.getId());
		System.out.println(optional2);
		
		String str = "Stream Api ";
		Optional<Object> optional3 = Optional.ofNullable(str);
		System.out.println(optional3);
		
		String[] list = {"String","long","Double","Integer",null};
		Optional<Object> optional4 = Optional.of(list[2]);
		System.out.println(optional4);
		
		Optional<Object> op = Optional.ofNullable(list[4]);
		System.out.println(op.orElse("Defult"));
		
		List<Integer> li = Arrays.asList(10,20,25,4,6,8,12);
		IntSummaryStatistics statistics = li.stream().mapToInt(l->l).summaryStatistics();
		
		
	}

}
