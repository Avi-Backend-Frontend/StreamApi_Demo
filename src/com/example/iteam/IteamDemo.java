package com.example.iteam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

//import com.example.Optional.Customer;

public class IteamDemo {

	public static void main(String[] args) {
		
		Iteam ob= new Iteam("apple", 10, new BigDecimal("9.99"));
		Iteam ob1= new Iteam("banana", 20, new BigDecimal("19.99"));
		Iteam ob2= new Iteam("orang", 10, new BigDecimal("29.99"));
		Iteam ob3= new Iteam("watermelon", 10, new BigDecimal("29.99"));
		Iteam ob4= new Iteam("papaya", 20, new BigDecimal("9.99"));
		Iteam ob5= new Iteam("apple", 10, new BigDecimal("9.99"));
		Iteam ob6= new Iteam("banana", 10, new BigDecimal("19.99"));
		Iteam ob7= new Iteam("apple", 20, new BigDecimal("9.99"));
		
		List<Iteam> items = new ArrayList<>();
		items.add(ob);
		items.add(ob1);
		items.add(ob2);
		items.add(ob3);
		items.add(ob4);
		items.add(ob5);
		items.add(ob6);
		items.add(ob7);

		Map<Integer, Long> map3 =items.stream().filter(o->o.getName()=="apple").collect(Collectors.groupingBy(Iteam::getQty,Collectors.counting()));
		System.out.println(map3);
		
		System.out.println("***************************");
		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Iteam::getName, Collectors.counting()));

		System.out.println(counting);

		System.out.println("**********************");
		Map<String, Integer> sum = items.stream()
				.collect(Collectors.groupingBy(Iteam::getName, Collectors.summingInt(Iteam::getQty)));

		System.out.println(sum);
		
		System.out.println("*******************************");
		
		Map<Integer ,List<String>> map1 = items.stream().collect(Collectors.groupingBy(Iteam::getQty, Collectors.mapping(Iteam::getName, Collectors.toList())));
		System.out.println(map1);
		System.out.println("**********1******************");
		
		Map<String, Double> map11 = items.stream().collect(Collectors.groupingBy(Iteam::getName,Collectors.averagingLong(Iteam::getQty)));
		System.out.println(map11);
		
		
		
		
		
		
		
	}

}
