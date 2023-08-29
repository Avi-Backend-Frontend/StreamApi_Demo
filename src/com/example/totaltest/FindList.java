package com.example.totaltest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindList {

	public static void main(String[] args) {
		
		int[] list = {2, 5, 9, 3, 9, 9, 3};
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.length; i++) {
			int x = list[i];
			int count1 = 0;
			for (int j = 0; j < list.length; j++) {
				if (list[j]==x) {
					count1++;
				}
			}
			map.put(x,count1);
		}

		System.out.println(map);

	}

}
