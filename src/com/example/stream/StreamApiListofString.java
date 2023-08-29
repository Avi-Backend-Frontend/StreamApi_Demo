package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiListofString {

	public static void main(String[] args) {
		List<String > list = new ArrayList<>();
		list.add("Alok");
		list.add("Swagat");
		list.add("Ratan");
		list.add("Swagat");
		list.add("Tanmay");
		list.add("Sipun");
		System.out.println("***********concat***********");
		List<String> result = list.stream().map(a->a.concat("  Das")).collect(Collectors.toList());
		result.forEach(s->System.out.println(s));
//		li.stream().map(a->a.concat("  Jena")).forEach(d->System.out.println(d));
//		li.stream().map(a->a.concat("  murmu")).forEach(System.out::println);
		
		System.out.println("***********distinct************");
		list.stream().distinct().forEach(s->System.out.println(s));
		
		System.out.println("***********find any************");
		list.stream().findAny().ifPresent(d->System.out.println(d));
		
		System.out.println("***********find first************");
		list.stream().findFirst().ifPresent(f->System.out.println(f));
		
		System.out.println("*********** start latter************");
		list.stream().filter(d->d.startsWith("S")).forEach(k->System.out.println(k));
		
		System.out.println("***********end latter************");
		list.stream().filter(f->f.endsWith("t")).forEach(f->System.out.println(f));
		
		System.out.println("*******sort************");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("******uppercase***********");
		list.stream().map(l->l.toUpperCase()).forEach(System.out::println);
		
		System.out.println("*********toLowerCase**************");
		list.stream().map(l->l.toLowerCase()).forEach(System.out::println);
		
		System.out.println("************length************");
		list.stream().filter(l->l.length()>5).forEach(s->System.out.println(s));
		
		System.out.println("************count************");
		long li1 = list.stream().count();
		System.out.println(li1);
		List<String> list1 = Arrays.asList("abc","","xyz","","hello","hii","");
		
		System.out.println("**********isEmpty**************");
		list1.stream().filter(d->!d.isEmpty()).forEach(d->System.out.println(d));
		
		System.out.println("************limit************");
		list.stream().limit(3).forEach(j->System.out.println(j));
		
		System.out.println("***********reverseOrder*************");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
		
		
	}
}
