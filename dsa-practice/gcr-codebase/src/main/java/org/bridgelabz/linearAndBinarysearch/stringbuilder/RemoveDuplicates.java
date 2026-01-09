package org.bridgelabz.linearAndBinarysearch.stringbuilder;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("string : ");
		String s = sc.next();
		
		StringBuilder result = new StringBuilder();
		HashSet<Character> set = new HashSet<>();

		char[] ch = s.toCharArray();
		
		for(char c : ch) {
			if(!set.contains(c)) {
				result.append(c);	
				set.add(c);
			}
		}
		
		System.out.println("Resulted string : " + result.toString());

		sc.close();
	}
}
