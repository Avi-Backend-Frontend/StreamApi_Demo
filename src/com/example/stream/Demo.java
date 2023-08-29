	package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		List<String > list = new ArrayList<>();
		list.add("Alok");
		list.add("Swagat");
		list.add("Ratan");
		list.add("Swagat");
		list.add("Tanmay");
		list.add("Sipun");
		
		list.stream().map(l->l.concat("  Das")).forEach(System.out::println);
		list.stream().map(d->d.toUpperCase()).forEach(System.out::println);
		list.stream().map(a->a.toLowerCase()).forEach(System.out::println);
		list.stream().filter(a->!a.isEmpty()).forEach(System.out::println);
		list.stream().filter(d->d.startsWith("A")).forEach(System.out::println);
		list.stream().filter(r->r.endsWith("n")).forEach(System.out::println);
		list.stream().filter(r->r.length()>5).forEach(System.out::println);
		list.stream().filter(d->d.equals("Alok")).forEach(System.out::println);
		list.stream().filter(s->s.equalsIgnoreCase("alok")).forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
		list.stream().findFirst().ifPresent(s->System.out.println(s));
		list.stream().findAny().ifPresent(s->System.out.println(s));
		list.stream().limit(2).forEach(System.out::println);
		list.stream().skip(3).forEach(System.out::println);
		list.stream().sorted().forEach(System.out::println);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		List<Integer> list1 = Arrays.asList(2,5,8,6,56,45,73,12);
		IntSummaryStatistics statistics = list1.stream().mapToInt(t->t).summaryStatistics();
		System.out.println(statistics.getMin());
		System.out.println(statistics.getMax());
		System.out.println(statistics.getSum());
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getCount());
		
		long lo = list1.stream().count();
		System.out.println(lo);
		
//		Map<Integer, String> map = 
		

	}

}
