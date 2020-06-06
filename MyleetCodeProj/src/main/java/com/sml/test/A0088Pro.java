package com.sml.test;

public class A0088Pro {

	public static void main(String[] args) {
		int[] nums1 = { 2, 0 };
		int[] nums2 = { 1 };
		merge(nums1, 1, nums2, 1);
		for (int a : nums1) {
			System.out.println(a + " ");
		}

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
		}
		int length = m;
		for (int i = 0; i < n; i++) {
			for (int j = length; j > 0; j--) {
				if (nums2[i] < nums1[j - 1]) {
					nums1[j] = nums1[j - 1];
					if(j-1 == 0) {
						nums1[0] = nums2[i];
						length++;
					}
				} else {
					nums1[j] = nums2[i];
					length++;
					break;
				}
			}

		}
	}
}
