package com.sml.test;

public class A0001Pro {

	public int[] twoSum(int[] nums, int target) {
		int[] result = { -1, -1 };
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (target == nums[i] + nums[j]) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

}
