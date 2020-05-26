package com.sml.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个包含 n + 1 个整数的数组 nums， 其数字都在 1 到 n 之间（包括 1 和 n）， 可知至少存在一个重复的整数。假设只有一个
 * 重复的整数，找出这个重复的数。
 * 
 * @author minglei
 *
 */
public class A0287Pro {

	public int findDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : nums) {
			if (map.get(n) != null) {
				return n;
			} else {
				map.put(n, n);
			}
		}
		return -1;
	}

	public int findDuplicate2(int[] nums) {
		int length = nums.length - 1;
		int[] newNums = new int[length];
		for (int i = 0; i < length; i++) {
			newNums[i] = 0;
		}
		for (int i = 0; i < length + 1; i++) {
			if (newNums[i] != 0) {
				return newNums[i];
			} else {
				newNums[i] = nums[i];
			}
		}
		return -1;
	}
}
