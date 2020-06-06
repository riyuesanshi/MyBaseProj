package com.sml.test;

import java.util.HashSet;

public class A0128Pro {
	
	public static void main(String[] args) {
		int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
		System.out.println(longestConsecutive(nums));
		
	}
	
	public static int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			set.add(i);
		}
		int longestLength = 0;
		for(Integer a : set) {
			if(!set.contains(a-1)) {
				int currentLength = 1;
				while(set.contains(a+1)) {
					currentLength++;
					a++;
				}
				longestLength = Math.max(currentLength, longestLength);
			}
		}
		return longestLength;
    }

}
