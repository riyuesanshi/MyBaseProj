package com.sml.test;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class A0038Pro {

	public static void main(String[] args) {
		System.out.println(countAndSay(1));
		System.out.println(countAndSay(2));
		System.out.println(countAndSay(3));
		System.out.println(countAndSay(4));
		System.out.println(countAndSay(5));
		System.out.println(countAndSay(6));
	}

	public static String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		if (n == 2) {
			return "11";
		}
		return covertString(countAndSay(n - 1));

	}

	private static String covertString(String s) {
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			Integer k = Integer.valueOf(String.valueOf(chars[i]));
			int sum = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (k == Integer.valueOf(String.valueOf(chars[j]))) {
					sum++;
				} else {
					break;
				}
			}
			sb.append(sum).append(k);
			i = i + sum - 1;
		}
		return sb.toString();
	}

}
