import java.util.*;

class StringCompare{

	static boolean compareString(String str1, String str2){
		for(int i = 0 ; i < str1.length() ; i++ ){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}

	static boolean compareStringEquals(String str1, String str2){
		if(str1.equals(str2)){
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if(compareString(str1,str2) && compareStringEquals(str1,str2)){
			System.out.print("Both results are equal");
		}else{
			System.out.print("Both results are not equal");
		}
	}
}