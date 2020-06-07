package com.sml.test;

import java.util.ArrayList;
import java.util.List;

public class A0118Pro {

	public static void main(String[] args) {
		List<List<Integer>> tmpList = generate(5);
		for(List<Integer> a : tmpList) {
			for(Integer i : a) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(numRows == 0) {
			return list;
		}
		List<Integer> list1th = new ArrayList<Integer>();
		list1th.add(1);
		list.add(list1th);
		if(numRows == 1) {
			return list;
		}
		List<Integer> list2th = new ArrayList<Integer>();
		list2th.add(1);
		list2th.add(1);
		list.add(list2th);
		if(numRows == 2) {
			return list;
		}
		for (int i = 2; i < numRows; i++) {
			List<Integer> tmp = new ArrayList<Integer>();
			tmp = generanteNLine(list.get(list.size()-1));
			list.add(tmp);
		}
		
		return list;

	}

	private static List<Integer> generanteNLine(List<Integer> list) {
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		for (int i = 0; i < list.size() - 1; i++) {
			list2.add(list.get(i) + list.get(i + 1));
		}
		list2.add(1);
		return list2;
	}
}
