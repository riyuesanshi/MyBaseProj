package com.sml.test;

public class A0026Pro {

	public static int removeDuplicates(int[] nums) {

		int len = nums.length;
		int sum = len;
		for (int i = 0; i < len - 1; i++) {
			// 将后面的数据与前面的数据比较是否相等
			for (int j = i + 1; j < len; j++) {
				if (nums[j] != nums[i]) {
					sum = sum - j + i + 1;
					// 将后面的数据往前移动
					if (j - i > 1) {
						for (int k = j; k < len; k++) {
							nums[k - j + i + 1] = nums[k];
						}
					}
					len = len - j + i + 1;
					break;
				}
			}
		}
		return sum;
	}

	public static int removeDuplicates2(int[] nums) {

		int len = nums.length;
		int i = 0, j = 1;
		for (; j < len; j++) {
			if (nums[i] != nums[j]) {
				nums[i + 1] = nums[j];
				i = i + 1;
			}
		}
		System.out.println(nums);
		return i+1;
	}

	public static void main(String[] args) {
		int[] i = { 1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 9 };
		System.out.println(removeDuplicates2(i));
	}

}
