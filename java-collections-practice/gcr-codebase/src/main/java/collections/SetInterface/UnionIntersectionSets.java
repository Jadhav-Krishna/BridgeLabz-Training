package collections.SetInterface;
import java.util.*;

public class UnionIntersectionSets {
	
	static Set union(HashSet<Integer> set1, HashSet<Integer> set2) {
		Set<Integer> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		return unionSet;
	}
	
	static Set intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
		Set<Integer> intersectionSet = new HashSet<>(set1);
		intersectionSet.retainAll(set2);
		return intersectionSet;
		
	}

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
		System.out.println("union" + union(set1, set2));
		System.out.println("intersection" + intersection(set1, set2));
	}

}
