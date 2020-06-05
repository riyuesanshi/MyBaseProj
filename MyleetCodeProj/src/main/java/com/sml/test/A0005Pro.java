package com.sml.test;

public class A0005Pro {

	// �����ⷨ
	public static String longestPalindrome2(String s) {
		int length = s.length();
		int begin = 0;
		int end = 0;
		for (int i = 1; i < length; i++) {
			// ���Ĵ�������
			int halfMaxLength = Math.min(i - 1, length - i - 1);
			for (int j = 0; j < halfMaxLength; j++) {
				if (isPalindrome(s.substring(i - halfMaxLength, i + halfMaxLength + 1))
						&& ((end - begin) < (2 * j + 1))) {
					begin = i - j;
					end = i + j + 1;
				}
			}
			// ��������ż��
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
		// ������ʼλ�ã��������������ƺ��ܱ�ȫ�ֱ����Կ�һ��
		int[] range = new int[2];
		char[] str = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			// �ѻ��Ŀ����м�Ĳ���ȫ��ͬһ�ַ������Ҳ�����Գ�
			// �ҵ���һ���뵱ǰ�ַ���ͬ���ַ�
			i = findLongest(str, i, range);
		}
		return s.substring(range[0], range[1] + 1);
	}

	public static int findLongest(char[] str, int low, int[] range) {
		// �����м䲿��
		int high = low;
		while (high < str.length - 1 && str[high + 1] == str[low]) {
			high++;
		}
		// ��λ�м䲿�ֵ����һ���ַ�
		int ans = high;
		// ���м���������ɢ
		while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
			low--;
			high++;
		}
		// ��¼��󳤶�
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
