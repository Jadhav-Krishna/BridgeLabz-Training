package org.scenario.M1;

public class StringManipulation {
	
	static boolean isValid(String str) {
		return (str.matches("[a-zA-Z]+"));
	}
	
	static int strSize(String str) {
		return str.length();
	}
	
	static char[] ascii(String str) {
		int j = 0;
		char[] rev = new char[strSize(str)];
		char[] as =  str.toCharArray();
		for (int i = 0 ; i < strSize(str) ; i++) {
			if(as[i]%2 != 0) {
				rev[j] = as[i];
				j++;
			}
		}
		for (int i = 0, k = j - 1; i < k; i++, k--) {
			char temp = rev[i];
			rev[i] = rev[k];
			rev[k] = temp;
		}
		return rev;
	}
	
	static String convertStr(char[] rev) {
		String str="";
		for (int i = 0 ; i < rev.length ; i++) {
			if(i%2 == 0) {
				str+=String.valueOf(rev[i]).toUpperCase();
			}else {
				str+=String.valueOf(rev[i]);
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		String str = "aeroplane";
		
		if(isValid(str)) {
			if(strSize(str) >= 6) {
				System.out.println(convertStr(ascii(str)));
			}else {
				System.out.println("Invalid String");
			}
		}else {
			System.out.println("Invalid String");
		}
	}
}
