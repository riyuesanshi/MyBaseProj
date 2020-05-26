package com.sml.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ����һ������ n + 1 ������������ nums�� �����ֶ��� 1 �� n ֮�䣨���� 1 �� n���� ��֪���ٴ���һ���ظ�������������ֻ��һ��
 * �ظ����������ҳ�����ظ�������
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
