package com.example.totaltest;

public class PairOfNumber {

	public static void main(String[] args) {
		int[] lo = {2, 1, 4, 3, 6, 8, 5, 10, 0};

		int sum = 10;
		
		for(int i=0;i<lo.length;i++) {
			int ok = lo[i];
			for(int j=i+1;j<lo.length;j++) {
				if(lo[j]==sum -ok) {
					System.out.println(lo[i]+" : "+lo[j]);
				}
			}
		}

	}

}
