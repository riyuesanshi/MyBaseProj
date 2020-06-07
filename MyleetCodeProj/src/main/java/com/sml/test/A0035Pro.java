package com.sml.test;


public class A0035Pro {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 5, 7, 9, 12, 23, 45 };
		System.out.println(searchInsert(nums, 56));
	}

	public static int searchInsert(int[] nums, int target) {

		int result = binarySerach(nums, 0, nums.length-1, target);
		if (result != -1) {
			return result;
		} else {
			int flag = nums.length;
			for (int i = nums.length - 1; i >= 0; i--) {
				if(target  < nums[i]) {
					flag = i;
				}
			}
			return flag;
		}
		

	}

	private static int binarySerach(int[] nums, int begin, int end, int target) {

		while (begin <= end) {
			int med = (end + begin) / 2;
			if (target == nums[med]) {
				return med;
			}
			if (target > nums[med]) {
				return binarySerach(nums, med + 1, end, target);
			} else {
				return binarySerach(nums, begin, med - 1, target);
			}
		}
		return -1;

	}
}
