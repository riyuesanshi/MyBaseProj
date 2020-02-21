package com.sml.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class A0020Pro {
	public static boolean isValid(String s) {
		
		if (s == null || s.length() == 0) {
			return true;
		}
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');

		char[] cs = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : cs) {
			if (map.containsValue(c)) {
				stack.add(c);
			}
			if (map.containsKey(c)) {
				if (stack.size() == 0 || stack.pop() != map.get(c)) {
					return false;
				}
			}
		}
		if (stack.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		String s = "((((([[[[[{{{{{{)))))]]]]]";
		System.out.println(isValid(s));
	}
}
