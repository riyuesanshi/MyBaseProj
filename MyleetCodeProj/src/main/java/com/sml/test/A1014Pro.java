package com.sml.test;

public class A1014Pro {
	
	public static void main(String[] args) {
		int[] A = {8,1,5,2,6};
		System.out.println(maxScoreSightseeingPair2(A));
	}
	
	public static int maxScoreSightseeingPair(int[] A) {
		int length = A.length;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0;i< length;i++) {
			for(int j = i+1;j<length;j++) {
				sum = A[i]+A[j] + i -j;
				max = Math.max(max, sum);
			}
		}
		return max;	
    }
	
	public static int maxScoreSightseeingPair2(int[] A) {
		int length = A.length;
		int leftMax = A[0];
		int sum = Integer.MIN_VALUE;
		for(int i = 1;i< length;i++) {
			leftMax = Math.max(leftMax,A[i-1]+i-1);
			sum = Math.max(leftMax+A[i]-i, sum);
		}
		return sum;	
    }

}
