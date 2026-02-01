package lexicalTwist;

import java.util.Iterator;

public class Main {
	
	public static boolean isReverse(String str1 , String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		if(str1.contains(" ") || str2.contains(" ")) {
			return false;
		}
//		for(int i = 0,j=str1.length()-1; i <= j ; i++ , j-- ) {
//			if(str1.charAt(i) != (str2.charAt(j))) {
//				continue;
//			}
//		}
		return new StringBuilder(str1).reverse().toString().equals(str2);
	}
	
	public static String isReplace(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0 ; i < sb.length() ; i ++) {
			if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
				sb.setCharAt(i,'@');
			}
		}
		return sb.toString() ;
	}
	
	public static int countVowels(String sb) {
		int count = 0;
		for(int i = 0; i < sb.length() ; i++) {
			if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
	
	public static int countConsonants(String sb) {
		int count = 0;
		for(int i = 0; i < sb.length() ; i++) {
			if(!(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u')) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "olleh";
		
		if(isReverse(str1.toLowerCase(),str2.toLowerCase())) {
			System.out.println(isReplace(str2));
		}else {
			if(countVowels(str1.concat(str2).toLowerCase()) == countConsonants(str1.concat(str2).toLowerCase())) {
				System.out.println("Vowels and consonants are equal");
			}else {
				
			}
		}
	}

}
