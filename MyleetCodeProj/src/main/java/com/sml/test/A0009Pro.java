package com.sml.test;

public class A0009Pro {

	public static boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}

		int a, b, sum = 0;
		a = x;

		while (a / 10 != 0) {
			b = a % 10;
			a = a / 10;
			sum = 10 * sum + b;
		}

		return sum * 10 + a == x ? true : false;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(1));
	}
}
