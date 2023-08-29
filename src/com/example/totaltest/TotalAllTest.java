package com.example.totaltest;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.Templates;

public class TotalAllTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 63, 25, 85, 12, 8, 560, 1);

//		IntSummaryStatistics statistics = list.stream().mapToInt(o -> o).summaryStatistics();

//		System.out.print("Maximum number : ");
//		System.out.println(statistics.getMax());
//		
//		System.out.print("minimum number : ");
//		System.out.println(statistics.getMin());
//		
//		System.out.print("total number : ");
//		System.out.println(statistics.getSum());
//		
//		System.out.println("natural Order : ");
//		list.stream().sorted().forEach(s->System.out.println(s));
//		
//		System.out.println("Reverse Order : ");
//		list.stream().sorted(Comparator.reverseOrder()).forEach(o->System.out.println(o));

//		for loop    
//		Maximum number
		int largest = 0;
		for (int i = 0; i < list.size(); i++) {
			if (largest < list.get(i)) {
				largest = list.get(i);
			}
		}
		System.out.println("Maximum number : " + largest);

//		minimum number
		int small = list.size();
		for (int i1 = 0; i1 < list.size(); i1++)
			if (small > list.get(i1)) {
				small = list.get(i1);
			}
		System.out.println("minimum number : " + small);

//      Sum of all number
		int total = 0;
		for (int i1 = 0; i1 < list.size(); i1++) {
			total = total + list.get(i1);
		}
		System.out.println("total number : " + total);

//		ODD
		System.out.println("**********ODD ORDER****************");
		int odd = 0;
		for (int i1 = 0; i1 < list.size(); i1++) {
			if (list.get(i1) % 2 != 0) {
				System.out.println("Odd number : "+list.get(i1));
				odd = odd + list.get(i1);
			}
		}
		System.out.println("Total Odd Number : " + odd);

//		Even
		System.out.println("***********EVEN ORDER***************");
		int even = 0;
		for (int i1 = 0; i1 < list.size(); i1++) {
			if (list.get(i1) % 2 == 0) {
				System.out.println("Even Number : "+list.get(i1));
				even = even+list.get(i1);
			}
		}
		System.out.println("Total Even Number : "+even);
		
//		Ascending
		System.out.println("$$$ Ascending Order $$$");
		int temp = 0;
		for (int g = 0; g < list.size(); g++) {
			for (int h = g + 1; h < list.size(); h++) {
				if (list.get(g) > list.get(h)) {
					temp = list.get(g);
					list.set(g, list.get(h));
					list.set(h, temp);
				}
			}
			System.out.println(list.get(g));
		}

//		Descending
		System.out.println("$$$ Descending Order $$$");
		int temp1 = 0;
		for (int g = 0; g < list.size(); g++) {
			for (int h = g + 1; h < list.size(); h++) {
				if (list.get(g) < list.get(h)) {
					temp1 = list.get(g);
					list.set(g, list.get(h));
					list.set(h, temp1);
				}
			}
			System.out.println(list.get(g));
		}
		
//		Average
		int total1 = 0;
		int average = 0;
		for (int i1 = 0; i1 < list.size(); i1++) {
			total1 = total1 + list.get(i1);
			average = total1/list.size();
		}
		average = total1/list.size();
		System.out.println("Average : "+average);

//		Percentage
		int total2 = 0;
		int percentage = 0;
		for (int i1 = 0; i1 < list.size(); i1++) {
			total2 = total2 + list.get(i1);
			percentage = 100*list.get(1)/total2;
		}
		System.out.println("Percenteg : "+percentage);
	}
}
