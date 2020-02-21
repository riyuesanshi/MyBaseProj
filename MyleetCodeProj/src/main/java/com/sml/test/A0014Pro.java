package com.sml.test;


public class A0014Pro {

	public static String longestCommonPrefix(String[] strs) {

		int i = 0;
		boolean flag = true;
		char tmp;
		StringBuilder sb = new StringBuilder("");
		if(strs.length == 0) {
			return "";
		}
		while (flag && (i < strs[0].length())) {
			tmp = strs[0].charAt(i);
			for (String a : strs) {
				if ((i >= a.length()) || (i < a.length() && tmp != a.charAt(i))) {
					flag = false;
					break;
				}
			}
			if(!flag) {
				break;
			}
			sb.append(tmp);
			i++;
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String[] s = { "saaaaaaaaaaaaaaaa","safsf", "asa","safdsdfd", "sa" };
		System.out.println(longestCommonPrefix(s));
	}

}
