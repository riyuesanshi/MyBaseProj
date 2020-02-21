package com.sml.test;

import java.util.Stack;

public class A0007Pro {
	public static int reverse(int x) {

		String s = String.valueOf(x);
		Stack<Character> stack = new Stack<Character>();
		// 默认数字为正数
		boolean flag = true;
		for (char c : s.toCharArray()) {

			stack.add(c);

			if (flag && s.charAt(0) == '-') {
				flag = false;
				stack.pop();
			}
		}

		StringBuffer sb = new StringBuffer();

		if (!flag) {
			sb.append("-");
		}
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
		Integer result;
		try {
			result = Integer.valueOf(sb.toString());
		} catch (Exception e) {
			return 0;
		}
		return (int) result;
	}

	public static void main(String[] args) {
		System.out.println(reverse(1233456789));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.pow(2, 31));
//		System.out.println(Math.pow(2, 31));
	}
}
