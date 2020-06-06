package com.sml.test;

import java.util.ArrayList;
import java.util.List;

public class A0054Pro {

	public static int[] spiralOrder3(int[][] matrix) {

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return new int[0];
		}
		int rows = matrix.length, columns = matrix[0].length;
		int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
		int[] order = new int[rows * columns];
		int flag = 0;
		while (left <= right && top <= bottom) {
			for (int column = left; column <= right; column++) {
				flag++;
				order[flag] = matrix[top][column];
			}
			for (int row = top + 1; row <= bottom; row++) {
				flag++;
				order[flag] = matrix[row][right];
			}
			if (left < right && top < bottom) {
				for (int column = right - 1; column > left; column--) {
					flag++;
					order[flag] = matrix[bottom][column];
				}
				for (int row = bottom; row > top; row--) {
					flag++;
					order[flag] = matrix[row][left];
				}
			}
			left++;
			right--;
			top++;
			bottom--;
		}
		return order;
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> order = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return order;
		}
		int rows = matrix.length, columns = matrix[0].length;
		int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
		while (left <= right && top <= bottom) {
			for (int column = left; column <= right; column++) {
				order.add(matrix[top][column]);
			}
			for (int row = top + 1; row <= bottom; row++) {
				order.add(matrix[row][right]);
			}
			if (left < right && top < bottom) {
				for (int column = right - 1; column > left; column--) {
					order.add(matrix[bottom][column]);
				}
				for (int row = bottom; row > top; row--) {
					order.add(matrix[row][left]);
				}
			}

			left++;
			right--;
			top++;
			bottom--;
		}
		return order;

	}

	public static List<Integer> spiralOrder2(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return list;
		}
		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int bottom = matrix.length - 1;
		while (left <= right && top <= bottom) {
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			for (int i = top + 1; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			for (int i = right - 1; i >= left; i--) {
				list.add(matrix[bottom][i]);
			}
			for (int i = bottom - 1; i < top; i++) {
				list.add(matrix[i][left]);
			}
			left++;
			right--;
			top++;
			bottom--;
		}
		return list;

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		List<Integer> list = spiralOrder2(matrix);
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}
}
