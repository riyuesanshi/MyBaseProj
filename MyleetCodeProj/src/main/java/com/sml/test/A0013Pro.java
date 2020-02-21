package com.sml.test;

import java.util.HashMap;
import java.util.Map;


public class A0013Pro {
	public int romanToInt(String s) {
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);
    	
        char[] chars = s.toCharArray();
        int sum = 0;
        char tmp = 'a';
        for(char a:chars) {
        	sum = sum + map.get(a);
        	if((a == 'X' || a == 'V') && tmp == 'I') {
        		sum = sum - 2;
        	}
        	if((a == 'L' || a == 'C') && tmp == 'X') {
        		sum = sum - 20;
        	}
        	if((a == 'D' || a == 'M') && tmp == 'C') {
        		sum = sum - 200;
        	}
        	tmp = a;
        }
        return sum;
    }

	public static void main(String[] args) {
		A0013Pro a = new A0013Pro();
		System.out.println(a.romanToInt("IXLXVII"));
	}
}
