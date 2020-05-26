package com.sml.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * ����һ�� û���ظ� ���ֵ����У����������п��ܵ�ȫ����
 * @author minglei
 *
 */
public class A0046Pro {

	public void backtrack(int n, ArrayList<Integer> output, List<List<Integer>> res, int first) {
		// ��������������
		if (first == n)
			res.add(new ArrayList<Integer>(output));
		for (int i = first; i < n; i++) {
			// ��̬ά������
			Collections.swap(output, first, i);
			// �����ݹ�����һ����
			backtrack(n, output, res, first + 1);
			// ��������
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
