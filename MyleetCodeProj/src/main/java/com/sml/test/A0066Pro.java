package com.sml.test;

public class A0066Pro {

	public static void main(String[] args) {
		int[] a = { 0 };
		int[] b = plusOne(a);
		printArray(b);
	}

	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		if (digits[length - 1] + 1 < 10) {
			digits[length - 1] = digits[length - 1] + 1;
			return digits;
		}
		int sum = 0;
		for (int i = length - 1; i >= 0; i--) {
			if (i == length - 1) {
				sum = sum + digits[i] + 1;
			} else {
				sum = sum + digits[i];
			}

			digits[i] = sum % 10;
			sum = sum / 10;
			if(sum == 0) {
				return digits;
			}
		}
		if (sum > 0) {
			int[] newdigits = new int[length + 1];
			newdigits[0] = sum;
			for (int i = 0; i < length; i++) {
				newdigits[i + 1] = digits[i];
			}

			return newdigits;
		} else {
			return digits;
		}

	}

	private static void printArray(int[] a) {
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
