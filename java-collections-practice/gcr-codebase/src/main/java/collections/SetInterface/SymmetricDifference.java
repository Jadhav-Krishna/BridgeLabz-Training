package collections.SetInterface;
import java.util.*;

public class SymmetricDifference {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
		
		Set<Integer> symmetricDifference = new HashSet<>(set1);
		symmetricDifference.addAll(set2);
		System.out.println("Initial Union: " + symmetricDifference);
		
		Set<Integer> tmp = new HashSet<>(set1);
		tmp.retainAll(set2); // intersection b/w 2 sets
		
		symmetricDifference.removeAll(tmp);
		System.out.println("Symmetric Difference: " + symmetricDifference);
	}
}
