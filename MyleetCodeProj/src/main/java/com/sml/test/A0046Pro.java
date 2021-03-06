package com.sml.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列
 * @author minglei
 *
 */
public class A0046Pro {

	public void backtrack(int n, ArrayList<Integer> output, List<List<Integer>> res, int first) {
		// 所有数都填完了
		if (first == n)
			res.add(new ArrayList<Integer>(output));
		for (int i = first; i < n; i++) {
			// 动态维护数组
			Collections.swap(output, first, i);
			// 继续递归填下一个数
			backtrack(n, output, res, first + 1);
			// 撤销操作
			Collections.swap(output, first, i);
		}
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int num : nums) {
			output.add(num);
		}
		int n = nums.length;
		backtrack(n, output, res, 0);
		return res;

	}

	public static void main(String[] args) {
		
		
	}

}
