package com.example.stream;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {

//		 Stream of 0 – 9
		Stream.iterate(0, n -> n + 1).limit(10).forEach(x -> System.out.println(x));
		System.out.println("********************");
//		Stream of odd numbers only.
		Stream.iterate(0, n -> n + 1).filter(x -> x % 2 != 0) // odd
				.limit(10).forEach(x -> System.out.println(x));

	}

}
