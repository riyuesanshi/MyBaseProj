package com.sml.test;

public class A0005Pro {

	// 暴力解法
	public static String longestPalindrome2(String s) {
		int length = s.length();
		int begin = 0;
		int end = 0;
		for (int i = 1; i < length; i++) {
			// 回文串是奇数
			int halfMaxLength = Math.min(i - 1, length - i - 1);
			for (int j = 0; j < halfMaxLength; j++) {
				if (isPalindrome(s.substring(i - halfMaxLength, i + halfMaxLength + 1))
						&& ((end - begin) < (2 * j + 1))) {
					begin = i - j;
					end = i + j + 1;
				}
			}
			// 回文数是偶数
//			for (int j = 0; j < Math.min(i - 1, length - i + 1); j++) {
//				if (isPalindrome(s.substring(i - j, i + j + 2)) && ((end - begin) < (2 * j + 2))) {
//					begin = i - j;
//					end = i + j + 2;
//				}
//			}

		}
		return s.substring(begin, end);

	}

	private static boolean isPalindrome(String s) {
		char[] c = s.toCharArray();
		int i = 0;
		int j = c.length - 1;
		while (i < j) {
			if (c[i] != c[j]) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		if (i == j || i > j) {
			return true;
		}
		return false;
	}

	public static String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		// 保存起始位置，测试了用数组似乎能比全局变量稍快一点
		int[] range = new int[2];
		char[] str = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			// 把回文看成中间的部分全是同一字符，左右部分相对称
			// 找到下一个与当前字符不同的字符
			i = findLongest(str, i, range);
		}
		return s.substring(range[0], range[1] + 1);
	}

	public static int findLongest(char[] str, int low, int[] range) {
		// 查找中间部分
		int high = low;
		while (high < str.length - 1 && str[high + 1] == str[low]) {
			high++;
		}
		// 定位中间部分的最后一个字符
		int ans = high;
		// 从中间向左右扩散
		while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
			low--;
			high++;
		}
		// 记录最大长度
		if (high - low > range[1] - range[0]) {
			range[0] = low;
			range[1] = high;
		}
		return ans;
	}

	public static void main(String[] args) {
//		String test = "addefsdfffffrrrffffasdfsa3afdssdffds";
//		System.out.println(longestPalindrome(test));
		System.out.println(isPalindrome("abcsfscba"));
		System.out.println(longestPalindrome2("abcsfscba"));
	}
}
