package com.tnsif.dayonedemo;

public class jhjfbs {
	public static void main(String[] args) {
		int dividend = 10;
		int[] divisors = { 2, 0, 5 }; // Divisors including a zero for division by zero scenario

		for (int divisor : divisors) {
			int result = dividend / divisor;
			System.out.println("Result of division: " + dividend + " / " + divisor + " = " + result);
		}
	}
}
