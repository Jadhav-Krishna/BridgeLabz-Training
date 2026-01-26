package collections.ListInterface;
import java.util.*;
public class NthElementfromEnd {
	
	public static <T> T getNthFromEnd(List<T> list, int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("Invalid value of n: " + n);
		}
		Iterator<T> mainPtr = list.iterator();
		Iterator<T> refPtr = list.iterator();
		int count = 0;
		while (count < n) {
			if (!refPtr.hasNext()) {
				throw new IllegalArgumentException("Invalid value of n: " + n);
			}
			refPtr.next();
			count++;
		}
		while (refPtr.hasNext()) {
			mainPtr.next();
			refPtr.next();
		}	
		return mainPtr.next();
		
//		if (n <= 0 || n > list.size()) {
//			throw new IllegalArgumentException("Invalid value of n: " + n);
//		}
//		return list.get(list.size() - n);
	}

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("A", "B", "C", "D", "E");
		int n1 = 2;
		System.out.println("The " + n1 + "th element from the end is: " + getNthFromEnd(stringList, n1));

		List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
		int n2 = 3;
		System.out.println("The " + n2 + "th element from the end is: " + getNthFromEnd(intList, n2));
	}

}
