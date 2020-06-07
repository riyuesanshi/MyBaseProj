package com.sml.test;

public class A0028Pro {

	public static void main(String[] args) {
		String haystack = "aaa";
		String needle = "aaa";
		System.out.println(strStr(haystack, needle));
		System.out.println(strStr2(haystack, needle));

	}

	public static int strStr(String haystack, String needle) {

		char[] haychars = haystack.toCharArray();
		char[] needleChars = needle.toCharArray();
		if (needle.equals("")) {
			return 0;
		}
		if (needleChars.length > haychars.length) {
			return -1;
		}
		for (int i = 0; i < haychars.length; i++) {
			int beginFlag = i;
			int begin = i;
			for (int j = 0; j < needleChars.length; j++) {
				if (haychars.length - beginFlag < needleChars.length) {
					return -1;
				}
				if (!(haychars[begin] == needleChars[j])) {
					break;
				} else {
					begin++;
				}

				if (j == (needleChars.length - 1)) {
					return beginFlag;
				}
			}
		}
		return -1;
	}

	public static int strStr2(String haystack, String needle) {
		int m = haystack.length();
		int n = needle.length();
		for (int i = 0; i < m - n + 1; i++) {
			if (haystack.substring(i, i + n).equals(needle)) {
				return i;
			}
		}
		return -1;
	}
}
