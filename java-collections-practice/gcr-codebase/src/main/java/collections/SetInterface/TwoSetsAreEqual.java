package collections.SetInterface;
import java.util.*;

public class TwoSetsAreEqual {
	
	static boolean areEqual(HashSet<Integer> set1, HashSet<Integer> set2) {
		if (set1.size() != set2.size()) {
			return false;
		}
		for (Integer element : set1) {
			if (!set2.contains(element)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(5, 4, 3, 2, 1));
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		boolean areEqual = set1.equals(set2);
		System.out.println("sets equal? " + areEqual);
		
	}

}
