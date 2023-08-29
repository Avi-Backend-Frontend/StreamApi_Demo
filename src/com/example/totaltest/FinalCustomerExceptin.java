package com.example.totaltest;

public class FinalCustomerExceptin {

	public static void main(String[] args) {
		try {
			throw new InvalidException();
		}catch(InvalidException e) {
			System.out.println("Hii Every one");
			
		}
	}

}
