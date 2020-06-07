package com.sml.test;

import java.util.ArrayList;
import java.util.List;

public class A0119Pro {

	public static void main(String[] args) {
		List<Integer> list = getRow(5);
		for(Integer i : list) {
			System.out.print(i + " ");
		}
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		if (rowIndex == 0)
			return list;
		list.add(1);
		if (rowIndex == 1)
			return list;
		List<Integer> tmp = list;
		for (int i = 1; i < rowIndex; i++) {
			tmp = generanteNLine(tmp);
		}
		return tmp;
		
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
