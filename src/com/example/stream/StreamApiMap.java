package com.example.stream;

import java.util.HashMap;
import java.util.Map;

public class StreamApiMap {

	public static void main(String[] args) {

		Map<Integer, String> map= new HashMap<>();
		map.put(1 , "  Alok");
		map.put(2, "  Swagat");
		map.put(3, "  Ratan");
		map.put(4, "  Bibek");
		map.put(5, "  Rakash");
		System.out.println("*********equalsIgnoreCase**************");
		map.entrySet().stream().filter(d->d.getValue().equalsIgnoreCase("  alok")).forEach(System.out::println);
		System.out.println("**********equals************");
		map.entrySet().stream().filter(d->d.getValue().equals("  Alok")).forEach(System.out::println);
		System.out.println("******************************");
		map.entrySet().stream().forEach(a->System.out.println(a));
		System.out.println("***********even*************");
		map.entrySet().stream().filter(h->h.getKey()%2==0).forEach(s->System.out.println(s));
		System.out.println("************odd************");
		map.entrySet().stream().filter(h->h.getKey()%2==1).forEach(s->System.out.println(s));
//		map.entrySet().stream().filter(d->d.getKey()%2==0+1).forEach(s->System.out.println(s));
		System.out.println("**********contains**************");
		map.entrySet().stream().filter(d->d.getValue().contains("k")).forEach(s->System.out.println(s));
	}

}
