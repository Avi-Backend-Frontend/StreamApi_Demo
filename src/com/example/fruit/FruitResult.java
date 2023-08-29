package com.example.fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitResult {

	public static void main(String[] args) {

		List<Fruit> list2 = new ArrayList<>();
		list2.add(new Fruit("Mango", 5, 25));
		list2.add(new Fruit("orange", 4, 85));
		list2.add(new Fruit("banana", 6, 40));
		list2.add(new Fruit("liche", 11, 120));
		
		list2.stream().filter(f->f.getPrice()>35).forEach(s->System.out.println(s));
		System.out.println("************************");
		list2.stream().map(f->f.getPrice()+10).forEach(s->System.out.println(s));
	}

}
