package org.bridgelabz.linearAndBinarysearch.stringbuilder;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("string : ");
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println("Reversed String : " + sb.toString());
		sc.close();
	}
}
