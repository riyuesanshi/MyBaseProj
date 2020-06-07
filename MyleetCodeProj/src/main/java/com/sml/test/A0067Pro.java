package com.sml.test;

import java.util.Stack;

public class A0067Pro {

	public static void main(String[] args) {
		String a = "1";
		String b = "111";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {

		char[] achars = a.toCharArray();
		char[] bchars = b.toCharArray();

		Stack<Integer> stack = new Stack<Integer>();

		int alength = achars.length;
		int blength = bchars.length;

		int min = Math.min(alength, blength);

		int sum = 0;
		for (int i = 1; i < min + 1; i++) {
			sum = sum + Integer.valueOf(String.valueOf(achars[alength - i]))
					+ Integer.valueOf(String.valueOf(bchars[blength - i]));
			stack.add(sum % 2);
			sum = sum / 2;
		}
		if (alength > blength) {
			for (int i = alength - blength - 1; i >= 0; i--) {
				sum = sum + Integer.valueOf(String.valueOf(achars[i]));
				stack.add(sum % 2);
				sum = sum / 2;
			}
		}
		if (alength < blength) {
			for (int i = blength - alength - 1; i >= 0; i--) {
				sum = sum + Integer.valueOf(String.valueOf(bchars[i]));
				stack.add(sum % 2);
				sum = sum / 2;
			}
		}
		if (sum == 1) {
			stack.add(1);
		}

		StringBuilder sb = new StringBuilder();
		while (stack.size() > 0) {
			sb.append(stack.pop());
		}

		return sb.toString();
	}

}
