package com.sml.test;

import javax.security.auth.Subject;

public class A0974Pro {

	public static int subarraysDivByK(int[] A, int K) {
		int subNum = 0;
		int sum = 0;
		int length = A.length;
		for (int i = 0; i < length; i++) {
			sum = A[i];
			if (sum % K == 0) {
				subNum++;
			}
			for (int j = i + 1; j < length; j++) {
				sum = sum + A[j];
				if (sum % K == 0) {
					subNum++;
				}
			}
		}

		return subNum;
	}

	public static int subarraysDivByK2(int[] A, int K) {
		int length = A.length;
		int subNum = 0;
		for (int i = 0; i < length; i++) {
			if (A[i] % K == 0) {
				A[i] = 1;
			} else {
				A[i] = 0;
			}
		}
		int begin = 0;
		int end = 0;
		boolean flag = true;
		for (int i = 0; i < length; i++) {
			if (flag) {
				if (A[i] == 0) {
					continue;
				} else {
					begin = i;
					i = i + 1;
					flag = false;
				}
			}
			if (!flag) {
				if (A[i] == 1) {
					continue;
				} else {
					end = i;
					flag = true;
					subNum = jieCheng(end - begin + 1);
					i++;
				}
			}
		}
		return subNum;
	}

	private static int jieCheng(int n) {
		if (1 == n) {
			return 1;
		} else {
			return n * jieCheng(n - 1);
		}
	}

	public static void main(String[] args) {
		int[] a = { 4, 5, 0, -2, -3, 1 };
		System.out.println(subarraysDivByK2(a, 5));
		System.out.println(-12 % 3);
	}
}
