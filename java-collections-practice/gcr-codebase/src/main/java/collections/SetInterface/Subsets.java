package collections.SetInterface;
import java.util.*;

public class Subsets {
	
	static boolean isSubset(Set<Integer> setA, Set<Integer> setB) {
		for (Integer element : setA) {
			if (!setB.contains(element)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Set <Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
		Set <Integer> setB = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("is subSet : "+isSubset(setA, setB));
	}

}
